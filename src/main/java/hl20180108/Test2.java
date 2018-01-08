/**
 * Project Name:huangleia
 * File Name:Test2.java
 * Package Name:hl20180108
 * Date:2018年1月8日下午4:01:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午4:01:34 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class Test2 {
    public final static Logger LOG = Logger.getLogger(HomeWork1_1.class);
    private native void setPriority0(int i);
    public static void main(String[] args) {
       for(int i=0;i<10;i++){
        PrimeRun p = new PrimeRun(i);
       
        new Thread(p).start();
       }


    }

}

