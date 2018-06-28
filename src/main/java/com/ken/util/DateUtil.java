package com.ken.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtil {

    private static final Logger logger = LoggerFactory.getLogger(DateUtil.class);

    /**
     * 字符串转成日期
     *
     * @param dateStr
     * @param formatStr
     * @return
     */
    public static Date stringToDate(String dateStr, String formatStr) {
        if (dateStr == null || formatStr == null) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        Date date;
        try {
            date = dateFormat.parse(dateStr);
        } catch (ParseException e) {
            logger.error("{}", e.getMessage(), e);
            return null;
        }
        return date;
    }

    /**
     * 日期转成字符串
     *
     * @param date
     * @param formatStr
     * @return
     */
    public static String dateToString(Date date, String formatStr) {
        if (date == null || formatStr == null) {
            return null;
        }
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        String dateStr = dateFormat.format(date);
        return dateStr;
    }

    public static int getAgeByBirthday(String birthday) {
        return 0;
    }

}
