package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.UserData;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDataRepository {

    private static UserDataRepository userDataRepository = null;

    public static UserDataRepository getInstance() {
        if(userDataRepository == null) {
            userDataRepository = new UserDataRepository();
        }
        return userDataRepository;
    }
    public UserData getUserData() {

        Transaction tx = null;

        UserData userData = null;

        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            userData  = (UserData) session.get(UserData.class, 1);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("########" + e);
            e.printStackTrace();
            try {
                tx.rollback();
            } catch (Exception ex) {
            }
        }
        return userData;
    }

    }

