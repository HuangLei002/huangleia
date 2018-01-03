/**
 * Project Name:huangleia
 * File Name:HomeWork3.java
 * Package Name:hl20180103
 * Date:2018年1月3日下午6:24:05
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180103;

import java.beans.Expression;
import java.util.Scanner;

import org.apache.log4j.Logger;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午6:24:05 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class HomeWork3 {
    public final static Logger LOG=Logger.getLogger(HomeWork4.class);
    
    

    public static void main(String[] args) {
       
         
        //定义一个空的字符串
        String str = null;
         
        //尝试对空字符串进行操作，并捕获异常，输出异常
        try{
            System.out.println(str.charAt(0));
        }catch(Exception e){
            LOG.info("异常信息:");
           e.printStackTrace(); 
            LOG.info(e);
        }
        
    }
 
}