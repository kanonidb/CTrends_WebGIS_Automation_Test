package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.BaseEntity;
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
    public BaseEntity getUser(int i) {

      Transaction tx = null;
        BaseEntity user = null;
      try {
          Session session = HibernateUtil.getSessionFactory().getCurrentSession();
          tx = session.beginTransaction();
          user  = (BaseEntity)session.get(BaseEntity.class, i);

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


    public List<BaseEntity> getEmps() {


        Transaction tx = null;

        List<BaseEntity> empList = null;

        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
//            Criteria cr = session.createCriteria(BaseEntity.class);

         Query q = session.createQuery("SELECT * FROM baseentity");
            empList = q.list();

        } catch (Exception e) {
            System.out.println("########" + e);
            e.printStackTrace();
            try {
                tx.rollback();
            } catch (Exception ex) {
            }
        }
        System.out.println(empList);
        return empList;
    }
    
}
