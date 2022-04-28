package org.maxwell.ssm.utils;

import java.util.function.Consumer;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/28 15:26
 */
@FunctionalInterface
public interface PresentOrElseHandler <T extends Object>{


    /**
     *  判断null断言操作
     * @param com
     * @param run
     */
    void presentOrElseHandle(Consumer<? super T> com,Runnable run);

}
