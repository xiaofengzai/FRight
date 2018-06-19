package com.fr.utils;

import com.fr.common.BusinessException;
import com.fr.common.GlobalConstant;
import com.fr.utils.excel.TimeFormatEnum;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by szty on 2018/6/19.
 */
public class DateUtils {
    private static SimpleDateFormat defaultSdf = new SimpleDateFormat(GlobalConstant.DEATULT_DATETIME, Locale.UK);

    /**
     * joda不支持EEE MMM dd HH:mm:ss Z yyyy的格式
     * @param date
     * @return
     */
    public static String dateFormat(String date, TimeFormatEnum timeFormatEnum){
        try {
            return timeFormatEnum.getSimpleDateFormat().format( defaultSdf.parse(date));
        } catch (ParseException e) {
            throw new BusinessException("时间格式转换失败");
        }
    }
}
