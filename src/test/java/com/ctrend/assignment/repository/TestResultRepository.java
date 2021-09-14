package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.UiResultTable;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.List;

public class TestResultRepository {


    private static TestResultRepository testResultRepository = null;

    public static TestResultRepository getInstance() {
        if(testResultRepository == null) {
            testResultRepository = new TestResultRepository();
        }
        return testResultRepository;
    }

//LIST
    public List<UiResultTable> getTestResultList() {
        Transaction tx = null;

        List<UiResultTable> testResults = null;

        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            Query q = (Query) session.createQuery("select a from Emp a");
            testResults = q.getResultList();
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("########" + e);
            e.printStackTrace();
            try {
                tx.rollback();
            } catch (Exception ex) {
            }
        }
        return testResults;
    }


    //SAVE USER
    public void postTestResultData(UiResultTable testResult){
        Transaction tx = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            tx = session.beginTransaction();
            session.save(testResult);
            session.getTransaction().commit();
        } catch (Exception e) {
            System.out.println("########" + e);
            e.printStackTrace();
            try {
                tx.rollback();
            } catch (Exception ex) {
            }
        }
    }
}
