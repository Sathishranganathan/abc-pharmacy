/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Stock;
import com.abc.salesinventory.model.newpackage.Transaction;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;

/**
 *
 * @author Manuri
 */
public interface InventoryService {
    public List<Stock> getStockByProduct(String productCode);
    
    public String saveStock(Stock stock) throws HibernateException;

    public String saveTransaction(Transaction transaction) throws HibernateException;

    public Transaction getTransaction(String transactionId);

    public Set<Transaction> getAllTransactions();
}
