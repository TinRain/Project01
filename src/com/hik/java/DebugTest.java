package com.hik.java;

import java.util.HashMap;

/**
 * @author Tianxiangyu
 * @create 2019-06-21 下午3:11
 */
public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            System.out.println(i);
        }
        HashMap<String,String> map = new HashMap<>();
        map.put("name","Tom");
        map.put("age","12");
        map.put("school","nanjing");
        map.put("major","software");
        String age = map.get("age");
        System.out.println(age);

        map.remove("major");
        System.out.println(map);
    }
}
