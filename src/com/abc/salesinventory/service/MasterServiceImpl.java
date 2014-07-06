/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service;

import com.abc.salesinventory.model.newpackage.Customer;
import com.abc.salesinventory.ui.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
        return customer.getId();
    }

    @Override
    public void removeCustomer(String customerId) {        
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(customerId);
        session.getTransaction().commit();
    }

    @Override
    public Customer getCustomer(String customerId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Customer";
        Query q = session.createQuery(hql);
        List<Customer> resultList = q.list();
        session.getTransaction().commit();
        if(resultList!= null && resultList.size() == 1){
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
        if(resultList!= null && resultList.size() > 0){
            customers.addAll(resultList);
        }
        return customers;
    }
    
}
