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





}
