/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Sell.java
 *
 * Created on Feb 15, 2014, 4:37:26 PM
 */
package com.abc.salesinventory.ui;


import com.abc.salesinventory.model.Sell;
import com.abc.salesinventory.model.SellItem;
import com.abc.salesinventory.service.ItemService;
import com.abc.salesinventory.service.ItemServiceImpl;
import com.abc.salesinventory.service.SellService;
import com.abc.salesinventory.service.SellServiceImpl;
import com.abc.salesinventory.service.StockService;
import com.abc.salesinventory.service.StockServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import org.apache.log4j.Logger;

/**
 *
 * @author Thushara
 */
public class IssueItemForm extends javax.swing.JFrame {

    private ItemService itemService = new ItemServiceImpl();
    private StockService stockService = new StockServiceImpl();
    private SellService sellService = new SellServiceImpl();
    private SearchItemForIssueForm searchItemForm = new SearchItemForIssueForm();
    private SellItem selectedSellItem;
    private List<SellItem> items = new ArrayList<SellItem>();

    /** Creates new form Sell */
    public IssueItemForm() {
        initComponents();
        DefaultTableModel T1 = (DefaultTableModel) issueItemTable.getModel();
        T1.addTableModelListener(new TableModelListener() {

            public void tableChanged(TableModelEvent e) {

                if (!items.isEmpty() && e.getType() == TableModelEvent.UPDATE) {
                    double editedQty = 0;
                    int selectedRow = issueItemTable.getSelectedRow();
                    int selectedColumn = issueItemTable.getSelectedColumn();
                    editedQty = (Double) issueItemTable.getValueAt(selectedRow, selectedColumn);
                    try {
                        selectedSellItem = items.get(selectedRow);
                        if (itemService.getAvalilableQtyFromDB(selectedSellItem.getId())>=editedQty) {
                            selectedSellItem.setQty(editedQty);
                        } else {
                            JOptionPane.showMessageDialog(null, "Sorry! No enough stocks available", "Add Quantity", 2);
                        }
                        refreshTable();
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, ex, "Edit Quantity", 2);
                    }
                }

            }
        });
        //issueItemTable.setCellEditor(new DoubleEditor());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        search = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        issue = new javax.swing.JButton();
        code = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        issueItemTable = new javax.swing.JTable();
        count = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JButton();
        remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Issue Medicine");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 90, -1));

        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        jPanel1.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 370, 70, -1));

        issue.setText("Issue");
        issue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueActionPerformed(evt);
            }
        });
        jPanel1.add(issue, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 70, -1));

        code.setBackground(new java.awt.Color(219, 237, 255));
        jPanel1.add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 280, -1));

        issueItemTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Brand Name", "Category", "Unit Price (LKR)", "Quantity", "Unit", "Price (LKR)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        issueItemTable.getTableHeader().setReorderingAllowed(false);
        issueItemTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                issueItemTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(issueItemTable);
        issueItemTable.getColumnModel().getColumn(0).setPreferredWidth(15);
        issueItemTable.getColumnModel().getColumn(1).setPreferredWidth(100);
        issueItemTable.getColumnModel().getColumn(2).setPreferredWidth(40);
        issueItemTable.getColumnModel().getColumn(3).setPreferredWidth(25);
        issueItemTable.getColumnModel().getColumn(4).setPreferredWidth(10);
        issueItemTable.getColumnModel().getColumn(5).setPreferredWidth(3);
        issueItemTable.getColumnModel().getColumn(6).setPreferredWidth(15);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 670, 240));

        count.setFont(new java.awt.Font("Tahoma", 1, 14));
        count.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        count.setText("0");
        jPanel1.add(count, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 30, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("No of Items :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Total (LKR):");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        total.setFont(new java.awt.Font("Tahoma", 1, 14));
        total.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        total.setText("0.00");
        jPanel1.add(total, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, -1, -1));

        jLabel3.setText("Medicine Code :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 90, -1));

        remove.setText("Remove");
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel1.add(remove, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
        );

        pack();
        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        java.awt.Dimension dialogSize = getSize();
        setLocation((screenSize.width-dialogSize.width)/2,(screenSize.height-dialogSize.height)/2);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchItemForm.setVisible(true);
        searchItemForm.setSelectedItemNull();

        new Thread(new Runnable() {

            public void run() {
                while (searchItemForm.getSelectedItem() == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Logger.getLogger(IssueItemForm.class.getName()).error("Thread failed");
                    }
                }
                SellItem foundItem = itemService.parseSellItem(searchItemForm.getSelectedItem());
                if (foundItem.getId() != 0) {
                    if (items.contains(foundItem)) {
                        JOptionPane.showMessageDialog(null, "Already added! ", "Add", 2);
                    } else {
                        items.add(foundItem);
                    }
                }
                refreshTable();
            }
        }).start();
}//GEN-LAST:event_searchActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        code.setText(null);
        items.clear();
        refreshTable();
}//GEN-LAST:event_btnresetActionPerformed

    private void issueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueActionPerformed
        Sell sell = new Sell();
        sell.setId(sellService.sellId());
        sell.setTotalPrice(Double.parseDouble(total.getText()));
        sellService.save(sell, items);
        this.dispose();
}//GEN-LAST:event_issueActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        if (code.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter valid Medincine code ", "Add", 2);
        } else {
            SellItem foundItem = itemService.findOneByCode(code.getText());
            if (foundItem == null) {
                JOptionPane.showMessageDialog(null, "Invalid Medincine code,\nNo medicine found! ", "Add", 2);
            } else if (items.contains(foundItem)) {
                JOptionPane.showMessageDialog(null, "Already added! ", "Add", 2);
            } else {
                items.add(foundItem);
            }
            refreshTable();
        }
    }//GEN-LAST:event_addActionPerformed

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try {
            selectedSellItem = items.get(issueItemTable.getSelectedRow());
            items.remove(selectedSellItem);
            refreshTable();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Select a Medicine to remove!", "Remove", 2);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void issueItemTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_issueItemTableKeyPressed
    }//GEN-LAST:event_issueItemTableKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new IssueItemForm().setVisible(true);
            }
        });
    }

    private void refreshTable() {
        DefaultTableModel T1 = (DefaultTableModel) issueItemTable.getModel();
        int rowcount = T1.getRowCount();
        for (int i = 0; i < rowcount; i++) {
            T1.removeRow(0);
        }
        double totalPrice = 0;
        if (!items.isEmpty()) {
            for (Iterator<SellItem> it = items.iterator(); it.hasNext();) {
                SellItem item = it.next();
                Vector vec = new Vector();
                vec.add(item.getItemCode());
                vec.add(item.getBrandName());
                vec.add(item.getCategory());
                vec.add(item.getUnitPrice());
                vec.add(item.getQty());
                vec.add(item.getUnit());
                vec.add(item.getPrice());
                T1.addRow(vec);
                totalPrice = totalPrice + item.getPrice();
            }
        }
        count.setText(String.valueOf(T1.getRowCount()));
        total.setText(String.valueOf(totalPrice));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton btnreset;
    private javax.swing.JTextField code;
    private javax.swing.JLabel count;
    private javax.swing.JButton issue;
    private javax.swing.JTable issueItemTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton remove;
    private javax.swing.JButton search;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
