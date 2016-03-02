package com.example.Common;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by sunchong on 2015/11/6.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {
    private int errCode;
    private String errMsg;

    public Response(){

    }
    public Response(int errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Response(EnumConstants.ErrorInfo errorInfo) {
        this.errCode = errorInfo.getErrorCode();
        this.errMsg = errorInfo.getMsg();
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}

