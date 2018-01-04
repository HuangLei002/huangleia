/**
 * Project Name:huangleia
 * File Name:HomeWork2_Map.java
 * Package Name:hl20180104
 * Date:2018年1月4日下午3:22:07
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hl20180104;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午3:22:07 <br/>
 * @author   huanglei
 * @version
 * @see
 */
public class HomeWork2_Map {
    public final static Logger LOG=Logger.getLogger(HomeWork2_Map.class);
    public static void main(String[] args) {
        Map map=new HashMap();// 构造一个具有默认初始容量 (16) 和默认加载因子 (0.75) 的空map。
          map.put(123,"黄磊");
          
          LOG.info("显KEY键与values键值的映射关系"+map.entrySet());  
          LOG.info("此映射中所包含的KEY键为:"+map.keySet());   //返回此映射中所包含的键的 Set 视图。
          LOG.info("此映射中所包含的values键为:"+map.values());   //返回此映射中所包含的键的 Set 视图。
          LOG.info("通过Key键来查找values键的值为:"+map.get(123));//通过键来找对应的映射
          LOG.info("返回此映射中的键-值映射关系数一共有:"+map.size());
          LOG.info("从此映射中移除指定键的映射关系后:"+map.remove(123));
    
    }

}

