package com.xdata.azkaban.jobtype.java;

import azkaban.jobtype.JavaJob;
import azkaban.utils.Props;
import com.xdata.util.DateUtil;
import org.apache.log4j.Logger;

import java.util.Calendar;
import java.util.Date;

/**
 * Parameter wrapper.
 * User: jianyong.xu@renren-inc.com
 */
public class ParamWrapper extends JavaJob {


    public ParamWrapper(String jobId, Props jobProps) {
        super(jobId, jobProps, jobProps, Logger.getLogger(ParamWrapper.class));
    }

    @Override
    public void run() throws Exception {

    }
    @Override
    public Props getJobGeneratedProperties()
    {
        Props props = new Props();
        props.put("param.today", DateUtil.dateToString(new Date(), "yyyy-MM-dd"));
        String yesterday;
        Calendar cal = DateUtil.getCalendar();
        cal.add(Calendar.DATE,-1);
        yesterday = DateUtil.dateToString(cal.getTime(),"yyyy-MM-dd");
        props.put("param.yesterday",yesterday);

        return props;
    }

    @Override
    public boolean isCanceled()
    {
        return false;
    }

}
