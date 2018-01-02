/**
 * Project Name:huangleia
 * File Name:Teacher.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午1:55:13
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午1:55:13 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public  class Teacher  extends Person {
    
 public Teacher(String name,int age) {
        
        super(name, age);
        //  Auto-generated constructor stub
        
    }
    public void play() {
        System.out.println("我是一名老师，我叫"+super.getName()+"，我今年"+(super.getAge()+20)+"岁");
        
     }

   
}

