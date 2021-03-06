package com.ctrend.assignment.repository;

import com.ctrend.assignment.hi_cofig.HibernateUtil;
import com.ctrend.assignment.model.Ui_define_administrative_area_on_map;
import javax.persistence.Query;
import javax.persistence.criteria.*;
import org.hibernate.*;
import java.util.List;

public class D_AD_area_on_map_repository {

    private static D_AD_area_on_map_repository d_ad_area_on_map_repository = null;

    public static D_AD_area_on_map_repository getInstance(){
        if (d_ad_area_on_map_repository == null){
            d_ad_area_on_map_repository = new D_AD_area_on_map_repository();
        }
        return d_ad_area_on_map_repository;
    }

    public List<Ui_define_administrative_area_on_map> findAll() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Ui_define_administrative_area_on_map> query = builder.createQuery(Ui_define_administrative_area_on_map.class);
        Root<Ui_define_administrative_area_on_map> root = query.from(Ui_define_administrative_area_on_map.class);
        query.select(root);
        Query q = session.createQuery("FROM Ui_define_administrative_area_on_map");
        List<Ui_define_administrative_area_on_map> appmasters =q.getResultList();
//        for (Ui_define_administrative_area_on_map appmaster : appmasters) {
//            System.out.println(appmaster.getSeq());
//        }
       transaction.commit();
        return appmasters;
    }

}
