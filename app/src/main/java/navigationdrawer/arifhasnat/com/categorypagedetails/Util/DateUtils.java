package navigationdrawer.arifhasnat.com.categorypagedetails.Util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by arifhasnat on 1/13/16.
 */
public class DateUtils {

    public  static String toDate(Date date){
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd");
        return  dateFormat.format(date);

    }
    public static Date getLastDayDate(Date date){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,-1);
        return  calendar.getTime();

    }

    public static Date getNextdayDate(Date date){

        Calendar calendar=Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE,1);
        return calendar.getTime();



    }
}
