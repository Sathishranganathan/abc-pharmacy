/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author Sasika Suchithra
 */
public class Database {

    static int option = -1;
    static String driver = "com.mysql.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/Pharmacy";

    public static Connection con() throws Exception {
        Class.forName(driver);
        Connection con1 = DriverManager.getConnection(url, "root", "password");
        return con1;
    }

    public ResultSet getdata(String sql) throws Exception {
//    try {
        Statement st = Database.con().createStatement();
        ResultSet rset = st.executeQuery(sql);
        return rset;

//     } catch (Exception e) {
//        JOptionPane.showMessageDialog(null, "Data NOT found!!", "Error", 0);
//        System.out.println("Error : " + e);
//         return null;
//     }
    }

    public void putdata(String sql) throws Exception {
        try {
            PreparedStatement ps = Database.con().prepareStatement(sql);
            ps.executeUpdate();
            if (sql.startsWith("Insert")) {
                JOptionPane.showMessageDialog(null, "Your data saved successfully!!", "Save - Success", 1);
            } else if (sql.startsWith("Update")) {
                JOptionPane.showMessageDialog(null, "Your data updated successfully!!", "Update - Success", 1);
            } else if (sql.startsWith("Delete")) {
                JOptionPane.showMessageDialog(null, "Your data deleted successfully!!", "Delete - Success", 1);
            }

        } catch (Exception e) {
            System.out.println(e);
            if (sql.startsWith("Insert")) {
                JOptionPane.showMessageDialog(null, "Your data NOT saved successfully!!", "Save - Error", 0);
            } else if (sql.startsWith("Update")) {
                JOptionPane.showMessageDialog(null, "Your data NOT updated successfully!!", "Update - Error", 0);
            } else if (sql.startsWith("Delete")) {
                JOptionPane.showMessageDialog(null, "Your data NOT deleted successfully!!", "Delete - Error", 0);
            }
        }
    }

    public void putdata(List<String> sqlList) throws Exception {
        try {
            Connection con = Database.con();
            Statement stmt = con.createStatement();
            con.setAutoCommit(false);
            for (Iterator<String> it = sqlList.iterator(); it.hasNext();) {
                String SQLstmt = it.next();
                stmt.addBatch(SQLstmt);
            }
            int[] count = stmt.executeBatch();
            con.commit();
            JOptionPane.showMessageDialog(null, "Your request processed successfully!!", "Save - Success", 1);
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Your request NOT processed successfully!!", "Save - Error", 0);
        }
    }
}
