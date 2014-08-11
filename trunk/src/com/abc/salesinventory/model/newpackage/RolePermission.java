package com.abc.salesinventory.model.newpackage;
// Generated Jun 19, 2014 10:37:25 PM by Hibernate Tools 3.6.0

import java.util.HashSet;




/**
 * RolePermission generated by hbm2java
 */
public class RolePermission  implements java.io.Serializable {


     private String id;
     private Permission permission;
     private Role role;

    public RolePermission() {
    }

    public RolePermission(String id, Permission permission, Role role) {
       this.id = id;
       this.permission = permission;
       this.role = role;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public Permission getPermission() {
        return this.permission;
    }
    
    public void setPermission(Permission permission) {
        this.permission = permission;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }
}


