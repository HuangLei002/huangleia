/**
 * Project Name:huangleia
 * File Name:Worker.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午1:54:48
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午1:54:48 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public  class Worker extends Person{
   
 public Worker(String name,int age) {
        
        super(name, age);
        //  Auto-generated constructor stub
        
    }
 public void play2(){System.out.println("我是工人，我爱劳动");}
    public void play() {
        System.out.println("我是一名工人，我叫"+super.getName()+"，我今年"+(super.getAge()+23)+"岁");
        
     }

   

    
   

}

