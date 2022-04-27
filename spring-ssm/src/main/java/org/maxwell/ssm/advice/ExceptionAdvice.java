package org.maxwell.ssm.advice;

import org.maxwell.ssm.entity.response.ResponseResult;
import org.maxwell.ssm.error.BusinessException;
import org.maxwell.ssm.error.SystemException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 17:29
 */
@RestControllerAdvice
@ControllerAdvice
public class ExceptionAdvice {


    @ExceptionHandler(Exception.class)
    public ResponseResult handlerException(Exception e) {
        return ResponseResult.failed(444, e.getMessage());
    }

    @ExceptionHandler(BusinessException.class)
    public ResponseResult handlerBusinessException(BusinessException e) {
        return ResponseResult.failed(e.getCode(), e.getMessage());
    }

    @ExceptionHandler(SystemException.class)
    public ResponseResult handlerSystemException(SystemException e) {
        return ResponseResult.failed(e.getCode(), e.getMessage());
    }


}
