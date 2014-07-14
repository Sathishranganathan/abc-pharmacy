/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service;

import com.abc.salesinventory.model.newpackage.Customer;
import com.abc.salesinventory.model.newpackage.Supplier;
import java.util.Set;
import org.hibernate.HibernateException;

/**
 *
 * @author rdjayawe
 */
public interface MasterService {
    
    public Customer getCustomer(String customerId);
    
    public Set<Customer> getAllCustomers();
    
    public String saveOrUpdateCustomer(Customer customer) throws HibernateException;
    
    public void removeCustomer(Customer customer);
    
    public Supplier getSupplier(String supplierId);
    
    public Set<Supplier> getAllSuppliers();
    
    public String saveOrUpdateSupplier(Supplier supplier) throws HibernateException;
    
    public void removeSupplier(Supplier supplier);  

   
       
}
