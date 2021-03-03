package com.xworkz.waterfalls.util;

import org.hibernate.SessionFactory;
import com.xworkz.waterfalls.Exception.SFCreationException;
import org.hibernate.cfg.Configuration;


public class SFSingleTon {
	public static SessionFactory factory;

	public static SessionFactory getFactory() {
		return factory;
	}

	static {
		try {
			Configuration con = new Configuration();
			con.configure();
			factory = con.buildSessionFactory();
			if (factory != null) {
				System.out.println("session created successfuly");
			} else {
				throw new SFCreationException("unable to create");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
