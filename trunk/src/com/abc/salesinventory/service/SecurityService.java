/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service;

import com.abc.salesinventory.model.*;

/**
 *
 * @author rdjayawe
 */
public interface SecurityService {
    
    public User getUserById(String id) throws SecurityException;
    
    public String createUser(User user) throws SecurityException;
    
}
