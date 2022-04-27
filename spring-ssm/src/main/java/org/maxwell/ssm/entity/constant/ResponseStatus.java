package org.maxwell.ssm.entity.constant;

/**
 * @description:
 * @author: Maxwell
 * @email: maodihui@foxmail.com
 * @date: 2022/4/27 18:06
 */

public enum ResponseStatus {

    /**
     * 成功
     */
    SUCCESS(200, "success"),
    /**
     * 业务非法操作
     */
    SAVE_ERROR(4001, "报错失败！"),

    UPDATE_ERROR(4002, "更新失败！"),

    SELECT_ERROR(4003, "查询失败，无此用户！"),

    DELETE_ERROR(4004, "删除失败！"),

    /**
     * 系统异常
     */
    SYSTEM_ERR(5001, "系统异常"),
    SYSTEM_TIMEOUT_ERR(5002, "系统超时"),
    SYSTEM_UNKNOWN_ERR(5003, "系统未知异常");


    ResponseStatus(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;

    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
