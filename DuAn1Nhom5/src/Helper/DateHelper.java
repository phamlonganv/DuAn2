/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author long
 */
public class DateHelper {

    static SimpleDateFormat stm = new SimpleDateFormat("yyyy/MM/dd");
    

    public static Date toDate(String date) {
       
        try {

            if (date == null) {

                return DateHelper.now();

            }

            return stm.parse(date);

        } catch (ParseException ex) {

            throw new RuntimeException(ex);

        }

    }

    public static String toString(Date date) {

        if (date == null) {

            date = DateHelper.now();

        }

        return stm.format(date);

    }

    public static Date now() {
        return new Date();
    }
    public static int Getdate(String star , String end) throws ParseException
    {
        Date stardate = stm.parse(star);
        Date endate = stm.parse(end);
        long starvalue = stardate.getTime();
        System.out.println(starvalue);
        long endvalue = endate.getTime();
        System.out.println(endvalue);
        long time = Math.abs(starvalue-endvalue);
        return (int) (time/(24*60*60*1000));
    
    }
    
    

}
