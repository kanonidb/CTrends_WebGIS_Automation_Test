package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.UserForm;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FormRepository {

    private static FormRepository formRepository = null;

    public static FormRepository getInstance() {
        if(formRepository == null) {
            formRepository = new FormRepository();
        }
        return formRepository;
    }
    //SAVE USER
    public boolean saveUserForm(UserForm userForm){
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.save("144");
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            System.out.println("########" + e);
            e.printStackTrace();
            try {
                tx.rollback();
            } catch (Exception ex) {
            }
        }
        System.out.println("false");
        return false;
    }
}
