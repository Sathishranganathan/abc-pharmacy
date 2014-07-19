/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service;

import com.abc.salesinventory.model.newpackage.Customer;
import com.abc.salesinventory.model.newpackage.Supplier;
import com.abc.salesinventory.model.newpackage.Product;
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
    
    //Supplier
    
    public Supplier getSupplier(String supplierId);
    
    public Set<Supplier> getAllSuppliers();
    
    public String saveOrUpdateSupplier(Supplier supplier) throws HibernateException;
    
    public void removeSupplier(Supplier supplier);  

    //Product
    
     public Product getProduct(String productCode);
    
    public Set<Product> getAllpProducts();
    
    public String saveOrUpdateProduct(Product product) throws HibernateException;
    
    public void removeProduct(Product product);
   
       
}
