/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * SearchItemForm.java
 *
 * Created on Feb 10, 2014, 2:13:11 PM
 */
package com.abc.salesinventory.ui;

import com.abc.salesinventory.service.ItemService;
import com.abc.salesinventory.service.ItemServiceImpl;
import com.abc.salesinventory.model.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DAS
 */
public class SearchItemForIssueForm extends javax.swing.JFrame {

    private ItemService itemService = new ItemServiceImpl();
    private Item selectedItem;
    private List<Item> items = new ArrayList<Item>();

    /** Creates new form SearchItemForm */
    public SearchItemForIssueForm() {
        initComponents();
        items = itemService.findAll();
        refreshTable();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        select = new javax.swing.JButton();
        key = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        supplier = new javax.swing.JRadioButton();
        brandName = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchItemTable = new javax.swing.JTable();
        code = new javax.swing.JRadioButton();
        category = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Medicine Search");
        setAlwaysOnTop(true);
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setText("Enter keyword to search..");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        btnsave.setText("Search");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 80, 90, -1));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, 70, -1));

        select.setText("Select");
        select.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActionPerformed(evt);
            }
        });
        jPanel1.add(select, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 70, -1));

        key.setBackground(new java.awt.Color(219, 237, 255));
        jPanel1.add(key, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 840, -1));

        jLabel3.setText("Search by");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        supplier.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(supplier);
        supplier.setText("Supplier");
        supplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierActionPerformed(evt);
            }
        });
        jPanel1.add(supplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        brandName.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(brandName);
        brandName.setText("Brand Name");
        brandName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brandNameActionPerformed(evt);
            }
        });
        jPanel1.add(brandName, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, -1, -1));

        searchItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Brand Name", "Category", "Supplier", "Unit Price(LKR)", "Available Qty", "Unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchItemTable.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(searchItemTable);
        searchItemTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        searchItemTable.getColumnModel().getColumn(0).setPreferredWidth(15);
        searchItemTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        searchItemTable.getColumnModel().getColumn(2).setPreferredWidth(50);
        searchItemTable.getColumnModel().getColumn(3).setPreferredWidth(200);
        searchItemTable.getColumnModel().getColumn(4).setPreferredWidth(20);
        searchItemTable.getColumnModel().getColumn(5).setPreferredWidth(10);
        searchItemTable.getColumnModel().getColumn(6).setPreferredWidth(10);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 940, 270));

        code.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(code);
        code.setSelected(true);
        code.setText("Code");
        code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeActionPerformed(evt);
            }
        });
        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        category.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(category);
        category.setText("Category");
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });
        jPanel1.add(category, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 999, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if (key.getText().isEmpty() || key.getText().length() < 2) {
            JOptionPane.showMessageDialog(null, "Enter valid keyword to search !", "Search", 2);
        } else {
            if (code.isSelected()) {
                items = itemService.findByCode(key.getText());
            } else if (brandName.isSelected()) {
                items = itemService.findByBrandName(key.getText());
            } else if (category.isSelected()) {
                items = itemService.findByCategory(key.getText());
            } else if (supplier.isSelected()) {
                items = itemService.findBySupplier(key.getText());
            }
            refreshTable();
        }
}//GEN-LAST:event_btnsaveActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        key.setText(null);
        code.setSelected(true);
        items.clear();
        items = itemService.findAll();
        refreshTable();
    }//GEN-LAST:event_btnresetActionPerformed

    private void selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActionPerformed
        try {
            selectedItem = items.get(searchItemTable.getSelectedRow());
            this.dispose();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select a Medicine !", "Search Medicine", 2);
        }
}//GEN-LAST:event_selectActionPerformed

    private void supplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierActionPerformed

    private void brandNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brandNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_brandNameActionPerformed

    private void codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeActionPerformed

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        selectedItem= new Item();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SearchItemForIssueForm().setVisible(true);
            }
        });
    }

    private void refreshTable() {
        DefaultTableModel T1 = (DefaultTableModel) searchItemTable.getModel();
        int rowcount = T1.getRowCount();
        for (int i = 0; i < rowcount; i++) {
            T1.removeRow(0);
        }

        if (!items.isEmpty()) {
            for (Iterator<Item> it = items.iterator(); it.hasNext();) {
                Item item = it.next();
                Vector vec = new Vector();
                vec.add(item.getItemCode());
                vec.add(item.getBrandName());
                vec.add(item.getCategory());
                vec.add(item.getSupplier());
                vec.add(item.getUnitPrice());
                vec.add(itemService.getAvalilableQtyFromDB(item.getId()));
                vec.add(item.getUnit());
                T1.addRow(vec);
            }
        } else {
            JOptionPane.showMessageDialog(null, "No Results Found !", "Search", 1);
        }
    }

    public Item getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItemNull() {
        selectedItem = null;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton brandName;
    private javax.swing.JButton btnreset;
    private javax.swing.JButton btnsave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton category;
    private javax.swing.JRadioButton code;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField key;
    private javax.swing.JTable searchItemTable;
    private javax.swing.JButton select;
    private javax.swing.JRadioButton supplier;
    // End of variables declaration//GEN-END:variables
}
