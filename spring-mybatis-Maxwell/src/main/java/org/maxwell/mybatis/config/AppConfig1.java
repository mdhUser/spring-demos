package org.maxwell.mybatis.config;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springmybatis.MaxwellImportBeanDefinitionRegistrar;
import org.springmybatis.MaxwellScan;

import java.io.IOException;
import java.io.InputStream;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/9 22:14
 */

@ComponentScan({"org.springmybatis", "org.maxwell.mybatis"})
@MaxwellScan("org.maxwell.mybatis.mapper")
@Configuration
public class AppConfig1 {


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        return sessionFactory;
    }

    //todo mybatis-spring 中api实现
//    @Bean
//    public SqlSessionFactory sqlSessionFactory() throws Exception {
//        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        return factoryBean.getObject();
//    }


//    @Bean
//    private DataSource dataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setPassword("root");
//        dataSource.setUsername("root");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/db_31?useUnicode=true&characterEncoding=utf8&useSSL=false&serverTimezone=UTC");
//        return dataSource;
//    }


}
