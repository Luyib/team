package com.team.VO;

import lombok.Data;

/**
 * @author 穿长裙的年代
 * 2018/8/9 23:13
 */
@Data
public class ResultVO<T> {

    /** 错误码. */
    private Integer code;

    /** 提示信息. */
    private String msg;

    /** 具体内容. */
    private T data;

}
