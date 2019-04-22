package com.sell.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUI {

	public static SessionFactory getSessionFactory() {
		return new Configuration().configure().buildSessionFactory();
	}
	
}
