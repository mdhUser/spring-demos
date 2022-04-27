package org.maxwell.ssm.entity.response;

import org.maxwell.ssm.entity.constant.ResponseStatus;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 17:46
 */
public class ResponseResult {

    private Integer code;

    private String message;

    private Object data;


    public ResponseResult(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ResponseResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResponseResult success(Object data) {
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage(), data);
    }

    public static ResponseResult success() {
        return new ResponseResult(ResponseStatus.SUCCESS.getCode(), ResponseStatus.SUCCESS.getMessage());
    }

    public static ResponseResult failed(Integer code, String message) {
        return new ResponseResult(code, message);
    }


    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }
}
