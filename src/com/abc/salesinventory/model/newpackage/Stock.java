/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.model.newpackage;

/**
 *
 * @author Manuri
 */
public class Stock {
    private String uuid;
    private String supplierId;
    private String productId;
    private int qty;
    private String expDate;
    private double purchasedUnitPrice;
    private double sellingUnitPrice;

    /**
     * @return the uuid
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * @param uuid the uuid to set
     */
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * @return the supplierId
     */
    public String getSupplierId() {
        return supplierId;
    }

    /**
     * @param supplierId the supplierId to set
     */
    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }

    /**
     * @return the productId
     */
    public String getProductId() {
        return productId;
    }

    /**
     * @param productId the productId to set
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the expDate
     */
    public String getExpDate() {
        return expDate;
    }

    /**
     * @param expDate the expDate to set
     */
    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    /**
     * @return the purchasedUnitPrice
     */
    public double getPurchasedUnitPrice() {
        return purchasedUnitPrice;
    }

    /**
     * @param purchasedUnitPrice the purchasedUnitPrice to set
     */
    public void setPurchasedUnitPrice(double purchasedUnitPrice) {
        this.purchasedUnitPrice = purchasedUnitPrice;
    }

    /**
     * @return the sellingUnitPrice
     */
    public double getSellingUnitPrice() {
        return sellingUnitPrice;
    }

    /**
     * @param sellingUnitPrice the sellingUnitPrice to set
     */
    public void setSellingUnitPrice(double sellingUnitPrice) {
        this.sellingUnitPrice = sellingUnitPrice;
    }
}
