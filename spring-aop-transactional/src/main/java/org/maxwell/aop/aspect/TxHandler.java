package org.maxwell.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

import javax.sql.DataSource;

/**
 * @description: 编程式事务切面实现
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/24 22:00
 */
//@Aspect
@Component
public class TxHandler {

    @Autowired
    private DataSource dataSource;


    /**
     * aop 事务控制
     *
     * @param pjp
     * @return
     */
    @Around("execution(* org.maxwell.aop.service..*.*(..))")
    public Object transactionManager(ProceedingJoinPoint pjp) {

        //1.构建事务管理器，管理事务:提交 回滚
        DataSourceTransactionManager transaction = new DataSourceTransactionManager();
        // 配置数据源
        transaction.setDataSource(dataSource);

        //2.构建事务定义对象:设置隔离级别 传播行为 超时时间 等
        DefaultTransactionDefinition defaultTransactionDefinition = new DefaultTransactionDefinition();

        //设置事务隔离级别
        defaultTransactionDefinition.setIsolationLevel(TransactionDefinition.ISOLATION_REPEATABLE_READ);
        // 事务超时时间，参数默认是-1，表示永不超时（什么时候结束，则结束）
        //            单位是：秒
        defaultTransactionDefinition.setTimeout(10);
        //设置是否为只读事务
        defaultTransactionDefinition.setReadOnly(false);
        //设置事务的传播特性
        defaultTransactionDefinition.setPropagationBehavior(TransactionDefinition.PROPAGATION_REQUIRED);

        //3.获取事务状态对象 开启事务
        TransactionStatus transactionStatus = transaction.getTransaction(defaultTransactionDefinition);
        Object result = null;

        try {
            result = pjp.proceed();
            transaction.commit(transactionStatus);
        } catch (Throwable e) {
            System.out.println("===" + e.getMessage() + "===");
            transaction.rollback(transactionStatus);
        }

        return result;
    }


}
