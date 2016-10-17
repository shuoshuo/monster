package com.krzn.monster.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @Description:日期处理
 * @author caoyong
 * @date 2016年5月7日
 * @version 
 *
 */
public class DateUtil {


	public static final String PATTERN_DATE_DEFAULT = "yyyy-MM-dd";

	public static final String PATTERN_DATE_ACTIVITY = "yyyy/MM/dd HH:mm:ss";

	/**
	 *
	 * @param pattern
	 * @param strDate
	 * @return Date
	 * @see SimpleDateFormat
	 * @throws ParseException
	 */
	public static final Date convertStringToDate(String pattern, String strDate) {
		SimpleDateFormat df = null;
		Date date = null;
		df = new SimpleDateFormat(pattern);

		try {
			date = df.parse(strDate);
		} catch (ParseException pe) {
			pe.printStackTrace();
		}

		return date;
	}



	/**
	 * @param pattern
	 * @param date
	 * @return
	 */
	public static final String convertDateToString(String pattern, Date date) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (date == null) {
		} else {
			df = new SimpleDateFormat(pattern);
			returnValue = df.format(date);
		}

		return returnValue;
	}

	/**
	 * @param date
	 * @param date
	 * @return
	 */
	public static final String convertDateToString(Date date) {
		SimpleDateFormat df = null;
		String returnValue = "";

		if (date == null) {
		} else {
			df = new SimpleDateFormat(PATTERN_DATE_DEFAULT);
			returnValue = df.format(date);
		}

		return returnValue;
	}

	/**
	 *
	 * @return
	 */
	public static String currentDateStr() {
		Calendar calendar = Calendar.getInstance();
		return convertDateToString(PATTERN_DATE_DEFAULT, calendar.getTime());
	}

	/**
	 * 获取几天前的日期字符串
	 * @param days
	 * @return
	 */
	public static String dateStrBefore(int days) {
		return convertDateToString(dateBefore(days));
	}

	/**
	 * 获取几天前的日期字符串
	 * @param days
	 * @return
	 */
	public static String dateStrBefore(Date date, int days) {
		return convertDateToString(dateBefore(date, days));
	}

	/**
	 * 获取几天前的日期
	 * @param days
	 * @return
	 */
	public static Date dateBefore(int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DATE, -days);
		return calendar.getTime();
	}

	/**
	 * 获取几天前的日期
	 * @param days
	 * @return
	 */
	public static Date dateBefore(Date date, int days) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -days);
		return calendar.getTime();
	}

	/**
	 * Get the exact start date of a day
	 * @param d
	 * @return
	 */
	public static Date getDayStartDate(Date d){

		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);

		return cal.getTime();
	}
	/**
	 * 日期增加N天
	 * @param date
	 * @param N
	 * @return
	 */
	public static Date AddNday(Date date,int N){   
		if(date == null){
			return date;
		}
        SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {   
        	String strDate = simpleDateFormat.format(date);
        	long   time = simpleDateFormat.parse(strDate).getTime()+ N*24*3600*1000;
        	return  new Date(time);
        }catch(Exception e) { 
        	e.printStackTrace();
            return  date;     
        }       
    }

	public static Date string2Date (String str, int day) {
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		if (str == null || str.length() == 0){
			return null;
		}
		try {
			Calendar rightNow = Calendar.getInstance();
			rightNow.setTime(format.parse(str));
			rightNow.add(Calendar.DAY_OF_YEAR,day);
			return rightNow.getTime();
		} catch (ParseException e) {
			return null;
		}
	}

	/**
	 * 为导出Excel提供的日期工具
	 * @param date
	 * @param date
	 * @return
	 */
	public static final String convertDateToString4ExportXls(Date date) {
		SimpleDateFormat df = null;
		String returnValue = "N/A";

		if (date == null) {
			return returnValue;
		} else {
			df = new SimpleDateFormat(PATTERN_DATE_ACTIVITY);
			returnValue = df.format(date);
		}

		return returnValue;
	}


}
