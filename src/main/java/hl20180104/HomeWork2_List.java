/**
 * Project Name:huangleia
 * File Name:HomeWork2.java
 * Package Name:hl20180104
 * Date:2018年1月4日下午2:28:12
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180104;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import hl20180103.HomeWork4;


import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:28:12 <br/>
 * @author   huanglei
 * @version
 * @see
 * List、Map 做练习：添加、修改、删除 、查询 、插入、遍历 
 */
public class HomeWork2_List {
    public final static Logger LOG=Logger.getLogger(HomeWork2_List.class);
    public static void main(String[] args) {
        List list=new ArrayList();   //定义list容器，默认长度为10
        list.add("abc");             //添加元素
        list.add(123);
        list.add(true);
        LOG.info("list中的元素为:"+list);                    //显示元素内容
        LOG.info("list中的元素个数为:"+list.size());            //显示元素个数
        
        list.add(1, "def");                       //在索引为1的地方插入字符串def
        LOG.info("在角标1的位置添加字符串def后list后的元素为:"+list);                    //显示的新元素内容
        LOG.info("在角标1的位置添加字符串def后list中的元素个数为:"+list.size());            //显示新的元素个数
        
        list.remove(0);
        LOG.info("删除第0个角标后list中的元素为:"+list);                    //显示的新元素内容
        LOG.info("删除第0个角标后后list中的元素个数为:"+list.size());            //显示新的元素个数
        
        list.set(1, "ghi");
        LOG.info("修改第1个角标的元素值后list中的元素为:"+list);                    //显示的新元素内容
        LOG.info("修改第1个角标的元素值后list中的元素个数为:"+list.size());            //显示新的元素个数
        
       
        LOG.info("查询list中是否存在字符串ghi:"+list.contains("ghi"));    //查询字符串，返回值为布尔类型
       
        Iterator it=list.iterator();
        for(int i=0;i<list.size();i++){             //使用迭代器输出list中的元素
            LOG.info(it.next());
        }
    }

}

