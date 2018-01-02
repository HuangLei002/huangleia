/**
 * Project Name:huangleia
 * File Name:Person.java
 * Package Name:hl20180102
 * Date:2018年1月2日下午1:54:17
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午1:54:17 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public abstract  class Person {
   
    private  String name;
    private  int age;
    
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
  public abstract void play();
     
 

}

