package com.company;

import com.company.sakila.SakilaApplication;
import com.company.sakila.SakilaApplicationBuilder;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film.FilmManager;

import java.util.Optional;
import java.util.stream.Stream;

import static com.speedment.runtime.core.ApplicationBuilder.LogType.STREAM;

public class SakilaExample {
    private SakilaApplication app;
    private FilmManager films;

    public SakilaExample() {
        app = new SakilaApplicationBuilder()
            .withPassword("sakila")
            .withLogging(STREAM)
            .build();

        films = app.getOrThrow(FilmManager.class);
    }

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

        stop();
    }
}
