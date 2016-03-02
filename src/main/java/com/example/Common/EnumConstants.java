package com.example.Common;

/**
 * Created by Administrator on 2016/2/29.
 */
public class EnumConstants {

    public static enum ErrorInfo {
        SystemError(-1, "内部错误"),
        VoiceFileIsull(-2, "上传的语音文件不能为空"),
        VoiceFileSuffixError(-3, "上传的语音文件格式不正确"),

        Success(0, "成功"),
        ;
        private int errorCode;
        private String msg;
        private ErrorInfo(int errorCode, String msg) {
            this.errorCode = errorCode;
            this.msg = msg;
        }
        public int getErrorCode() {
            return errorCode;
        }
        public String getMsg() {
            return msg;
        }
    }
}

