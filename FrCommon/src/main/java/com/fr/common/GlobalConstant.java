package com.fr.common;

/**
 * Created by szty on 2018/6/19.
 */
public class GlobalConstant {
    public static final String DATA_YMD = "yyyy-MM-dd";

    public static final String DATA_YM = "yyyy-MM";

    public static final String DATA_YM_01= "yyyy-MM-01";

    public static final String DATETIME="yyyy-MM-dd HH:mm:ss";

    public static final String DEATULT_DATETIME="EEE MMM dd HH:mm:ss Z yyyy";

    public static final String MSECTIME="yyyy-MM-dd HH:mm:ss.S";

    public static final String DATA_YMD_CN = "yyyy年MM月dd日";

    public static final String DATA_YM_CN = "yyyy年MM月";

    public static final String TIME_YMDH_CN = "yyyy年MM月dd日HH点";

    public static final String TIME_YMDHM_CN = "yyyy年MM月dd日 HH:mm";

    public static final String DATE_TIME_CN = "yyyy年MM月dd日 HH:mm:ss";

    public static final String TIME_HOUR = "yyyy/MM/dd HH:mm";

    public static final String TIME_SECOND = "yyyy/MM/dd HH:mm:ss";

    public static final Integer SHEET_RECORD_SIZE=60000;

    /**
     * 时间字符串 正则表达式，如2015-11-13 14:12:25.0
     */
    public static final String REG_DTAETIME="[0-9]{4}-[0-9]{2}-[0-9]{2} [0-9]{2}:[0-9]{2}:[0-9]{2}.{0,2}";

    public static final String REG_MONTH="[0-9]{4}-[0-9]{2}-01 00:00:00.{0,2}";

    public static final String REG_DEFAULT_DTAETIME=".{10} [0-9]{2}:[0-9]{2}:[0-9]{2} [A-Z]{3} [0-9]{4}";

    public static final String FALSE_BOOLEAN="否,无";

    public static final String TRUE_BOOLEAN="是,有";

    public static final String SEPARATOR=",";

    public static final String WAR="war";

    public static final String JAR="jar";

    public static final Integer DOWNLOAD_TIMEOUT=6000;

    public static final String NEW_LINE="\n";
}
