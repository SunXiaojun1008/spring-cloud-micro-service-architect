package com.xj.sun.provideruser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * Created by ZT-Moon on 2018-06-29.
 */
public class DateUtils {
    public static int compareTo(Date date1, Date date2) {
        return date1.compareTo(date2);
    }

    public static final Date minDate = new Date(1970, 1, 1);

    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static boolean IsNull(Date date1) {
        if (date1 == null) {
            return true;
        }
        return date1.compareTo(minDate) > 0;
    }

    public static  String Convert(Date date1) {
        if (date1 == null) {
            return null;
        }
        String dateStr = sdf.format(date1);
        return dateStr;
    }

    //日期格式化
    public static LocalDateTime parseDate(String time) {
        LocalDateTime localDateTime = LocalDateTime.parse(time, dtf);
        return localDateTime;
    }

    //日期格式化
    public static Date parseStr2Date(String time) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = sdf.parse(time);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
