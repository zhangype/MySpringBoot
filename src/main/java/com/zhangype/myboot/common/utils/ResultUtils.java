package com.zhangype.myboot.common.utils;

import com.zhangype.myboot.Result;
import com.zhangype.myboot.common.enums.ResultCode;

/**
 * 处理结果工具类
 *
 * @author 1141404898@qq.com
 * @version V1.0.0
 * @date 2017/12/28
 */
public class ResultUtils {

    public static Result success(Object data) {
        return new Result(ResultCode.SUCCESS, data);
    }

    public static Result success() {
        return new Result(ResultCode.SUCCESS);
    }

    public static Result warn(ResultCode resultCode, Object data) {
        return new Result(resultCode, data);
    }

    public static Result warn(ResultCode resultCode) {
        return new Result(resultCode);
    }

    public static Result warn(ResultCode resultCode, String msg) {
        Result result = new Result(resultCode);
        result.setMsg(msg);
        return result;
    }
}
