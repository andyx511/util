package com.alex.utils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.collection.CollUtil;
import com.alex.utils.domain.Person;

import java.util.HashMap;

/**
 * @Classname BeanTest
 * @Description TODO
 * @Date 2020/5/12 17:39
 * @Author ALexNi
 */
public class BeanTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = CollUtil.newHashMap();
        map.put("name", "Joe");
        map.put("age", 12);
        map.put("asd",123);
        Person person =  BeanUtil.fillBeanWithMap(map, new Person(), true);
        System.out.println(person.toString());
    }
}
