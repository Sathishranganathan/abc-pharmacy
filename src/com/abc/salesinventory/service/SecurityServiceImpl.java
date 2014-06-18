/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service;

import com.abc.salesinventory.model.User;
import com.abc.salesinventory.util.Database;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author rdjayawe
 */
public class SecurityServiceImpl implements SecurityService {

    private Database db = new Database();

    @Override
    public User getUserById(String id) throws SecurityException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String createUser(User user) throws SecurityException {

        user.setId(UUID.randomUUID().toString());
        String sql = "Insert into user(id, first_name, last_name, userid, email) values ('" + user.getId() + "','" + user.getFirstName() + "','" + user.getLastName() + "','" + user.getUserId() + "','" + user.getEmail() + "')";
        try {
            db.putdata(sql);
            return user.getId();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "User can not be saved successfully. " + ex.getMessage(), "Create User - Fail", 1);
        }
        return null;
    }

}
