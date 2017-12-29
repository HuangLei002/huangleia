/**
 * Project Name:huangleia
 * File Name:HomeWork1_1.java
 * Package Name:hl20171229
 * Date:2017年12月29日下午3:00:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hl20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:00:06 <br/>
 * @author   huanglei
 * @version
 * @see
 */
/**
 * 1)在hw20171228类包中，编写一个车的抽象类，先定义车的简介方法summary()，
 * 输出车的概要信息，再自由定义两个属性、两个方法；定义一个小汽车的类和大卡车的类，
 * 要求：a）继承车的抽象类,b）分别定义一个以上的属性和方法
 * **/
public class HomeWork1_1 {
       String  color="红色";
       String name="兰博基尼";
       void summary(){
           System.out.println("品牌："+name+"\t"+"颜色："+color);
       };
      String chexing;
      int money;
    public String getChexing() {
        return chexing;
    }
    public void setChexing(String chexing) {
        this.chexing = chexing;
    }
    public int getMoney() {
        return money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    
    
  

}

