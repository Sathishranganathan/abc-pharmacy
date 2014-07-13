/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.ui.newpackage;

import javax.swing.JOptionPane;

/**
 *
 * @author Manuri
 */
public class Supplier extends javax.swing.JFrame {

    /**
     * Creates new form Supplier
     */
    Validator val = new Validator();
    
    public Supplier() {
        initComponents();
        Loading();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSupplierId = new javax.swing.JTextField();
        txtSupplierName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtSupplierAddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSupplierMobile = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtSupplierHome = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtSupplierOffice = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSupplierEmail = new javax.swing.JTextField();
        btnSupplierAdd = new javax.swing.JButton();
        btnSupplierClear = new javax.swing.JButton();
        btnSupplierClose = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Add Supplier Details");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setText("Supplier ID");

        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Format - S#####");

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("*");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("*");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Supplier Name");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Address");

        txtSupplierId.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierId.setName(""); // NOI18N

        txtSupplierName.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierName.setName(""); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setText("Contact Number");

        txtSupplierAddress.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierAddress.setName(""); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setText("Mobile");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*");

        txtSupplierMobile.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierMobile.setName(""); // NOI18N
        txtSupplierMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSupplierMobileKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setText("Home");

        txtSupplierHome.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierHome.setName(""); // NOI18N

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setText("Office");

        txtSupplierOffice.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierOffice.setName(""); // NOI18N

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setText("Email");

        txtSupplierEmail.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        txtSupplierEmail.setName(""); // NOI18N

        btnSupplierAdd.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSupplierAdd.setText("Add");
        btnSupplierAdd.setName(""); // NOI18N
        btnSupplierAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierAddActionPerformed(evt);
            }
        });

        btnSupplierClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSupplierClear.setText("Clear");
        btnSupplierClear.setName(""); // NOI18N
        btnSupplierClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierClearActionPerformed(evt);
            }
        });

        btnSupplierClose.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSupplierClose.setText("Close");
        btnSupplierClose.setName(""); // NOI18N
        btnSupplierClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupplierCloseActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Format - eg:07712345678");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(164, 164, 164))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel14))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(150, 150, 150))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel7)
                                            .addGap(18, 18, 18)
                                            .addComponent(jLabel6)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSupplierMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierHome, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierOffice, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSupplierAdd)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSupplierClear)
                                .addGap(49, 49, 49)
                                .addComponent(btnSupplierClose))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txtSupplierId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtSupplierName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtSupplierAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(txtSupplierMobile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSupplierHome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtSupplierOffice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSupplierEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSupplierAdd)
                    .addComponent(btnSupplierClear)
                    .addComponent(btnSupplierClose))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSupplierAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierAddActionPerformed
        if(txtSupplierId.getText().trim().equals("") || txtSupplierName.getText().trim().equals("") || txtSupplierAddress.getText().trim().equals("")|| txtSupplierMobile.getText().trim().equals(""))
             //checks whether all required fields are filled
        {
            JOptionPane.showMessageDialog(null, "One or more Required Fields are Empty !", "Save Supplier Details", 2);
        }
        else
        {
            if(val.validateSupplierId(txtSupplierId.getText().trim()))//validates customer ID format
           {
               if(val.validatePhoneNumber(txtSupplierMobile.getText().trim()))//validates customer mobile number format
               {
                   if(txtSupplierEmail.getText().trim().equals("")||val.validEmail(txtSupplierEmail.getText().trim()))
                   {
                      try
                      {
                          //and if supplier ID is alredy exists message should be promped
                      }
                      catch(Exception x)
                      {JOptionPane.showMessageDialog(null, "Error Occured !", "Save Supplier Details", 2);}
                   }
                   else
                   {
                   JOptionPane.showMessageDialog(null, "Incorrect Email Address Format !", "Save Supplier Details", 2);
                   txtSupplierEmail.requestFocus();
                   }
               
               }
                   else
               {
                   JOptionPane.showMessageDialog(null, "Incorrect Mobile Number Format !", "Save Supplier Details", 2);
                   txtSupplierMobile.requestFocus();
               }
               
           }
            else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Employee ID Format", "Save Supplier Details", 2);
                txtSupplierId.requestFocus();
            }
        }
    }//GEN-LAST:event_btnSupplierAddActionPerformed

    private void txtSupplierMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSupplierMobileKeyTyped
       if(txtSupplierMobile.getText().length()==10)
       {
           evt.consume();
       }
    }//GEN-LAST:event_txtSupplierMobileKeyTyped

    private void btnSupplierClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierClearActionPerformed
        Loading();
    }//GEN-LAST:event_btnSupplierClearActionPerformed

    private void btnSupplierCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupplierCloseActionPerformed
        System.exit(1);
    }//GEN-LAST:event_btnSupplierCloseActionPerformed

   
    
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
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Supplier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Supplier().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSupplierAdd;
    private javax.swing.JButton btnSupplierClear;
    private javax.swing.JButton btnSupplierClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtSupplierAddress;
    private javax.swing.JTextField txtSupplierEmail;
    private javax.swing.JTextField txtSupplierHome;
    private javax.swing.JTextField txtSupplierId;
    private javax.swing.JTextField txtSupplierMobile;
    private javax.swing.JTextField txtSupplierName;
    private javax.swing.JTextField txtSupplierOffice;
    // End of variables declaration//GEN-END:variables

    private void Loading() {
        txtSupplierId.setText(null);
        txtSupplierName.setText(null);
        txtSupplierAddress.setText(null);
        txtSupplierHome.setText(null);
        txtSupplierMobile.setText(null);
        txtSupplierOffice.setText(null);
        txtSupplierEmail.setText(null);  
    }
}