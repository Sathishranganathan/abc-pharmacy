package com.abc.salesinventory.model.newpackage;
// Generated Aug 11, 2014 2:22:10 PM by Hibernate Tools 3.6.0



/**
 * UserRole generated by hbm2java
 */
public class UserRole  implements java.io.Serializable {


     private String id;
     private User user;
     private Role role;

    public UserRole() {
    }

    public UserRole(String id, User user, Role role) {
       this.id = id;
       this.user = user;
       this.role = role;
    }
   
    public String getId() {
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public Role getRole() {
        return this.role;
    }
    
    public void setRole(Role role) {
        this.role = role;
    }




}


