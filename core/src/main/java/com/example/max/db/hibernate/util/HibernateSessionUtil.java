package com.example.max.db.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Objects;

public class HibernateSessionUtil {
    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();
        return factory;
    }

    public static void shutDown() {
        if (!Objects.isNull(factory)) {
            factory.close();
        }
    }
}
