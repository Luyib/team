package com.team.enums;

import lombok.Getter;

/**
 * @author 穿长裙的年代
 * 2018/8/9 21:49
 */
@Getter
public enum ResultEnum {

    SUCCESS(0, "成功"),

    PARAM_ERROR(1, "参数不正确"),

    ;

    private  Integer code;
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
