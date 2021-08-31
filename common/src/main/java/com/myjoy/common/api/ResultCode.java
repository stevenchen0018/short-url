package com.myjoy.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.servlet.http.HttpServletResponse;

/**
 * @Author: steven chen
 * @Description:
 * @Date2021-08-30 13:37
 * @Version V1.0
 **/
@AllArgsConstructor
@Getter
public enum ResultCode {

    SUCCESS_CODE(HttpServletResponse.SC_OK,"is success"),

    FAIL_CODE(HttpServletResponse.SC_BAD_REQUEST,"Biz Exception"),

    UN_AUTHORIZED(HttpServletResponse.SC_UNAUTHORIZED,"Request Unauthorized"),

    NOT_FOUND(HttpServletResponse.SC_NOT_FOUND,"404 Not Found"),

    MSG_NOT_READABLE(HttpServletResponse.SC_BAD_REQUEST,"Message Can't be Read"),

    INTERNAL_SERVER_ERROR(HttpServletResponse.SC_INTERNAL_SERVER_ERROR,"server is error"),

    PARAM_MISS(HttpServletResponse.SC_BAD_REQUEST, "Missing Required Parameter")
    ;
    final int code;
    final String msg;

}
