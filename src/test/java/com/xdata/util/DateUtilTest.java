package com.xdata.util;

import junit.framework.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static com.xdata.util.DateUtil.*;

/**
 * Created by hadoop on 4/1/14.
 */
public class DateUtilTest {
    @Test
    public void testDateToString() throws Exception {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = dateFormat.format(date);
        Assert.assertTrue(dateStr.equals(dateToString(new Date(), "yyyy-MM-dd")));
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(cal.getTime()));
    }
}
