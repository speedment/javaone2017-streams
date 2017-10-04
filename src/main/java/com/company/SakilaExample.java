package com.company;

import com.company.sakila.SakilaApplication;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film.FilmManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PreDestroy;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
public class SakilaExample {

    private @Autowired SakilaApplication app;
    private @Autowired FilmManager films;

    private Stream<Film> getFilmsByRating(String rating) {
        return films.stream()
            .filter(Film.RATING.equalIgnoreCase(rating));
    }

    private long countFilmsByRating(String rating) {
        return getFilmsByRating(rating).count();
    }

    private Optional<String> getTitleOfFilm(int filmID) {
        return films.stream()
            .filter(Film.FILM_ID.equal(filmID))
            .map(Film::getTitle)
            .findAny();
    }

    private Stream<Film> search(Stream<Film> stream, String keyWord) {
        return stream.filter(
            Film.TITLE.containsIgnoreCase(keyWord).or(
                Film.DESCRIPTION.containsIgnoreCase(keyWord)
            ));
    }

    private Map<String, Long> groupByRating(String keyWord) {
        return search(films.stream(), keyWord)
            .collect(
                Collectors.groupingBy(
                    Film.RATING.getter(),
                    Collectors.counting()
                )
            );
    }

    @PreDestroy
    private void stop() {
        app.stop();
    }

    public void runExample() {
        long pg13FilmCount = countFilmsByRating("PG-13");
        System.out.printf("There are %d PG-13 films%n", pg13FilmCount);

        int id = 7;
        Optional<String> title = getTitleOfFilm(id);
        if (title.isPresent()) {
            System.out.printf("The film with id %d has the title %s%n",
                id,
                title.get());
        } else {
            System.out.println("There is no such film");
        }

        long pg13redFilmCount = search(getFilmsByRating("PG-13"), "red").count();
        System.out.printf("There are %d 'RED' PG-13 films%n", pg13redFilmCount);


        System.out.println("Considering 'RED' films, ");
        groupByRating("red").forEach(
            (rating, count) ->
                System.out.printf(" - there are %d %s films%n", count, rating)
        );

        stop();
    }
}
