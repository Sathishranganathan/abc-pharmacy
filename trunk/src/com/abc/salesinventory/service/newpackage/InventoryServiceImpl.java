/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Role;
import com.abc.salesinventory.model.newpackage.Stock;
import com.abc.salesinventory.model.newpackage.Transaction;
import com.abc.salesinventory.model.newpackage.UserRole;
import com.abc.salesinventory.util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Manuri
 */
public class InventoryServiceImpl implements InventoryService {

    @Override
    public List<Stock> getStockByProduct(String productCode) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Stock s where s.product.productCode='" + productCode + "' order by expDate desc";
        Query q = session.createQuery(hql);
        List<Stock> resultList = q.list();
        
        for (Stock stock : resultList) {
            Hibernate.initialize(stock.getSupplier());
            Hibernate.initialize(stock.getProduct());
        }
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            return resultList;
        }
        return null;
    }

    @Override
    public String saveStock(Stock stock) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(stock);
        session.getTransaction().commit();
        session.close();
        return stock.getStockId();
    }

    @Override
    public String saveTransaction(Transaction transaction) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(transaction);
        session.getTransaction().commit();
        session.close();
        return transaction.getTransactionId();
    }

    @Override
    public Transaction getTransaction(String transactionId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Transaction t where t.transactionId='" + transactionId + "' ";
        Query q = session.createQuery(hql);
        List<Transaction> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Transaction> getAllTransactions() {
        Set<Transaction> transactions = new HashSet<Transaction>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Transaction";
        Query q = session.createQuery(hql);
        List<Transaction> resultList = q.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            transactions.addAll(resultList);
        }
        return transactions;
    }

}
