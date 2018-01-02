/**
 * Project Name:huangleia
 * File Name:Student.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午1:54:34
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午1:54:34 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public  class Student extends Person{
       
       public Student(String name, int age) {
        
        super(name, age);
        //  Auto-generated constructor stub
        
    }




    public void play1(){System.out.println("我是学生，我爱学习");}
   

    

    public void play() {
       System.out.println("我是一名学生，我叫"+super.getName()+"，我今年"+(this.getAge()+2)+"岁");
     }  
    
    public static void main(String[] args) {
     
    }




    
     }





