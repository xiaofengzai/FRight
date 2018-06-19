package com.fr.utils;


import com.fr.common.BusinessException;
import com.fr.common.GlobalConstant;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

    public static String convertISOToUTF(String target) {
        String result = "";
        try {
            result = new String(target.getBytes("iso8859-1"), "utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<Integer> stringToInts(String s,String separator){
        if(isEmpty(s))
            return new ArrayList<>();
        try{
            String[] strings = s.split(separator);
            Integer[] n = new Integer[strings.length];
            for(int i = 0;i<strings.length;i++){
                n[i] = Integer.parseInt(strings[i].trim());
            }
            return Arrays.asList(n);
        }catch(Exception e){
            throw new BusinessException("参数异常");
        }
    }

    public static String addQuotation(String src){
        return "“"+src+"”";
    }

    public static String getMaxLengthString(String value,int maxLength){
        if (value ==null)
            return "";
        if(value.length() <= maxLength)
            return value;
        return value.substring(0,maxLength);
    }

    public static String getNotNullString(String value){
        if (value == null)
            return "";
        return value;
    }

    public static Boolean convertToBoolean(String src){
        return Arrays.asList(GlobalConstant.TRUE_BOOLEAN.split(GlobalConstant.SEPARATOR)).contains(src);
    }

    public  static Boolean isEmpty(String src){
        return (src==null || "".equals(src))?Boolean.TRUE:Boolean.FALSE;

    }

    public  static Boolean isEmpty(StringBuffer src){
        return (src==null || "".equals(src.toString()))?Boolean.TRUE:Boolean.FALSE;

    }
}
