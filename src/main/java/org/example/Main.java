package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class Main {
    public static void main(String[] args) {

        Transaction tx=null;
        try {

            Configuration cs =new Configuration();
            Properties ps=new Properties();
            ps.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
            ps.put(Environment.URL,"jdbc:mysql://localhost:3306/ hibernate");
            ps.put(Environment.USER,"root");
            ps.put(Environment.PASS,"kondalu309");
            ps.put(Environment.DIALECT,"org.hibernate.dialect.MySQL8Dialect");
            ps.put(Environment.CURRENT_SESSION_CONTEXT_CLASS,"thread");
            ps.put(Environment.SHOW_SQL,"true");
            ps.put(Environment.HBM2DDL_AUTO,"update");
            cs.setProperties(ps);

            cs.addAnnotatedClass(Student.class);
            cs.addAnnotatedClass(CurrentStudent.class);
            cs.addAnnotatedClass(OldStudent.class);
            cs.addAnnotatedClass(WeklyStudent.class);
            cs.addAnnotatedClass(WeekendStudent.class);

            StandardServiceRegistryBuilder sr=new StandardServiceRegistryBuilder();
            ServiceRegistry sm=sr.applySettings(cs.getProperties()).build();
            SessionFactory sessionFactory= cs.buildSessionFactory(sm);
            Session session=sessionFactory.openSession();
            tx=session.beginTransaction();

            Student student=new Student("20491A0546","Yedukondalu");
            session.save(student);
            CurrentStudent currentStudent=new CurrentStudent("20491A0545","BHUVS",300,"Kondalu","9:30AM");
            session.save(currentStudent);
            OldStudent oldStudent=new OldStudent("20491A0540","Vamsi",40,"MVAmsi","vamsi98@gmail.com");
            session.save(oldStudent);
            WeklyStudent weklyStudent=new WeklyStudent("20491A0545","Bhuvana",3000,"kondalu","10:30","Bhvss","11.30");
            session.save(weklyStudent);
            WeekendStudent weekendStudent=new WeekendStudent("20491A0538","KASI",4000,"Kondalu","12:AM",38,"AKKA");
            session.save(weekendStudent);

            System.out.println(student);
            System.out.println(currentStudent);
            System.out.println(oldStudent);
            tx.commit();
            session.close();

        }catch (Exception ex)
        {
           tx.rollback();
           ex.printStackTrace();
        }


    }
}