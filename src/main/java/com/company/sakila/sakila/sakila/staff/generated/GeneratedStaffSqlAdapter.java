package com.company.sakila.sakila.sakila.staff.generated;

import com.company.sakila.sakila.sakila.staff.Staff;
import com.company.sakila.sakila.sakila.staff.StaffImpl;
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
 * com.company.sakila.sakila.sakila.staff.Staff} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedStaffSqlAdapter {
    
    private final TableIdentifier<Staff> tableIdentifier;
    
    protected GeneratedStaffSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "staff");
    }
    
    @ExecuteBefore(RESOLVED)
    void installMethodName(@WithState(RESOLVED) SqlStreamSupplierComponent streamSupplierComponent,
            @WithState(RESOLVED) SqlPersistenceComponent persistenceComponent) {
        streamSupplierComponent.install(tableIdentifier, this::apply);
        persistenceComponent.install(tableIdentifier);
    }
    
    protected Staff apply(ResultSet resultSet) throws SpeedmentException {
        final Staff entity = createEntity();
        try {
            entity.setStaffId(    resultSet.getShort(1)      );
            entity.setFirstName(  resultSet.getString(2)     );
            entity.setLastName(   resultSet.getString(3)     );
            entity.setAddressId(  resultSet.getInt(4)        );
            entity.setPicture(    resultSet.getBlob(5)       );
            entity.setEmail(      resultSet.getString(6)     );
            entity.setStoreId(    resultSet.getShort(7)      );
            entity.setActive(     resultSet.getInt(8)        );
            entity.setUsername(   resultSet.getString(9)     );
            entity.setPassword(   resultSet.getString(10)    );
            entity.setLastUpdate( resultSet.getTimestamp(11) );
        } catch (final SQLException sqle) {
            throw new SpeedmentException(sqle);
        }
        return entity;
    }
    
    protected StaffImpl createEntity() {
        return new StaffImpl();
    }
}