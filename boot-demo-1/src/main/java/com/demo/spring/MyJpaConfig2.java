package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
public class MyJpaConfig2 {
    @Bean
    public DataSource mydataSource2(){
        System.out.println(":::::::Profile test activated and DS created :::::::");
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:file:./data/testdb;DB_CLOSE_ON_EXIT=FALSE");
        ds.setUsername("sa");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory2(){
        LocalContainerEntityManagerFactoryBean lcb= new LocalContainerEntityManagerFactoryBean();
        lcb.setDataSource(mydataSource2());
        lcb.setPackagesToScan("com.demo.spring.entities");
        lcb.setPersistenceUnitName("empapp2");

        HibernateJpaVendorAdapter va= new HibernateJpaVendorAdapter();
        va.setShowSql(true);
        va.setDatabase(Database.H2);

        lcb.setJpaVendorAdapter(va);
        return lcb;
    }

    @Bean
    public PlatformTransactionManager transactionManager2(){
        JpaTransactionManager tx= new JpaTransactionManager();
        tx.setEntityManagerFactory(entityManagerFactory2().getObject());
        return tx;
    }
}
