/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Permission;
import com.abc.salesinventory.model.newpackage.Role;
import java.util.Set;
import org.hibernate.HibernateException;

/**
 *
 * @author rdjayawe
 */
public interface SecurityService {

    public Role getRole(String roleId);

    public Set<Role> getAllRoles();

    public String saveOrUpdateRole(Role role) throws HibernateException;

    public void removeRole(Role role);

    public Role getRoleByName(String roleName);

    public Permission getPermission(String permissionId);

    public Set<Permission> getAllPermissions();

    public String saveOrUpdatePermission(Permission permission) throws HibernateException;

    public void removePermission(Permission permission);

    public Permission getPermissionByName(String permissionName);

}