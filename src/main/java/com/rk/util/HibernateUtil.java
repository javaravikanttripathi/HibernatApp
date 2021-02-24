package com.rk.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sf;

	private HibernateUtil() {

	}

	static {
		sf = new Configuration().configure().buildSessionFactory();
	}

	public static SessionFactory getSf() {
		return sf;
	}

}
