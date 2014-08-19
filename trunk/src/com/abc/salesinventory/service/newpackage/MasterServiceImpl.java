/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Customer;
import com.abc.salesinventory.model.newpackage.Supplier;
import com.abc.salesinventory.model.newpackage.Product;
import com.abc.salesinventory.util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rdjayawe
 */
public class MasterServiceImpl implements MasterService {

    @Override
    public String saveOrUpdateCustomer(Customer customer) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(customer);
        session.getTransaction().commit();
        session.close();
        return customer.getId();
    }

    @Override
    public void removeCustomer(Customer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(customer);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Customer getCustomer(String customerId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Customer c where c.id='" + customerId + "' ";
        Query q = session.createQuery(hql);
        List<Customer> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Customer> getAllCustomers() {
        Set<Customer> customers = new HashSet<Customer>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List<Customer> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            customers.addAll(resultList);
        }
        return customers;
    }

    //SUPPLIER
    @Override
    public String saveOrUpdateSupplier(Supplier supplier) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(supplier);
        session.getTransaction().commit();
        session.close();
        return supplier.getId();
    }

    @Override
    public void removeSupplier(Supplier supplier) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(supplier);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Supplier getSupplier(String supplierId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Supplier s where s.id='" + supplierId + "' ";
        Query q = session.createQuery(hql);
        List<Supplier> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Supplier> getAllSuppliers() {
        Set<Supplier> suppliers = new HashSet<Supplier>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Supplier";
        Query q = session.createQuery(hql);
        List<Supplier> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            suppliers.addAll(resultList);
        }
        return suppliers;
    }

    //Product
    @Override
    public String saveOrUpdateProduct(Product product) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(product);
        session.getTransaction().commit();
        session.close();
        return product.getProductCode();
    }

    @Override
    public void removeProduct(Product product) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(product);
        session.getTransaction().commit();
        session.close();
    }

    @Override
    public Product getProduct(String productCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Product p where p.productCode='" + productCode + "' ";
        Query q = session.createQuery(hql);
        List<Product> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Product> getAllProducts() {
        Set<Product> products = new HashSet<Product>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Product";
        Query q = session.createQuery(hql);
        List<Product> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            products.addAll(resultList);
        }
        return products;
    }
    
    @Override
    public String getPreference(String key) {
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());
        return prefs.get(key, "");
    }

    @Override
    public void setPreference(String key, String value) {
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());
        prefs.put(key, value);
    }
}
