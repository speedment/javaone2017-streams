package com.company.sakila.sakila.sakila.film_actor.generated;

import com.company.sakila.sakila.sakila.actor.Actor;
import com.company.sakila.sakila.sakila.film.Film;
import com.company.sakila.sakila.sakila.film_actor.FilmActor;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntForeignKeyField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.sql.Timestamp;

/**
 * The generated base for the {@link
 * com.company.sakila.sakila.sakila.film_actor.FilmActor}-interface representing
 * entities of the {@code film_actor}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedFilmActor {
    
    /**
     * This Field corresponds to the {@link FilmActor} field that can be
     * obtained using the {@link FilmActor#getActorId()} method.
     */
    IntForeignKeyField<FilmActor, Integer, Actor> ACTOR_ID = IntForeignKeyField.create(
        Identifier.ACTOR_ID,
        FilmActor::getActorId,
        FilmActor::setActorId,
        Actor.ACTOR_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmActor} field that can be
     * obtained using the {@link FilmActor#getFilmId()} method.
     */
    IntForeignKeyField<FilmActor, Integer, Film> FILM_ID = IntForeignKeyField.create(
        Identifier.FILM_ID,
        FilmActor::getFilmId,
        FilmActor::setFilmId,
        Film.FILM_ID,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link FilmActor} field that can be
     * obtained using the {@link FilmActor#getLastUpdate()} method.
     */
    ComparableField<FilmActor, Timestamp, Timestamp> LAST_UPDATE = ComparableField.create(
        Identifier.LAST_UPDATE,
        FilmActor::getLastUpdate,
        FilmActor::setLastUpdate,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the actorId of this FilmActor. The actorId field corresponds to
     * the database column sakila.sakila.film_actor.actor_id.
     * 
     * @return the actorId of this FilmActor
     */
    int getActorId();
    
    /**
     * Returns the filmId of this FilmActor. The filmId field corresponds to the
     * database column sakila.sakila.film_actor.film_id.
     * 
     * @return the filmId of this FilmActor
     */
    int getFilmId();
    
    /**
     * Returns the lastUpdate of this FilmActor. The lastUpdate field
     * corresponds to the database column sakila.sakila.film_actor.last_update.
     * 
     * @return the lastUpdate of this FilmActor
     */
    Timestamp getLastUpdate();
    
    /**
     * Sets the actorId of this FilmActor. The actorId field corresponds to the
     * database column sakila.sakila.film_actor.actor_id.
     * 
     * @param actorId to set of this FilmActor
     * @return        this FilmActor instance
     */
    FilmActor setActorId(int actorId);
    
    /**
     * Sets the filmId of this FilmActor. The filmId field corresponds to the
     * database column sakila.sakila.film_actor.film_id.
     * 
     * @param filmId to set of this FilmActor
     * @return       this FilmActor instance
     */
    FilmActor setFilmId(int filmId);
    
    /**
     * Sets the lastUpdate of this FilmActor. The lastUpdate field corresponds
     * to the database column sakila.sakila.film_actor.last_update.
     * 
     * @param lastUpdate to set of this FilmActor
     * @return           this FilmActor instance
     */
    FilmActor setLastUpdate(Timestamp lastUpdate);
    
    /**
     * Queries the specified manager for the referenced Actor. If no such Actor
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Actor findActorId(Manager<Actor> foreignManager);
    
    /**
     * Queries the specified manager for the referenced Film. If no such Film
     * exists, an {@code NullPointerException} will be thrown.
     * 
     * @param foreignManager the manager to query for the entity
     * @return               the foreign entity referenced
     */
    Film findFilmId(Manager<Film> foreignManager);
    
    enum Identifier implements ColumnIdentifier<FilmActor> {
        
        ACTOR_ID    ("actor_id"),
        FILM_ID     ("film_id"),
        LAST_UPDATE ("last_update");
        
        private final String columnName;
        private final TableIdentifier<FilmActor> tableIdentifier;
        
        Identifier(String columnName) {
            this.columnName      = columnName;
            this.tableIdentifier = TableIdentifier.of(    getDbmsName(), 
                getSchemaName(), 
                getTableName());
        }
        
        @Override
        public String getDbmsName() {
            return "sakila";
        }
        
        @Override
        public String getSchemaName() {
            return "sakila";
        }
        
        @Override
        public String getTableName() {
            return "film_actor";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<FilmActor> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}