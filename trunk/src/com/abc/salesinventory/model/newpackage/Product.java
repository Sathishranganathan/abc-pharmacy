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
    public void setCategory (String category)
    {
        this.category = category;
    }
    
    public String getUnit()
    {
        return unit;
    }
    public void setUnit (String unit)
    {
        this.unit = unit;
    }
    
    public int getReOrderLevel()
    {
        return reOrderLevel;
    }
    public void setReOrderLevel (int reOrderLevel)
    {
        this.reOrderLevel = reOrderLevel;
    }
    
}
