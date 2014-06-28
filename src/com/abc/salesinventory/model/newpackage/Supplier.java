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
public class Supplier {
    private String supplierId;
    private String supplierName;
    private String supplierMobile;
    private String supplierHome;
    private String supplierOffice;
    private String supplierEmail;
    
    public String getSupplierId()
    {
        return supplierId;
    }
    public void setSupplierID (String supplierId)
    {
        this.supplierId = supplierId;
    }
    
    public String getSupplierName()
    {
        return supplierName;
    }
    public void getSupplierName(String supplierName)
    {
        this.supplierName=supplierName;
    }
    
    public String getSupplierMobile()
    {
        return supplierMobile;
    }
    public void setSupplierMobile(String supplierMobile)
    {
        this.supplierMobile = supplierMobile;
    }
    
    public String getSupplierHome()
    {
        return supplierHome;
    }
    public void setSupplierHome(String supplierHome)
    {
        this.supplierHome = supplierHome;
    }
    
    public String setSupplierOffice()
    {
        return supplierOffice;
    }
    public void getSupplierOffice(String supplierOffice)
    {
        this.supplierOffice = supplierOffice;
    }
}
