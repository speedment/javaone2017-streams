package com.company.sakila.sakila.sakila.address.generated;

import com.company.sakila.SakilaApplication;
import com.company.sakila.sakila.sakila.address.Address;
import com.company.sakila.sakila.sakila.address.AddressManager;
import com.speedment.common.annotation.GeneratedCode;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import static java.util.stream.Collectors.toList;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * The default REST controller logic
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedAddressController {
    
    protected @Autowired SakilaApplication app;
    protected @Autowired AddressManager manager;
    
    @RequestMapping(value = "/address", method = GET)
    public List<Address> get(@RequestParam(value = "start", defaultValue = "0") long start,
            @RequestParam(value = "limit", defaultValue = "25") long limit) {
        return manager.stream()
            .skip(start)
            .limit(limit)
            .collect(toList());
    }
}