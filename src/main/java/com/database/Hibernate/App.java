package com.database.Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
        dinesh dn=new dinesh();
        dn.setDineshid(2);
        dn.setDineshname("Dinesh");
        dn.setDineshcolour("Red");
        
        Configuration cn=new Configuration().configure().addAnnotatedClass(dinesh.class);
        ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(cn.getProperties()).buildServiceRegistry();
        SessionFactory con=cn.buildSessionFactory(reg);
        Session session=con.openSession();
        Transaction tn=session.beginTransaction();
        dinesh din=(dinesh) session.get(dinesh.class,2);
        System.out.println(din.dineshid);
        System.out.println(din.dineshname);
        System.out.println(din.dineshcolour);
        tn.commit();
    }
}
