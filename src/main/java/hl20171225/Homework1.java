/**
 * Project Name:huangleia
 * File Name:Homework1.java
 * Package Name:hl20171225
 * Date:2017年12月25日下午10:47:31
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hl20171225;

import java.util.Scanner;

import hl20171225.Homework1;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午10:47:31 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class Homework1 {
    
    Scanner scanner=new Scanner(System.in); 
    int num1=scanner.nextInt();
    int num2=scanner.nextInt();
    void sca(){
          if(num1>num2){System.out.println("最大值为："+num1);}
          else{System.out.println("最大值为："+num2);}
      }
    public static void main(String[] args) {
       System.out.println("请输入两个值：");
        Homework1 a;
        a=new Homework1();
        a.sca();
    }
}

