package com.company.sakila.sakila.sakila.rental.generated;

import com.company.sakila.sakila.sakila.rental.Rental;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;

/**
 * The generated base interface for the manager of every {@link
 * com.company.sakila.sakila.sakila.rental.Rental} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedRentalManager extends Manager<Rental> {
    
    @Override
    default Class<Rental> getEntityClass() {
        return Rental.class;
    }
}