package com.company.sakila.sakila.sakila.film_category.generated;

import com.company.sakila.sakila.sakila.film_category.FilmCategory;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.sakila.sakila.film_category.FilmCategory} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmCategoryManager extends Manager<FilmCategory> {
    
    @Override
    default Class<FilmCategory> getEntityClass() {
        return FilmCategory.class;
    }
}