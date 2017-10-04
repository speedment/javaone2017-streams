package com.company.sakila.sakila.sakila.customer_list.generated;

import com.company.sakila.sakila.sakila.customer_list.CustomerList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractViewManager;
import com.speedment.runtime.field.Field;
import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.sakila.sakila.sakila.customer_list.CustomerList} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerListManagerImpl 
extends AbstractViewManager<CustomerList> 
implements GeneratedCustomerListManager {
    
    private final TableIdentifier<CustomerList> tableIdentifier;
    
    protected GeneratedCustomerListManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("sakila", "sakila", "customer_list");
    }
    
    @Override
    public TableIdentifier<CustomerList> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<CustomerList>> fields() {
        return Stream.of(
            CustomerList.ID,
            CustomerList.NAME,
            CustomerList.ADDRESS,
            CustomerList.ZIP_CODE,
            CustomerList.PHONE,
            CustomerList.CITY,
            CustomerList.COUNTRY,
            CustomerList.NOTES,
            CustomerList.SID
        );
    }
    
    @Override
    public Stream<Field<CustomerList>> primaryKeyFields() {
        return Stream.empty();
    }
}