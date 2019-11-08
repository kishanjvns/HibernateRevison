package com.tech.kj.config;

import java.io.IOException;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.tech.kj.model.Department;
import com.tech.kj.model.Employee;
import com.tech.kj.model.OfficeResource;

public class HibernateConfig {
	static Properties properties;
	static {
		properties=new Properties();
		try {
			properties.load(HibernateConfig.class.getClassLoader().getResourceAsStream("hibernate-config.properties"));
		} catch (IOException e) {
			throw new IllegalAccessError("file nout found");
		}
		
	}
	
	public static SessionFactory getSessionFactory() {
		Configuration configuration=new Configuration();
		configuration.setProperties(properties);
		configuration.setProperty(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		configuration.setProperty(Environment.HBM2DDL_AUTO, "update");
		configuration.addAnnotatedClass(Employee.class);
		configuration.addAnnotatedClass(OfficeResource.class);
		configuration.addAnnotatedClass(Department.class);		
		configuration.setProperty(Environment.SCANNER_DISCOVERY,"class");
		ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
		SessionFactory sf=configuration.buildSessionFactory(serviceRegistry);
		return sf;
	}
}
