package com.company.sakila.sakila.sakila.customer_list.generated;

import com.company.sakila.sakila.sakila.customer_list.CustomerList;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.ShortField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;
import java.util.Optional;

/**
 * The generated base for the {@link
 * com.company.sakila.sakila.sakila.customer_list.CustomerList}-interface
 * representing entities of the {@code customer_list}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCustomerList {
    
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getId()} method.
     */
    IntField<CustomerList, Integer> ID = IntField.create(
        Identifier.ID,
        CustomerList::getId,
        CustomerList::setId,
        TypeMapper.primitive(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getName()} method.
     */
    StringField<CustomerList, String> NAME = StringField.create(
        Identifier.NAME,
        o -> OptionalUtil.unwrap(o.getName()),
        CustomerList::setName,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getAddress()} method.
     */
    StringField<CustomerList, String> ADDRESS = StringField.create(
        Identifier.ADDRESS,
        CustomerList::getAddress,
        CustomerList::setAddress,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getZipCode()} method.
     */
    StringField<CustomerList, String> ZIP_CODE = StringField.create(
        Identifier.ZIP_CODE,
        o -> OptionalUtil.unwrap(o.getZipCode()),
        CustomerList::setZipCode,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getPhone()} method.
     */
    StringField<CustomerList, String> PHONE = StringField.create(
        Identifier.PHONE,
        CustomerList::getPhone,
        CustomerList::setPhone,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getCity()} method.
     */
    StringField<CustomerList, String> CITY = StringField.create(
        Identifier.CITY,
        CustomerList::getCity,
        CustomerList::setCity,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getCountry()} method.
     */
    StringField<CustomerList, String> COUNTRY = StringField.create(
        Identifier.COUNTRY,
        CustomerList::getCountry,
        CustomerList::setCountry,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getNotes()} method.
     */
    StringField<CustomerList, String> NOTES = StringField.create(
        Identifier.NOTES,
        CustomerList::getNotes,
        CustomerList::setNotes,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link CustomerList} field that can be
     * obtained using the {@link CustomerList#getSid()} method.
     */
    ShortField<CustomerList, Short> SID = ShortField.create(
        Identifier.SID,
        CustomerList::getSid,
        CustomerList::setSid,
        TypeMapper.primitive(),
        false
    );
    
    /**
     * Returns the id of this CustomerList. The id field corresponds to the
     * database column sakila.sakila.customer_list.ID.
     * 
     * @return the id of this CustomerList
     */
    int getId();
    
    /**
     * Returns the name of this CustomerList. The name field corresponds to the
     * database column sakila.sakila.customer_list.name.
     * 
     * @return the name of this CustomerList
     */
    Optional<String> getName();
    
    /**
     * Returns the address of this CustomerList. The address field corresponds
     * to the database column sakila.sakila.customer_list.address.
     * 
     * @return the address of this CustomerList
     */
    String getAddress();
    
    /**
     * Returns the zipCode of this CustomerList. The zipCode field corresponds
     * to the database column sakila.sakila.customer_list.zip code.
     * 
     * @return the zipCode of this CustomerList
     */
    Optional<String> getZipCode();
    
    /**
     * Returns the phone of this CustomerList. The phone field corresponds to
     * the database column sakila.sakila.customer_list.phone.
     * 
     * @return the phone of this CustomerList
     */
    String getPhone();
    
    /**
     * Returns the city of this CustomerList. The city field corresponds to the
     * database column sakila.sakila.customer_list.city.
     * 
     * @return the city of this CustomerList
     */
    String getCity();
    
    /**
     * Returns the country of this CustomerList. The country field corresponds
     * to the database column sakila.sakila.customer_list.country.
     * 
     * @return the country of this CustomerList
     */
    String getCountry();
    
    /**
     * Returns the notes of this CustomerList. The notes field corresponds to
     * the database column sakila.sakila.customer_list.notes.
     * 
     * @return the notes of this CustomerList
     */
    String getNotes();
    
    /**
     * Returns the sid of this CustomerList. The sid field corresponds to the
     * database column sakila.sakila.customer_list.SID.
     * 
     * @return the sid of this CustomerList
     */
    short getSid();
    
    /**
     * Sets the id of this CustomerList. The id field corresponds to the
     * database column sakila.sakila.customer_list.ID.
     * 
     * @param id to set of this CustomerList
     * @return   this CustomerList instance
     */
    CustomerList setId(int id);
    
    /**
     * Sets the name of this CustomerList. The name field corresponds to the
     * database column sakila.sakila.customer_list.name.
     * 
     * @param name to set of this CustomerList
     * @return     this CustomerList instance
     */
    CustomerList setName(String name);
    
    /**
     * Sets the address of this CustomerList. The address field corresponds to
     * the database column sakila.sakila.customer_list.address.
     * 
     * @param address to set of this CustomerList
     * @return        this CustomerList instance
     */
    CustomerList setAddress(String address);
    
    /**
     * Sets the zipCode of this CustomerList. The zipCode field corresponds to
     * the database column sakila.sakila.customer_list.zip code.
     * 
     * @param zipCode to set of this CustomerList
     * @return        this CustomerList instance
     */
    CustomerList setZipCode(String zipCode);
    
    /**
     * Sets the phone of this CustomerList. The phone field corresponds to the
     * database column sakila.sakila.customer_list.phone.
     * 
     * @param phone to set of this CustomerList
     * @return      this CustomerList instance
     */
    CustomerList setPhone(String phone);
    
    /**
     * Sets the city of this CustomerList. The city field corresponds to the
     * database column sakila.sakila.customer_list.city.
     * 
     * @param city to set of this CustomerList
     * @return     this CustomerList instance
     */
    CustomerList setCity(String city);
    
    /**
     * Sets the country of this CustomerList. The country field corresponds to
     * the database column sakila.sakila.customer_list.country.
     * 
     * @param country to set of this CustomerList
     * @return        this CustomerList instance
     */
    CustomerList setCountry(String country);
    
    /**
     * Sets the notes of this CustomerList. The notes field corresponds to the
     * database column sakila.sakila.customer_list.notes.
     * 
     * @param notes to set of this CustomerList
     * @return      this CustomerList instance
     */
    CustomerList setNotes(String notes);
    
    /**
     * Sets the sid of this CustomerList. The sid field corresponds to the
     * database column sakila.sakila.customer_list.SID.
     * 
     * @param sid to set of this CustomerList
     * @return    this CustomerList instance
     */
    CustomerList setSid(short sid);
    
    enum Identifier implements ColumnIdentifier<CustomerList> {
        
        ID       ("ID"),
        NAME     ("name"),
        ADDRESS  ("address"),
        ZIP_CODE ("zip code"),
        PHONE    ("phone"),
        CITY     ("city"),
        COUNTRY  ("country"),
        NOTES    ("notes"),
        SID      ("SID");
        
        private final String columnName;
        private final TableIdentifier<CustomerList> tableIdentifier;
        
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
            return "customer_list";
        }
        
        @Override
        public String getColumnName() {
            return this.columnName;
        }
        
        @Override
        public TableIdentifier<CustomerList> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}