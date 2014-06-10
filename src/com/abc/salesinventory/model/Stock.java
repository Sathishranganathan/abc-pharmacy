/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.model;

import java.util.Date;

/**
 *
 * @author DAS
 */
public class Stock {
    private int id;
    private Item item;
    private String expiryDate;
    private double qty;

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }


}
