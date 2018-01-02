/**
 * Project Name:huangleia
 * File Name:TestPerson2.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午6:27:51
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午6:27:51 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class TestPerson2  {
         public static void main(String[] args) {
            Person a=new Student("学习",21);
            play(a);
           
        }
   public static void play(Person a){
       if(a instanceof Student){
           ((Student)a).play1();
       }
      
           
   }
   
   
}

