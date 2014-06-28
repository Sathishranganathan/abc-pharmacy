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
public class Product {
    private String productCode;
    private String productName;
    private String category;
    private String unit;
    private double purchasedUnitPrice;
    private double sellingUnitPrice;
    private String supplier;
    private String expiryDate;
    private int reOrderLevel;
    
    public String getProductCode()
    {
        return productCode;
    }
    public void setProductCode(String productCode)
    {
        this.productCode = productCode;
    }
    
    public String getProductName()
    {
        return productName;
    }
    public void setProductName (String productName)
    {
        this.productName = productName;
    }
      
    public String getCategory()
    {
        return category;
    }
    public void getCategory (String category)
    {
        this.category = category;
    }
    
    public String getUnit()
    {
        return unit;
    }
    public void getUnit (String unit)
    {
        this.unit = unit;
    }
    
    public double getPurchasedUnitPrice()
    {
        return purchasedUnitPrice;
    }
    public void getPurchasedUnitPrice (double purchasedUnitPrice)
    {
        this.purchasedUnitPrice = purchasedUnitPrice;
    }
    
    public double getSellingUnitPrice()
    {
        return sellingUnitPrice;
    }
    public void getSellingUnitPrice (double sellingUnitPrice)
    {
        this.sellingUnitPrice = sellingUnitPrice;
    }
    
    public String getSupplier()
    {
        return supplier;
    }
    public void getSupplier (String supplier)
    {
        this.supplier = supplier;
    }
    
    public String getExpiryDate()
    {
        return expiryDate;
    }
    public void getExpiryDate (String expiryDate)
    {
        this.expiryDate = expiryDate;
    }
    
    public int getReOrderLevel()
    {
        return reOrderLevel;
    }
    public void getReOrderLevel (int reOrderLevel)
    {
        this.reOrderLevel = reOrderLevel;
    }
    
}
