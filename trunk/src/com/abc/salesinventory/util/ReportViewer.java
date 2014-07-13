/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.util;

import java.awt.Container;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;
import javax.swing.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author
 */
public class ReportViewer extends JFrame {

    private String reportPath = "C:\\Users\\rdjayawe\\Downloads\\ayesha_project\\source\\SalesInventorySystem\\src\\com\\abc\\salesinventory\\report\\";

    public ReportViewer(String fileName) {
        this(fileName, null);
    }

    public ReportViewer(String fileName, HashMap params) {
        super("View Reports");
        try {
            Connection con = Database.con();

            InputStream stream = new FileInputStream(new File(reportPath + fileName));
            JasperDesign jasperDesign = JRXmlLoader.load(stream);
            JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, con);
            JasperViewer.viewReport(jasperPrint, false);
            JRViewer jr = new JRViewer(jasperPrint);

            Container cn = getContentPane();
            cn.add(jr);

        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
            System.out.println("ERROR: " + cnfe.getMessage());
            JOptionPane.showMessageDialog(null, "Error in generating Reports !!" + cnfe.getMessage(), "Error", 0);
        } catch (SQLException sqle) {
            sqle.printStackTrace();
            System.out.println("ERROR: " + sqle.getMessage());
            JOptionPane.showMessageDialog(null, "Error in generating Reports !!" + sqle.getMessage(), "Error", 0);
        } catch (JRException jre) {
            jre.printStackTrace();
            System.out.println("ERROR: " + jre.getMessage());
            JOptionPane.showMessageDialog(null, "Error in generating Reports !!" + jre.getMessage(), "Error", 0);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error in generating Reports !!" + e.getMessage(), "Error", 0);
            System.out.println("ERROR: " + e.getMessage());
        }
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        pack();
    }

    public static void main(String a[]) {
        ReportViewer reportViewer = new ReportViewer("report1.jrxml");

    }
}
