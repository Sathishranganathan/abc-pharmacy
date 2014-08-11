/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Permission;
import com.abc.salesinventory.model.newpackage.Role;
import com.abc.salesinventory.model.newpackage.User;
import com.abc.salesinventory.util.HibernateUtil;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rdjayawe
 */
public class SecurityServiceImpl implements SecurityService {

    @Override
    public String getPasswordHash(String plainTextPassword) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(plainTextPassword.getBytes("UTF-8"));
            byte[] bytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, "Password hashing failed!", "Save User Details", 2);
            return null;
        }
    }

    @Override
    public boolean isPasswordCorrect(String plainTextPassword, String userId) {
        try {
            User user = getUserByUserName(userId);

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(plainTextPassword.getBytes("UTF-8"));
            byte[] bytes = md.digest();

            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }

            return sb.toString().equals(user.getPassword());
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            JOptionPane.showMessageDialog(null, "Password hashing failed!", "Save User Details", 2);
            return false;
        }
    }

    @Override
    public String saveOrUpdateUser(User user) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(user);
        session.getTransaction().commit();
        return user.getId();
    }

    @Override
    public void removeUser(User user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(user);
        session.getTransaction().commit();
    }

    @Override
    public User getUser(String userId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from User c where c.id='" + userId + "' ";
        Query q = session.createQuery(hql);
        List<User> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public User getUserByUserName(String userName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from User c where c.userid='" + userName + "' ";
        Query q = session.createQuery(hql);
        List<User> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<User> getAllUsers() {
        Set<User> users = new HashSet<User>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from User";
        Query q = session.createQuery(hql);
        List<User> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() > 0) {
            users.addAll(resultList);
        }
        return users;
    }

    ///Role///////////////////////////////////////////////
    @Override
    public String saveOrUpdateRole(Role role) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(role);
        session.getTransaction().commit();
        return role.getId();
    }

    @Override
    public void removeRole(Role role) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(role);
        session.getTransaction().commit();
    }

    @Override
    public Role getRole(String roleId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Role c where c.id='" + roleId + "' ";
        Query q = session.createQuery(hql);
        List<Role> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Role getRoleByName(String roleName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Role c where c.name='" + roleName + "' ";
        Query q = session.createQuery(hql);
        List<Role> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Role> getAllRoles() {
        Set<Role> roles = new HashSet<Role>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Role";
        Query q = session.createQuery(hql);
        List<Role> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() > 0) {
            roles.addAll(resultList);
        }
        return roles;
    }

    //Permission>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @Override
    public String saveOrUpdatePermission(Permission role) throws HibernateException {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.saveOrUpdate(role);
        session.getTransaction().commit();
        return role.getId();
    }

    @Override
    public void removePermission(Permission role) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(role);
        session.getTransaction().commit();
    }

    @Override
    public Permission getPermission(String roleId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Permission c where c.id='" + roleId + "' ";
        Query q = session.createQuery(hql);
        List<Permission> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Permission getPermissionByName(String roleName) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Permission c where c.name='" + roleName + "' ";
        Query q = session.createQuery(hql);
        List<Permission> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() == 1) {
            return resultList.get(0);
        }
        return null;
    }

    @Override
    public Set<Permission> getAllPermissions() {
        Set<Permission> roles = new HashSet<Permission>();

        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        String hql = "from Permission";
        Query q = session.createQuery(hql);
        List<Permission> resultList = q.list();
        session.getTransaction().commit();
        if (resultList != null && resultList.size() > 0) {
            roles.addAll(resultList);
        }
        return roles;
    }

}
