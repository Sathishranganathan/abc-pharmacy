/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service;

import com.abc.salesinventory.model.newpackage.Transaction;


/**
 *
 * @author rdjayawe
 */
public interface InventoryService {
    
    public void saveTransaction(Transaction transaction);
}
