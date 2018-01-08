/**
 * Project Name:huangleia
 * File Name:Test.java
 * Package Name:hl20180108
 * Date:2018年1月8日下午3:21:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180108;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.apache.log4j.Logger;

/**
 * Description: <br/>
 * Date: 2018年1月8日 下午3:21:51 <br/>
 * 
 * @author huanglei
 * @version
 * @see
 */
public class Test {
    public final static Logger LOG = Logger.getLogger(Test.class);
   
    
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            HomeWork1_1 num = new HomeWork1_1(i);
            if(i%2==0){
            num.setPriority(num.MAX_PRIORITY);
            }
            
            else  if(i%2!=0){
                num.setPriority(num.MIN_PRIORITY);
                }
            
            num.start();
            
            
           
        }
         

    }

}
