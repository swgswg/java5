package com;

/**
 1.编写代码，使之导致java堆溢出、虚拟机栈溢出、方法区溢出、和本地内存溢出；
 2.创建一个实体类，覆写toString()方法使之输出json格式字符串；
 3.创建一个带id属性的实体类，覆写hashCode和equals方法；将实体类放入集合中，使相同id值
 得对象不重复；
 */

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Person person = new Person(1, "小明", 20);
        String json = person.toString();
        System.out.println(json);

        Map<Integer, Person> personMap = new HashMap<>();
        Person p2 = new Person(2,"小红",18);
        Person p3 = new Person(3,"小强", 20);
        Person p4 = new Person(4,"小李", 21);
        Person p5 = new Person(5, "小王", 22);
        personMap.put(p2.getId(), p2);
        personMap.put(p3.getId(), p3);
        personMap.put(p4.getId(), p4);
        personMap.put(p5.getId(), p5);
        System.out.println(personMap);
    }

}
