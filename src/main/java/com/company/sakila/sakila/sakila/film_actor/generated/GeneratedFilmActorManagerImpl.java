package com.company.sakila.sakila.sakila.film_actor.generated;

import com.company.sakila.sakila.sakila.film_actor.FilmActor;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.sakila.sakila.sakila.film_actor.FilmActor} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedFilmActorManagerImpl 
extends AbstractManager<FilmActor> 
implements GeneratedFilmActorManager {
    
    private final TableIdentifier<FilmActor> tableIdentifier;
    
    protected GeneratedFilmActorManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "film_actor");
    }
    
    @Override
    public TableIdentifier<FilmActor> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<FilmActor>> fields() {
        return Stream.of(
            FilmActor.ACTOR_ID,
            FilmActor.FILM_ID,
            FilmActor.LAST_UPDATE
        );
    }
    
    @Override
    public Stream<Field<FilmActor>> primaryKeyFields() {
        return Stream.of(
            FilmActor.ACTOR_ID,
            FilmActor.FILM_ID
        );
    }
}