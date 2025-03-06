package com.demo.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import javax.sql.DataSource;

@Configuration
@Primary
public class MyJpaConfig {
    @Bean
    public DataSource mydataSource(){
        System.out.println(":::::::Profile test activated and DS created :::::::");
        DriverManagerDataSource ds= new DriverManagerDataSource();
        ds.setDriverClassName("org.h2.Driver");
        ds.setUrl("jdbc:h2:file:./data/testdb;DB_CLOSE_ON_EXIT=FALSE");
        ds.setUsername("sa");
        return ds;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
        LocalContainerEntityManagerFactoryBean lcb= new LocalContainerEntityManagerFactoryBean();
        lcb.setDataSource(mydataSource());
        lcb.setPackagesToScan("com.demo.spring.entities");
        lcb.setPersistenceUnitName("empapp");

        HibernateJpaVendorAdapter va= new HibernateJpaVendorAdapter();
        va.setShowSql(true);
        va.setDatabase(Database.H2);

        lcb.setJpaVendorAdapter(va);
        return lcb;
    }

    @Bean
    public PlatformTransactionManager transactionManager(){
        JpaTransactionManager tx= new JpaTransactionManager();
        tx.setEntityManagerFactory(entityManagerFactory().getObject());
        return tx;
    }
}
