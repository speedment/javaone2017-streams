package com.company.sakila.sakila.sakila.sales_by_store.generated;

import com.company.sakila.sakila.sakila.sales_by_store.SalesByStore;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.sakila.sakila.sales_by_store.SalesByStore} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedSalesByStoreManager extends Manager<SalesByStore> {
    
    @Override
    default Class<SalesByStore> getEntityClass() {
        return SalesByStore.class;
    }
}