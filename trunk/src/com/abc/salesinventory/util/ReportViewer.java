/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.util;

import com.abc.salesinventory.util.Database;
import java.awt.Container;
import java.sql.*;
import javax.swing.*;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author Sasika Suchithra
 */
public class ReportViewer extends JFrame {


    public ReportViewer(String fileName) {
        this(fileName, null);

    }

    public ReportViewer(String fileName,String s) {
        super("View Reports");
        try{
            Connection c=Database.con();
            HashMap params= new HashMap();
            params.put("Project", s);
            //JasperReport jasperReport = JasperCompileManager.compileReport(fileName);
            //Map<String, Object> params = new HashMap<String, Object>();
//            JasperPrint jasperPrint = JasperFillManager.fillReport(fileName,params, c);

//            JasperViewer.viewReport(jasperPrint,false);
//            JRViewer jr = new JRViewer(jasperPrint);
//            Container cn=getContentPane();
//            cn.add(jr);
            
        }
//        catch(ClassNotFoundException cnfe)          {
//            //cnfe.printStackTrace();
//
//            System.out.println("ERROR: "+cnfe.getMessage());
//        }
//        catch(SQLException sqle)  {
//        //sqle.printStackTrace();
//            System.out.println("ERROR: "+sqle.getMessage());
//        }
//        catch(JRException jre) {
//        //jre.printStackTrace();
//            System.out.println("ERROR: "+jre.getMessage());
//        }

        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error in generating Reports !!" , "Error", 0);
            System.out.println("ERROR: "+e.getMessage());

        }
        
        setBounds(10, 10, 1000, 800);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
//        pack();
//        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
////        java.awt.Dimension dialogSize = getSize();
//
//        setLocation(283,getLocation().y);
    }

}
