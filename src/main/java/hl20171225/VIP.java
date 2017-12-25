/**
 * Project Name:huangleia
 * File Name:VIP.java
 * Package Name:hl20171225
 * Date:2017年12月25日下午10:47:44
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hl20171225;

import java.util.Scanner;

import hl20171225.VIP;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午10:47:44 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class VIP {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        VIP m = new VIP();
        System.out.println("请输入您的卡级别：1.至尊级  2.钻石级  3.铂金级  4.黄金级  5.白银级");
        int a = scanner.nextInt();
        String b = m.VIPSHOP(a);
         System.out.print("请输入消费金额： ");
        double money = scanner.nextDouble();
         double paymoney = m.PAY(b, money);
        System.out.println("您消费的总金额为： " + paymoney + " 元");
        scanner.close();

        
    }
    
    String VIPSHOP(int input) {
        if (input == 1) {
            System.out.println("您的卡片是至尊级!");
            return "至尊级";
        } else if (input == 2) {
            System.out.println("您的卡片是钻石级!");
            return "钻石级";
        } else if (input == 3) {
            System.out.println("您的卡片是铂金级!");
            return "铂金级";
        } else if (input == 4) {
            System.out.println("您的卡片是黄金级!");
            return "黄金级";
        } else if (input == 5) {
            System.out.println("您的卡片是白银级!");
            return "白银级";
        } else {
            System.out.println("您输入的信息有误");
            return null;
        }
    }
    
    double PAY(String VIPSHOP, double money) {
        double paymoney = 0;
        if (VIPSHOP.equals("至尊级")) {
            paymoney = 0.75 * money;
        } else if (VIPSHOP.equals("钻石级")) {
            paymoney = 0.8 * money;
        } else if (VIPSHOP.equals("铂金级")) {
            paymoney = 0.85 * money;
        } else if (VIPSHOP.equals("黄金级")) {
            paymoney = 0.9 * money;
        } else if (VIPSHOP.equals("白银级")) {
            paymoney = 0.95 * money;
        }
        return paymoney;
    }

    
}
    



