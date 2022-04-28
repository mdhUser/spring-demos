package org.maxwell.ssm.utils;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/28 10:28
 */
@FunctionalInterface
public interface BranchHandler {

    /**
     *
     *  a 真时运行
     * @param a
     * @param b
     */
    void trueOrFalseHandle(Runnable a, Runnable b);

}
