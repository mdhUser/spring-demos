package org.maxwell.ssm.error;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 21:57
 */
public class SystemException extends RuntimeException {

    private Integer code;
    private String message;


    public SystemException(String message, Integer code) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public SystemException(String message, Integer code, Throwable cause) {
        super(message, cause);
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }


    public String getMessage() {
        return message;
    }
}
