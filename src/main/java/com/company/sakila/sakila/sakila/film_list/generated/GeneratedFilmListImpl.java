package com.company.sakila.sakila.sakila.film_list.generated;

import com.company.sakila.sakila.sakila.film_list.FilmList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;
import java.math.BigDecimal;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.sakila.sakila.film_list.FilmList}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmListImpl implements FilmList {
    
    private Integer fid;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
    private Integer length;
    private String rating;
    private String actors;
    
    protected GeneratedFilmListImpl() {
        
    }
    
    @Override
    public OptionalInt getFid() {
        return OptionalUtil.ofNullable(fid);
    }
    
    @Override
    public Optional<String> getTitle() {
        return Optional.ofNullable(title);
    }
    
    @Override
    public Optional<String> getDescription() {
        return Optional.ofNullable(description);
    }
    
    @Override
    public String getCategory() {
        return category;
    }
    
    @Override
    public Optional<BigDecimal> getPrice() {
        return Optional.ofNullable(price);
    }
    
    @Override
    public OptionalInt getLength() {
        return OptionalUtil.ofNullable(length);
    }
    
    @Override
    public Optional<String> getRating() {
        return Optional.ofNullable(rating);
    }
    
    @Override
    public Optional<String> getActors() {
        return Optional.ofNullable(actors);
    }
    
    @Override
    public FilmList setFid(Integer fid) {
        this.fid = fid;
        return this;
    }
    
    @Override
    public FilmList setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public FilmList setDescription(String description) {
        this.description = description;
        return this;
    }
    
    @Override
    public FilmList setCategory(String category) {
        this.category = category;
        return this;
    }
    
    @Override
    public FilmList setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    
    @Override
    public FilmList setLength(Integer length) {
        this.length = length;
        return this;
    }
    
    @Override
    public FilmList setRating(String rating) {
        this.rating = rating;
        return this;
    }
    
    @Override
    public FilmList setActors(String actors) {
        this.actors = actors;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("fid = "         + Objects.toString(OptionalUtil.unwrap(getFid())));
        sj.add("title = "       + Objects.toString(OptionalUtil.unwrap(getTitle())));
        sj.add("description = " + Objects.toString(OptionalUtil.unwrap(getDescription())));
        sj.add("category = "    + Objects.toString(getCategory()));
        sj.add("price = "       + Objects.toString(OptionalUtil.unwrap(getPrice())));
        sj.add("length = "      + Objects.toString(OptionalUtil.unwrap(getLength())));
        sj.add("rating = "      + Objects.toString(OptionalUtil.unwrap(getRating())));
        sj.add("actors = "      + Objects.toString(OptionalUtil.unwrap(getActors())));
        return "FilmListImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof FilmList)) { return false; }
        final FilmList thatFilmList = (FilmList)that;
        if (!Objects.equals(this.getFid(), thatFilmList.getFid())) {return false; }
        if (!Objects.equals(this.getTitle(), thatFilmList.getTitle())) {return false; }
        if (!Objects.equals(this.getDescription(), thatFilmList.getDescription())) {return false; }
        if (!Objects.equals(this.getCategory(), thatFilmList.getCategory())) {return false; }
        if (!Objects.equals(this.getPrice(), thatFilmList.getPrice())) {return false; }
        if (!Objects.equals(this.getLength(), thatFilmList.getLength())) {return false; }
        if (!Objects.equals(this.getRating(), thatFilmList.getRating())) {return false; }
        if (!Objects.equals(this.getActors(), thatFilmList.getActors())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getFid());
        hash = 31 * hash + Objects.hashCode(getTitle());
        hash = 31 * hash + Objects.hashCode(getDescription());
        hash = 31 * hash + Objects.hashCode(getCategory());
        hash = 31 * hash + Objects.hashCode(getPrice());
        hash = 31 * hash + Objects.hashCode(getLength());
        hash = 31 * hash + Objects.hashCode(getRating());
        hash = 31 * hash + Objects.hashCode(getActors());
        return hash;
    }
}