package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.sql.Time;
import java.util.Calendar;

public class XDate {

    static SimpleDateFormat formater = new SimpleDateFormat();

    /*
    Exam:
        String s = "01-09-1971";
        Date date = XDate.toDate(s, "dd-MM-yyyy");
        System.out.println(date);
     */
    public static Date stringToDate(String date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(date);

        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Date datetoDate(Date date, String pattern) {
        try {
            formater.applyPattern(pattern);
            return formater.parse(formater.format(date));

        } catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }

    public static Time toTime(String date, String pattern) {
        return new Time(stringToDate(date, pattern).getTime());
    }

    /*
    Exam:
        Date now = new Date();
        String s = XDate.dateParseString(now, "yyyy-MM-dd");
        System.out.println(s);
     */
    public static String dateParseString(Date date, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(date);
    }

    public static String timeParseString(Time time, String pattern) {
        formater.applyPattern(pattern);
        return formater.format(time);
    }

    /*
    Exam:
        Date now = new Date();
        Date after = XDate.addDays(now, 5);
        System.out.println(after);
     */
    public static Date addDays(Date date, long days) {
        Date after = (Date) date.clone();
        after.setTime(after.getTime() + days * 24 * 60 * 60 * 1000);
        return after;
    }

    public static Date minusDays(Date date, long days) {
        Date after = (Date) date.clone();
        after.setTime(after.getTime() - days * 24 * 60 * 60 * 1000);
        return after;
    }
    public static Date minusMonth(Date date, int days) {
        Date after = (Date) date.clone();
        after.setMonth(after.getMonth()+1);
        return after;
    }

    public static int[] getNgayThangNam(Date date) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        int[] ngay = {day, month, year};
        return ngay;
    }
}
