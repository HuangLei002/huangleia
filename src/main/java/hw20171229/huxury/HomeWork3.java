/**
 * Project Name:huangleia
 * File Name:HomeWork3.java
 * Package Name:hw20171229.huxury
 * Date:2017年12月29日下午3:27:39
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20171229.huxury;

import hl20171229.HomeWork1_1;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:27:39 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class HomeWork3 extends HomeWork1_1{
    String name="兰博基尼定制版";
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    String color="五彩斑斓";
      
    void summary(){
        System.out.println("我是豪车！！"+"\n"+"品牌："+name+"\t"+"颜色："+color);
    };

    public static void main(String[] args) {
        HomeWork3 haoche=new  HomeWork3();
        haoche.summary();
      
        

    }

}

