package com.abc.salesinventory.model.newpackage;
// Generated Aug 11, 2014 2:22:10 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TransactionDetail generated by hbm2java
 */
public class TransactionDetail  implements java.io.Serializable {


     private String transactionDetailId;
     private Product product;
     private Transaction transaction;
     private Double unitPrice;
     private Double discount;
     private Date expDate;
     private Integer quantity;

    public TransactionDetail() {
    }

	
    public TransactionDetail(String transactionDetailId) {
        this.transactionDetailId = transactionDetailId;
    }
    public TransactionDetail(String transactionDetailId, Product product, Transaction transaction, Double unitPrice, Double discount, Date expDate, Integer quantity) {
       this.transactionDetailId = transactionDetailId;
       this.product = product;
       this.transaction = transaction;
       this.unitPrice = unitPrice;
       this.discount = discount;
       this.expDate = expDate;
       this.quantity = quantity;
    }
   
    public String getTransactionDetailId() {
        return this.transactionDetailId;
    }
    
    public void setTransactionDetailId(String transactionDetailId) {
        this.transactionDetailId = transactionDetailId;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Transaction getTransaction() {
        return this.transaction;
    }
    
    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }
    public Double getUnitPrice() {
        return this.unitPrice;
    }
    
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getDiscount() {
        return this.discount;
    }
    
    public void setDiscount(Double discount) {
        this.discount = discount;
    }
    public Date getExpDate() {
        return this.expDate;
    }
    
    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }
    public Integer getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }




}


