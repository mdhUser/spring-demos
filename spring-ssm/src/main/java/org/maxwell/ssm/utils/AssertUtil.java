package org.maxwell.ssm.utils;

import org.maxwell.ssm.error.BusinessException;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/28 9:53
 */
public class AssertUtil {


    /**
     * 异常判断
     *
     * @param b
     * @return
     */
    public static ThrowExceptionFunction isTrue(boolean b) {
        return (code, errorMessage) -> {
            if (b) {
                throw new BusinessException(code, errorMessage);
            }
        };
    }

    /**
     * 断言判断
     *
     * @param b
     * @return
     */
    public static BranchHandler isTrueOrFalse(boolean b) {

        return (trueHandle, falseHandle) -> {
            if (b) {
                trueHandle.run();
            } else {
                falseHandle.run();
            }
        };
    }

    /**
     * 非空判断
     *
     * @param o
     * @return
     */
    public static PresentOrElseHandler isPresent(Object o) {
        return (consumer, runnable) -> {
            if (o == null) {
                runnable.run();
            } else {
                consumer.accept(o);
            }
        };
    }

}
