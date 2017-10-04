package com.company.sakila.sakila.sakila.store.generated;

import com.company.sakila.sakila.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.sakila.sakila.store.Store} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedStoreManager extends Manager<Store> {
    
    @Override
    default Class<Store> getEntityClass() {
        return Store.class;
    }
}