/**
 * Project Name:huangleia
 * File Name:HomeWork1.java
 * Package Name:hl20180108
 * Date:2018年1月8日下午3:20:53
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午3:20:53 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class HomeWork1_1 extends Thread {
    public final static Logger LOG = Logger.getLogger(HomeWork1_1.class);
    int num;
    
    public HomeWork1_1(int num) {
        this.num = num;
    }
    @Override
    public void run() {
        if(num%2==0){
       LOG.info("我是偶数，我的优先级比较高"+num);}
    
    else if(num==5){ LOG.info("我是5，我的优先级最低"+num);}
    else  {LOG.info("我是除了5以外的奇数，我的优先级比较高"+num);}
    }
    }


