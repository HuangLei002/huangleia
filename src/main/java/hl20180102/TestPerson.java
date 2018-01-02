/**
 * Project Name:huangleia
 * File Name:TestPerson.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午1:56:54
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午1:56:54 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class TestPerson {

    

    public static void main(String[] args) {

        Person stud=new Student("张三",21);
        Person work=new Worker("李四",21);
        Person teac=new Teacher("王麻子",21);
        stud.play();
        work.play();
        teac.play();
     
        
        
            Person a=new Student("xues",32);
            play(a);
            Person b=new Worker("xues",32);
            play(b);
           
       }
          public static void play(Person a){
           if(a instanceof Student){
             ((Student)a).play1();
       }
          }
           public static void play2(Person b){
               if(b instanceof Worker){
                 ((Worker)b).play2();
           }
           
       
           
   
       
    }

}

