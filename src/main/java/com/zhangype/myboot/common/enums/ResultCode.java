package com.zhangype.myboot.common.enums;

/**
 * 状态类型
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/28
 */
public enum ResultCode {

    SUCCESS(0, "请求成功");

    /**
     * 状态码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
