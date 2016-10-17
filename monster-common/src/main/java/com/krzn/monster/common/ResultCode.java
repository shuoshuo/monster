package com.krzn.monster.common;

import java.io.Serializable;

/**
 * <p>DESCRIPTION:  给客户端提供错误编码的枚举对象
 * <p>CALLED BY:	钱明金
 * <p>CREATE DATE: 2015/12/9
 *
 * @version 1.0
 * @since java 1.7.0
 */
public enum ResultCode implements Serializable {

    SYSTEM_EXCEPTION(10000, "系统发生未知异常"),
    PARAMS_EXCEPTION(10002, "参数错误"),
    PARAMS_NULL_EXCEPTION(10003, "参数不能为空"),
    RESULT_IS_NULL(10004, "查询结果为空"),
    UPDATE_RESULT_EXCEPTION(10005, "更新结果异常"),
    ADD_RESULT_EXCEPTION(10006, "插入结果异常"),
    DEL_RESULT_EXCEPTION(10007, "删除结果异常"),
    ;

    private final int code;
    private final String message;

    ResultCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
