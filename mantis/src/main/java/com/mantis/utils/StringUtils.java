package com.mantis.utils;

import android.text.TextUtils;

public class StringUtils {
    public static boolean isEmpty(String str){
        if(TextUtils.isEmpty(str)) return true;
        return str.trim().length()<=0;
    }
}
