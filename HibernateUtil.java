package com.jpspiders.hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// hibernate files are uploaded

public class HibernateUtil {

	private final static SessionFactory factory;
	
	static {
		Configuration cfg = new Configuration();
		cfg.configure();
		factory = cfg.buildSessionFactory();
	}
	
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
