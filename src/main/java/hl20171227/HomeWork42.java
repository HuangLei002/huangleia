/**
 * Project Name:huangleia
 * File Name:HomeWork42.java
 * Package Name:hl20171227
 * Date:2017年12月27日下午4:05:04
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hl20171227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:05:04 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class HomeWork42 {

    

   public static void main(String[] args) {
       HomeWork41 a=new HomeWork41("黄磊");
       System.out.println("姓名:"+a.name);
       HomeWork41 b=new HomeWork41("黄磊",21);
       System.out.println("姓名:"+a.name+"\t年龄:"+b.age);
       HomeWork41 c=new HomeWork41("黄磊",21,175);
       System.out.println("姓名:"+a.name+"\t年龄:"+b.age+"\t身高:"+c.height);
}
    
}

