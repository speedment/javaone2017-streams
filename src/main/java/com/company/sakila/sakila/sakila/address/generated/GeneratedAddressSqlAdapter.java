package com.company.sakila.sakila.sakila.address.generated;

import com.company.sakila.sakila.sakila.address.Address;
import com.company.sakila.sakila.sakila.address.AddressImpl;
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
 * com.company.sakila.sakila.sakila.address.Address} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAddressSqlAdapter {
    
    private final TableIdentifier<Address> tableIdentifier;
    
    protected GeneratedAddressSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "address");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Address apply(ResultSet resultSet) throws SpeedmentException {
        final Address entity = createEntity();
        try {
            entity.setAddressId(  resultSet.getInt(1)       );
            entity.setAddress(    resultSet.getString(2)    );
            entity.setAddress2(   resultSet.getString(3)    );
            entity.setDistrict(   resultSet.getString(4)    );
            entity.setCityId(     resultSet.getInt(5)       );
            entity.setPostalCode( resultSet.getString(6)    );
            entity.setPhone(      resultSet.getString(7)    );
            entity.setLastUpdate( resultSet.getTimestamp(8) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected AddressImpl createEntity() {
        return new AddressImpl();
    }
}