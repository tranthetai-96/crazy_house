package com.fpt.common.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;



public class DateUtil {
	
	public static final int SEC_PER_HOUR = 3600;
	
	public static final String DATE_FORMAT_1 = "ddMMyyyy";
	public static final String DATE_FORMAT_2 = "yyyy-MM-dd";
	public static final String DATE_FORMAT_3 = "dd/MMM/yy";
	
	public static final int SEC_PER_DAY = 86400;
    public static final int MILI_SEC_PER_DAY = 86400000;
    public static final float SEC_PER_HOUR_FLOAT = 3600;
    public static final int MILI_SEC_PER_HOUR = 3600000;
    public static final int HOUR_PER_DAY = 8;
    public static final int HOUR_PER_WEEK = 40;
    public static final SimpleDateFormat DATE_FORMAT_HISTORY = new SimpleDateFormat(
            "dd/MMM/yy hh:mm:ss");
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(
            "dd/MMM/yy");

    public final static Date INVALID_END_DATE = convertStringToDate("01/May/2050");
    public final static Date INVALID_START_DATE = convertStringToDate("01/May/2000");
    public final static String[] MONTH = {"Jan", "Feb", "Mar", "Apr", "May",
            "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	

	
	/**
	 * anhpt98
	 * Get All (Working) Day between a duration
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	public static List<Date> getWorkingDatesBetween(Date startDate, Date endDate) {
		
		// enable to remove certain day of the weeks
		//List<Integer> list = Arrays.asList(Const.NON_WORKING_DAYS);

	    List<Date> datesInRange = new ArrayList<>();
	    Calendar calendar = new GregorianCalendar();
	    calendar.setTime(startDate);
	     
	    Calendar endCalendar = new GregorianCalendar();
	    endCalendar.setTime(endDate);
	 
	    while (calendar.before(endCalendar)) {
	    	// enable to remove certain day of the weeks
	    	//if(!list.contains(calendar.get(Calendar.DAY_OF_WEEK))) {
		        Date result = calendar.getTime();
		        datesInRange.add(result);
	    	//}
	        calendar.add(Calendar.DATE, 1);
	    }
	    
	    return datesInRange;
	}
	
	/**
	 * anhpt98
	 * get the start day of the month of the current date
	 * @param date
	 * @return
	 */
	public static Date getStartOfMonth(Date date) {
		Calendar calendar = new GregorianCalendar();
	    calendar.setTime(date);
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    
	    return calendar.getTime();
	}
	
	/**
	 * anhpt98
	 * get the end day of the month of the current date
	 * @param date
	 * @return
	 */
	public static Date getEndOfMonth(Date date) {
		Calendar calendar = new GregorianCalendar();
	    calendar.setTime(date);
	    calendar.add(Calendar.MONTH, 1);
	    calendar.set(Calendar.DAY_OF_MONTH, 1);
	    calendar.add(Calendar.DAY_OF_MONTH, -1);
	    
	    return calendar.getTime();
	}
	
	/**
	
	 * convert date string to date
	 * @param dateString
	 * @param dateFormat
	 * @return
	 * @throws ParseException
	 */
	public static Date convertDateFromString(String dateString, String dateFormat) {
		try {
			if(dateString == null || dateString.equals("")) {
				return null;
			}
			DateFormat format = new SimpleDateFormat(dateFormat);
			return format.parse(dateString);
		} catch(Exception e) {
			return null;
		}		
	}
	
	/**
	
	 * convert date to date string
	 * @param dateString
	 * @param dateFormat
	 * @return
	 * @throws ParseException
	 */
	public static String convertDateToString(Date date, String dateFormat) {
		if(date == null) {
			return null;
		}
		DateFormat format = new SimpleDateFormat(dateFormat);
		try {
			return format.format(date);
		} catch(Exception e) {
			return null;
		}
	}
	
	/**
     * @param date
     * @return
     */
    public static Date convertStringToDate(String date) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
        Date startDate;
        if (date == null || date == "" || date == " ") {
            return null;
        }
        try {
            startDate = dateFormat.parse(date);
            return startDate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
   

    /**
     * anhpt98
     * check if same date
     * @param date1
     * @param date2
     * @return
     */
	public static boolean equalDates(Date date1, Date date2) {
		Calendar calendar1 = new GregorianCalendar();
		Calendar calendar2 = new GregorianCalendar();
		
		calendar1.setTime(date1);
		calendar2.setTime(date2);
		
		return (calendar1.compareTo(calendar2) == 0);
	}
	

	
	public static Date getCurrentDate() {
		return new Date();
	}
}
