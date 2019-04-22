package com.rans.demosite;
 
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public class CourseDao {
    public boolean save(CourseModel courseModel) {
        try {
            Session session = HibernateUtil.getInstance().getSession();
            Transaction transaction = session.beginTransaction();
            session.save(courseModel);
            transaction.commit();
            session.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public CourseModel find(String id) {
        Session session = HibernateUtil.getInstance().getSession();
        CourseModel mailModel = session.find(CourseModel.class, id);
        session.close();
        return mailModel;
    }

}