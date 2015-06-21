/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.abc.salesinventory.service.newpackage;

import com.abc.salesinventory.model.newpackage.Message;
import com.abc.salesinventory.util.HibernateUtil;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Manuri
 */
public class MessageServiceImpl implements MessageService {
    
    @Override
    public List<Object> getSupplierNameWithMessage() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Query query = session.createSQLQuery(
                "SELECT m.supplier_id, s.name, m.message, m.msg_date, m.message_type, m.contact_number\n" +
"FROM pharmacy.message m join pharmacy.supplier s on m.supplier_id=s.id");

        List<Object> resultList = query.list();
        session.getTransaction().commit();
        session.close();
        if (resultList != null && resultList.size() > 0) {
            return resultList;
        }
        return null;
    }
    
}
