/**
 * Project Name:huangleia
 * File Name:Hw20180106_3.java
 * Package Name:hl20180107
 * Date:2018年1月7日下午9:29:31
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180107;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;



/**
 * Description:   <br/>
 * Date:     2018年1月7日 下午9:29:31 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class Hw20180106_3 {
    public final static Logger LOG = Logger.getLogger(Hw20180106_3.class);

    public static void main(String[] args) {

        // Date date = new Date(2018 - 1900, 1 - 1, 7);
        Date date = new Date();
        LOG.info("今天的日期是:" + date);
        
        SimpleDateFormat time = new SimpleDateFormat();
        String strDate = time.format(date);
        LOG.info("现在的时间是:"+strDate);
        // LOG.info("C今天是:" + strDate1);
        // LOG.info("B今天是：" + strDate);
        // SimpleDateFormat SDF2=new SimpleDateFormat("EEE,MMM dd,  yy");
        // String strDate = SDF.format(date);
        // SimpleDateFormat("yyyy年MM月dd日  HH:mm:ss.SSSZ");
        // SimpleDateFormat SDF = new
        // String strDate1 = SDF1.format(date);
        // SimpleDateFormat("yyyy.MM.dd G  HH:mm:ss Z");
        // SimpleDateFormat SDF1 = new
        
        

}
}
