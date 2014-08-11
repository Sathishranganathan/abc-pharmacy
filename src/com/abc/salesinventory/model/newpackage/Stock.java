package com.abc.salesinventory.model.newpackage;
// Generated Aug 11, 2014 12:37:38 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Stock generated by hbm2java
 */
public class Stock  implements java.io.Serializable {


     private String stockId;
     private Product product;
     private Supplier supplier;
     private double quantity;
     private Date expDate;
     private Double purchasedUnitPrice;

    public Stock() {
    }

	
    public Stock(String stockId, Product product, Supplier supplier, double quantity) {
        this.stockId = stockId;
        this.product = product;
        this.supplier = supplier;
        this.quantity = quantity;
    }
    public Stock(String stockId, Product product, Supplier supplier, double quantity, Date expDate, Double purchasedUnitPrice) {
       this.stockId = stockId;
       this.product = product;
       this.supplier = supplier;
       this.quantity = quantity;
       this.expDate = expDate;
       this.purchasedUnitPrice = purchasedUnitPrice;
    }
   
    public String getStockId() {
        return this.stockId;
    }
    
    public void setStockId(String stockId) {
        this.stockId = stockId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Supplier getSupplier() {
        return this.supplier;
    }
    
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
    public double getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
    public Date getExpDate() {
        return this.expDate;
    }
    
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public Double getPurchasedUnitPrice() {
        return this.purchasedUnitPrice;
    }
    
    public void setPurchasedUnitPrice(Double purchasedUnitPrice) {
        this.purchasedUnitPrice = purchasedUnitPrice;
    }




}


