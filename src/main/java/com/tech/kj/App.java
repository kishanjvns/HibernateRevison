package com.tech.kj;

import org.hibernate.cfg.Environment;

import com.tech.kj.config.HibernateConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(HibernateConfig.getSessionFactory() );
    }
}
