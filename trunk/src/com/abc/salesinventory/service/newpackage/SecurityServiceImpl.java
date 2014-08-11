/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Permission;
import com.abc.salesinventory.model.newpackage.Role;
import com.abc.salesinventory.util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author rdjayawe
 */
public class SecurityServiceImpl implements SecurityService {

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
