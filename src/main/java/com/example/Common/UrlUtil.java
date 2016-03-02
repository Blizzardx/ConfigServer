package com.example.Common;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * Created by Administrator on 2016/2/29.
 */
public class UrlUtil {

    public static String urlDecode(String str){
        try {
            if(str == null){
                return "";
            }
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
