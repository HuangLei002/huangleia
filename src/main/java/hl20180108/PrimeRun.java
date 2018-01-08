/**
 * Project Name:huangleia
 * File Name:HomeWork1_2.java
 * Package Name:hl20180108
 * Date:2018年1月8日下午3:55:52
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180108;

import hl20180103.HomeWork4;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:55:52 <br/>
 * @author   huanglei
 * @version
 * @see
 */
class PrimeRun implements Runnable {
    public final static Logger LOG=Logger.getLogger(HomeWork4.class);
    int a;
    PrimeRun(int a) {
        this.a = a;
    }

    public void run() {
        LOG.info(a);  
    }
}
