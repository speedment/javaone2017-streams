package com.company.sakila.sakila.sakila.city.generated;

import com.company.sakila.sakila.sakila.city.City;
import com.company.sakila.sakila.sakila.city.CityImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.common.injector.annotation.WithState;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.sql.SqlPersistenceComponent;
import com.speedment.runtime.core.component.sql.SqlStreamSupplierComponent;
import com.speedment.runtime.core.exception.SpeedmentException;
import java.sql.ResultSet;
import java.sql.SQLException;
import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.sakila.sakila.sakila.city.City} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCitySqlAdapter {
    
    private final TableIdentifier<City> tableIdentifier;
    
    protected GeneratedCitySqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "city");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected City apply(ResultSet resultSet) throws SpeedmentException {
        final City entity = createEntity();
        try {
            entity.setCityId(     resultSet.getInt(1)       );
            entity.setCity(       resultSet.getString(2)    );
            entity.setCountryId(  resultSet.getInt(3)       );
            entity.setLastUpdate( resultSet.getTimestamp(4) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected CityImpl createEntity() {
        return new CityImpl();
    }
}