/**
 * Project Name:huangleia
 * File Name:SmallCar.java
 * Package Name:hl20171229
 * Date:2017年12月29日下午3:14:25
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hl20171229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:14:25 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class SmallCar extends HomeWork1_1{
             String chandi="南美";
    void  SmallCar() {

            System.out.println("产地："+chandi);

    }

    public static void main(String[] args) {
        HomeWork1_1 small=new HomeWork1_1();
         small.summary();
          small.setChexing("GTA95");
          small.setMoney(5000);
         
          System.out.println("车型："+small.getChexing()+"\t"+"价格："+small.getMoney()+"元");
          SmallCar a=new SmallCar();
          a.SmallCar();
    }

}

