package com.oscars.common.exception;

import lombok.Getter;

/**
 * @author HJC
 * @version 1.0
 * 谦谦君子 卑以自牧也
 * @date 2020/9/6  21:36
 * @description :
 */
public enum BizCodeEnum {

    /**
     * 未知异常
     */
    UNKNOW_EXCEPTION(10000 ," 系统异常"),
    /**
     *
     */
    VALID_EXCEPTION(10001 ,"参数格式异常")
    ;

    @Getter
    private int code;
    @Getter
    private String msg;

    BizCodeEnum(int code , String msg){
        this.code = code;
        this.msg = msg;
    }
}
