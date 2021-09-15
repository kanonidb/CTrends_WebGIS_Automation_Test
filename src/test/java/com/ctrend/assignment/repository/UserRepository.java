package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.BaseEntity;
import com.ctrend.assignment.model.Login;
import org.hibernate.*;
import org.hibernate.query.Query;


import java.util.List;


public class UserRepository {

	private static UserRepository repository = null;

    public static UserRepository getInstance() {
    	if(repository == null) {
    		repository = new UserRepository();    		
    	}
        return repository;
    }

//    GET USER ID PASSWORD
    public Login getUser(int i) {

      Transaction tx = null;
        Login user = null;
      try {
          Session session = HibernateUtil.getSessionFactory().getCurrentSession();
          tx = session.beginTransaction();
          user  = (Login)session.get(Login.class, i);

          session.getTransaction().commit();
      } catch (Exception e) {
          System.out.println("########" + e);
          e.printStackTrace();
          try {
              tx.rollback();
          } catch (Exception ex) {
          }
      }
      return user;
  }



    
}
