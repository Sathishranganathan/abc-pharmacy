/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.ui.newpackage;

import com.abc.salesinventory.report.CustomerDetailsReport;
import com.abc.salesinventory.report.ProductDetailsReport;
import com.abc.salesinventory.report.StockDetailsReport;
import com.abc.salesinventory.report.SupplierDetailsReport;
import com.abc.salesinventory.service.newpackage.SecurityService;
import com.abc.salesinventory.service.newpackage.SecurityServiceImpl;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuri
 */
public class MainScreen extends javax.swing.JFrame {

    private String userId;
    private SecurityService securityService = new SecurityServiceImpl();

    /**
     * Creates new form MainScreen
     */

    public MainScreen(String userId) {
        initComponents();
        this.userId = userId;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        miChangePassword = new javax.swing.JMenuItem();
        miExit = new javax.swing.JMenuItem();
        menuCustomer = new javax.swing.JMenu();
        miAddCus = new javax.swing.JMenuItem();
        miSearchCus = new javax.swing.JMenuItem();
        menuSupplier = new javax.swing.JMenu();
        miAddSupp = new javax.swing.JMenuItem();
        miSearchSup = new javax.swing.JMenuItem();
        menuStock = new javax.swing.JMenu();
        miAddproduct = new javax.swing.JMenuItem();
        miSearchProduct = new javax.swing.JMenuItem();
        menuSales = new javax.swing.JMenu();
        miSales = new javax.swing.JMenuItem();
        menuPurchases = new javax.swing.JMenu();
        miPurchase = new javax.swing.JMenuItem();
        menuReport = new javax.swing.JMenu();
        miCustomerReport = new javax.swing.JMenuItem();
        miSupplierReport = new javax.swing.JMenuItem();
        miProductReport = new javax.swing.JMenuItem();
        miStockReport = new javax.swing.JMenuItem();
        miExpiredReport = new javax.swing.JMenuItem();
        miSupWisePurchased = new javax.swing.JMenuItem();
        miCusWiseSales = new javax.swing.JMenuItem();
        miStockValueAnlysis = new javax.swing.JMenuItem();
        miDailySalesReport = new javax.swing.JMenuItem();
        miMonthlySalesReport = new javax.swing.JMenuItem();
        miSlow = new javax.swing.JMenuItem();
        miFast = new javax.swing.JMenuItem();
        menuAccount = new javax.swing.JMenu();
        miCreateAcc = new javax.swing.JMenuItem();
        miEditAcc = new javax.swing.JMenuItem();
        menuUserRole = new javax.swing.JMenu();
        miChangeRole = new javax.swing.JMenuItem();
        miEditRole = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sales & Inventory Management System - Eraj Pharmaceuticals");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Serif", 0, 20)); // NOI18N
        jLabel2.setText("SALES AND INVENTORY MANAGEMENT SYSTEM");

        jLabel1.setFont(new java.awt.Font("Plantagenet Cherokee", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/abc/salesinventory/ui/resource/logo_icon.jpg"))); // NOI18N
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Eraj Pharmaceuticals");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Importers, Wholesale Dealers & Distributors of Pharmaceuticals & Surgical Products");

        btnLogout.setText("Logout");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(165, 165, 165)
                        .addComponent(btnLogout)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(134, 134, 134))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(186, 186, 186))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnLogout))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        menuFile.setText("File");

        miChangePassword.setText("Change Password");
        miChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangePasswordActionPerformed(evt);
            }
        });
        menuFile.add(miChangePassword);

        miExit.setText("Exit");
        miExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExitActionPerformed(evt);
            }
        });
        menuFile.add(miExit);

        jMenuBar1.add(menuFile);

        menuCustomer.setText("Customer");

        miAddCus.setText("Add Customer");
        miAddCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddCusActionPerformed(evt);
            }
        });
        menuCustomer.add(miAddCus);

        miSearchCus.setText("Search Customer");
        miSearchCus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchCusActionPerformed(evt);
            }
        });
        menuCustomer.add(miSearchCus);

        jMenuBar1.add(menuCustomer);

        menuSupplier.setText("Supplier");

        miAddSupp.setText("Add Supplier");
        miAddSupp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddSuppActionPerformed(evt);
            }
        });
        menuSupplier.add(miAddSupp);

        miSearchSup.setText("Search Supplier");
        miSearchSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchSupActionPerformed(evt);
            }
        });
        menuSupplier.add(miSearchSup);

        jMenuBar1.add(menuSupplier);

        menuStock.setText("Stock");

        miAddproduct.setText("Add New Products");
        miAddproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddproductActionPerformed(evt);
            }
        });
        menuStock.add(miAddproduct);

        miSearchProduct.setText("Search Product");
        miSearchProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSearchProductActionPerformed(evt);
            }
        });
        menuStock.add(miSearchProduct);

        jMenuBar1.add(menuStock);

        menuSales.setText("Sales");

        miSales.setText("Sales");
        miSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSalesActionPerformed(evt);
            }
        });
        menuSales.add(miSales);

        jMenuBar1.add(menuSales);

        menuPurchases.setText("Purchases");

        miPurchase.setText("Purchase");
        miPurchase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPurchaseActionPerformed(evt);
            }
        });
        menuPurchases.add(miPurchase);

        jMenuBar1.add(menuPurchases);

        menuReport.setText("Reports");

        miCustomerReport.setText("Customer Details Report");
        miCustomerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCustomerReportActionPerformed(evt);
            }
        });
        menuReport.add(miCustomerReport);

        miSupplierReport.setText("Supplier Details Report");
        miSupplierReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSupplierReportActionPerformed(evt);
            }
        });
        menuReport.add(miSupplierReport);

        miProductReport.setText("Product Details Report");
        miProductReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miProductReportActionPerformed(evt);
            }
        });
        menuReport.add(miProductReport);

        miStockReport.setText("Stock Details Report");
        miStockReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStockReportActionPerformed(evt);
            }
        });
        menuReport.add(miStockReport);

        miExpiredReport.setText("Expired Products Detail Report");
        miExpiredReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExpiredReportActionPerformed(evt);
            }
        });
        menuReport.add(miExpiredReport);

        miSupWisePurchased.setText("Supplier Wise Purchased Report");
        miSupWisePurchased.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSupWisePurchasedActionPerformed(evt);
            }
        });
        menuReport.add(miSupWisePurchased);

        miCusWiseSales.setText("Customer Wise Sales Report");
        menuReport.add(miCusWiseSales);

        miStockValueAnlysis.setText("Stock Value Analysis Report");
        miStockValueAnlysis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miStockValueAnlysisActionPerformed(evt);
            }
        });
        menuReport.add(miStockValueAnlysis);

        miDailySalesReport.setText("Daily Sales Report");
        menuReport.add(miDailySalesReport);

        miMonthlySalesReport.setText("Monthly Sales Report");
        menuReport.add(miMonthlySalesReport);

        miSlow.setText("Slow Moving Items");
        miSlow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSlowActionPerformed(evt);
            }
        });
        menuReport.add(miSlow);

        miFast.setText("Fast Moving Items");
        menuReport.add(miFast);

        jMenuBar1.add(menuReport);

        menuAccount.setText("Account");

        miCreateAcc.setText("Create User Account");
        miCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCreateAccActionPerformed(evt);
            }
        });
        menuAccount.add(miCreateAcc);

        miEditAcc.setText("Edit User Account");
        miEditAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditAccActionPerformed(evt);
            }
        });
        menuAccount.add(miEditAcc);

        jMenuBar1.add(menuAccount);

        menuUserRole.setText("User Role");

        miChangeRole.setText("Create User Role");
        miChangeRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miChangeRoleActionPerformed(evt);
            }
        });
        menuUserRole.add(miChangeRole);

        miEditRole.setText("Edit User Role");
        miEditRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miEditRoleActionPerformed(evt);
            }
        });
        menuUserRole.add(miEditRole);

        jMenuBar1.add(menuUserRole);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAddCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddCusActionPerformed
        if (securityService.hasPermission("MANAGE_CUSTOMERS", this.userId)) {
            new CreateCustomer().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miAddCusActionPerformed

    private void miSearchCusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchCusActionPerformed
        if (securityService.hasPermission("MANAGE_CUSTOMERS", this.userId)) {
            new SearchCustomer().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miSearchCusActionPerformed

    private void miAddSuppActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddSuppActionPerformed
        if (securityService.hasPermission("MANAGE_SUPPLIERS", this.userId)) {
            new CreateSupplier().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miAddSuppActionPerformed

    private void miSearchSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchSupActionPerformed
       if (securityService.hasPermission("MANAGE_SUPPLIERS", this.userId)) {
            new SearchSupplier().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miSearchSupActionPerformed

    private void miAddproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddproductActionPerformed
        if (securityService.hasPermission("MANAGE_PRODUCTS", this.userId)) {
            new AddNewProduct().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miAddproductActionPerformed

    private void miSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSalesActionPerformed
        if (securityService.hasPermission("DO_SALES", this.userId)) {
            new Sales().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miSalesActionPerformed

    private void miPurchaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPurchaseActionPerformed
        if (securityService.hasPermission("DO_PURCHASES", this.userId)) {
            new Purchases().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miPurchaseActionPerformed

    private void miCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCreateAccActionPerformed
       if (securityService.hasPermission("MANAGE_USERS", this.userId)) {
            new CreateUser().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miCreateAccActionPerformed

    private void miEditAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditAccActionPerformed
        if (securityService.hasPermission("MANAGE_USERS", this.userId)) {
            new EditUser().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miEditAccActionPerformed

    private void miChangeRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangeRoleActionPerformed
        if (securityService.hasPermission("MANAGE_ROLES", this.userId)) {
            new CreateRole().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miChangeRoleActionPerformed

    private void miEditRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miEditRoleActionPerformed
        if (securityService.hasPermission("MANAGE_ROLES", this.userId)) {
            new EditUserRole().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miEditRoleActionPerformed

    private void miChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miChangePasswordActionPerformed
        new ChangePassword(this.userId).setVisible(true);
    }//GEN-LAST:event_miChangePasswordActionPerformed

    private void miSearchProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSearchProductActionPerformed
        if (securityService.hasPermission("MANAGE_PRODUCTS", this.userId)) {
            new SearchProduct().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miSearchProductActionPerformed

    private void miExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_miExitActionPerformed

    private void miSupplierReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSupplierReportActionPerformed
        if (securityService.hasPermission("GENERATE_REPORTs", this.userId)) {
            new SupplierDetailsReport().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miSupplierReportActionPerformed

    private void miProductReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miProductReportActionPerformed
       if (securityService.hasPermission("GENERATE_REPORTs", this.userId)) {
            new ProductDetailsReport().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miProductReportActionPerformed

    private void miExpiredReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExpiredReportActionPerformed
       
    }//GEN-LAST:event_miExpiredReportActionPerformed

    private void miStockValueAnlysisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStockValueAnlysisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miStockValueAnlysisActionPerformed

    private void miSlowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSlowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miSlowActionPerformed

    private void miCustomerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCustomerReportActionPerformed
        if (securityService.hasPermission("GENERATE_REPORTs", this.userId)) {
            new CustomerDetailsReport().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miCustomerReportActionPerformed

    private void miStockReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miStockReportActionPerformed
        if (securityService.hasPermission("GENERATE_REPORTs", this.userId)) {
            new StockDetailsReport().setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "You are not authorized to access this.", "No Access", 2);
        }
    }//GEN-LAST:event_miStockReportActionPerformed

    private void miSupWisePurchasedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSupWisePurchasedActionPerformed
       
    }//GEN-LAST:event_miSupWisePurchasedActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen("abc").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuAccount;
    private javax.swing.JMenu menuCustomer;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuPurchases;
    private javax.swing.JMenu menuReport;
    private javax.swing.JMenu menuSales;
    private javax.swing.JMenu menuStock;
    private javax.swing.JMenu menuSupplier;
    private javax.swing.JMenu menuUserRole;
    private javax.swing.JMenuItem miAddCus;
    private javax.swing.JMenuItem miAddSupp;
    private javax.swing.JMenuItem miAddproduct;
    private javax.swing.JMenuItem miChangePassword;
    private javax.swing.JMenuItem miChangeRole;
    private javax.swing.JMenuItem miCreateAcc;
    private javax.swing.JMenuItem miCusWiseSales;
    private javax.swing.JMenuItem miCustomerReport;
    private javax.swing.JMenuItem miDailySalesReport;
    private javax.swing.JMenuItem miEditAcc;
    private javax.swing.JMenuItem miEditRole;
    private javax.swing.JMenuItem miExit;
    private javax.swing.JMenuItem miExpiredReport;
    private javax.swing.JMenuItem miFast;
    private javax.swing.JMenuItem miMonthlySalesReport;
    private javax.swing.JMenuItem miProductReport;
    private javax.swing.JMenuItem miPurchase;
    private javax.swing.JMenuItem miSales;
    private javax.swing.JMenuItem miSearchCus;
    private javax.swing.JMenuItem miSearchProduct;
    private javax.swing.JMenuItem miSearchSup;
    private javax.swing.JMenuItem miSlow;
    private javax.swing.JMenuItem miStockReport;
    private javax.swing.JMenuItem miStockValueAnlysis;
    private javax.swing.JMenuItem miSupWisePurchased;
    private javax.swing.JMenuItem miSupplierReport;
    // End of variables declaration//GEN-END:variables
}