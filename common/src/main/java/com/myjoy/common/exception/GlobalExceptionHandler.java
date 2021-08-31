package com.myjoy.common.exception;

import com.myjoy.common.api.BaseResponse;
import com.myjoy.common.api.ResultCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @Description:
 * @Author: Steven
 * @Date: 2021-08-29 22:45
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);


    /**
     * miss request param
     * @param e
     */
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public BaseResponse handleError(MissingServletRequestParameterException e){
        logger.warn("Missing request parameter");
        String msg =String.format("Missing request parameter: %",e.getParameterName());
        return BaseResponse.isFail(null,ResultCode.PARAM_MISS.getCode(),msg);
    }





}
