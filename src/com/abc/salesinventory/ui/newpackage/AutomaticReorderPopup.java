/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.ui.newpackage;

import com.abc.salesinventory.service.newpackage.InventoryService;
import com.abc.salesinventory.service.newpackage.InventoryServiceImpl;
import com.abc.salesinventory.service.sms.SMSMessageEngine;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import org.smslib.GatewayException;
import org.smslib.TimeoutException;

/**
 *
 * @author Manuri
 */
public class AutomaticReorderPopup extends javax.swing.JFrame {

    InventoryService inventoryService = new InventoryServiceImpl();
    Object[] value = new Object[8];
    SMSMessageEngine engine = null;
    

    /**
     * Creates new form AutomaticReorderPopup
     */
    public AutomaticReorderPopup(SMSMessageEngine engine) {
        initComponents();
        this.engine = engine;
        List list = inventoryService.getReorderStockWithSupplier();
        if (list != null) {
            displayResult(list);
        }
    }

    private void displayResult(List resultList) {

        Vector<String> tableHeaders = new Vector<String>();
        tableHeaders.add("Product Code");
        tableHeaders.add("Product Name");
        tableHeaders.add("Product Unit");
        tableHeaders.add("Supplier Id");
        tableHeaders.add("Supplier Name");
        tableHeaders.add("Contact No");
        tableHeaders.add("Re-Order Qty");
        tableHeaders.add("Standard Re-Order Level");

        Vector tableData = new Vector();
        Iterator it = resultList.iterator();
        while (it.hasNext()) {

            Object row[] = (Object[]) it.next();
            Vector<Object> oneRow = new Vector<Object>();
            oneRow.add(row[0]);
            oneRow.add(row[1]);
            oneRow.add(row[2]);
            oneRow.add(row[3]);
            oneRow.add(row[4]);
            oneRow.add(row[5]);
            oneRow.add(row[6]);
            oneRow.add(row[8]);
            tableData.add(oneRow);
        }
        tblReOrder.setModel(new DefaultTableModel(tableData, tableHeaders));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblReOrder = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnSend = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaMessage = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Product Re-Order");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product Re-Order");

        tblReOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product Code", "Product Name", "Product Unit", "Supplier ID", "Supplier Name", "Mobile Number", "Re-Order Qty", "Standard Reorder Level"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblReOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblReOrderMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblReOrder);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Message");

        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("Select Product to show the message");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        txtaMessage.setColumns(20);
        txtaMessage.setRows(5);
        jScrollPane2.setViewportView(txtaMessage);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4))
                                    .addComponent(btnSend))
                                .addGap(0, 25, Short.MAX_VALUE))
                            .addComponent(jScrollPane1))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSend)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {

            engine.sendSMSMessage((String) value[5], txtaMessage.getText());

        } catch (InterruptedException | TimeoutException | GatewayException | IOException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error Occured !", ex.getMessage(), 2);
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void tblReOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblReOrderMouseClicked

        int[] selRows;
        selRows = tblReOrder.getSelectedRows();

        if (selRows.length > 0) {
            for (int i = 0; i < 8; i++) {
                // get Table data
                TableModel tm = tblReOrder.getModel();
                value[i] = tm.getValueAt(selRows[0], i);

            }
        }
        txtaMessage.setText("Hello Mr. :" + value[4] + "(Supplier ID " + value[3] + "). We would like to order " + value[7] + " " + value[1] + " " + value[2] + "(Product Code " + value[0] + "). Please be kind to send the confirmation with your suplier ID & the product code. Thank you. Eraj Pharmaceuticals ");
    }//GEN-LAST:event_tblReOrderMouseClicked

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
            java.util.logging.Logger.getLogger(AutomaticReorderPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AutomaticReorderPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AutomaticReorderPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AutomaticReorderPopup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SMSMessageEngine engine = new SMSMessageEngine();
                engine.init();
                new AutomaticReorderPopup(engine).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSend;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblReOrder;
    private javax.swing.JTextArea txtaMessage;
    // End of variables declaration//GEN-END:variables
}
