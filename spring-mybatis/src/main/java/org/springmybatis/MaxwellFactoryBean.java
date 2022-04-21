package org.springmybatis;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/9 22:38
 */

public class MaxwellFactoryBean implements FactoryBean {

    private SqlSession sqlSession;

    private Class<?> mapperClass;


    public MaxwellFactoryBean(Class<?> mapperClass) {
        this.mapperClass = mapperClass;
    }

    @Autowired
    public void setSqlSession(SqlSessionFactory sqlSessionFactory) {
        sqlSessionFactory.getConfiguration().addMapper(mapperClass);
        this.sqlSession = sqlSessionFactory.openSession();
    }

    @Override
    public Object getObject() throws Exception {

        return sqlSession.getMapper(mapperClass);

    }

    @Override
    public Class<?> getObjectType() {
        return mapperClass;
    }

}
