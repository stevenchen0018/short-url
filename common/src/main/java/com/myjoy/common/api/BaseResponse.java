package com.myjoy.common.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: BaseResponse
 * @Description:
 * @Author: Steven
 * @Date: 2021-08-29 22:41
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BaseResponse<T> {

    private String msg;
    private int code;
    private T data;

    public static <T> BaseResponse<T> isSuccess(T data){
        return BaseResponse.<T>builder().data(data).code(ResultCode.SUCCESS_CODE.code).msg(ResultCode.SUCCESS_CODE.msg).build();
    }

    public static <T> BaseResponse<T> isSuccess(T data,String msg){
        return BaseResponse.<T>builder().data(data).code(ResultCode.SUCCESS_CODE.code).msg(msg).build();
    }

    public static <T> BaseResponse<T> isFail(T data){
        return BaseResponse.<T>builder().data(data).code(ResultCode.FAIL_CODE.code).msg(ResultCode.FAIL_CODE.msg).build();
    }


    public static <T> BaseResponse<T> isFail(T data,String msg){
        return BaseResponse.<T>builder().data(data).code(ResultCode.FAIL_CODE.code).msg(msg).build();
    }

    public static <T> BaseResponse<T> isFail(T data,int code,String msg){
        return BaseResponse.<T>builder().data(data).code(code).msg(msg).build();
    }


}
