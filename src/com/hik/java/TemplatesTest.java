package com.hik.java;

import com.hik.bean.Customer;

import java.util.ArrayList;

/**
 * @author Tianxiangyu
 * @create 2019-06-21 下午12:33
 *
 * Idea中代码模版所处的位置：settings-Editor-Live Templates / Postfix Completion
 */

public class TemplatesTest {
    //模版五：prsf:可生成 private static final(例如可以在单例模式中把唯一的对象声明为prsf)
    private static final Customer cust = new Customer();
    //ps//
    public static final int NUM = 1;
    //psfi
    public static final int BU = 1;
    //psfs
    public static final String Byy = "enbfb";













    //模版一:psvm
    public static void main(String[] args) {
        //模版二:sout
        System.out.println();
        //变形：soutp  / soutm / soutv /xxx.sout
        //打印形参
        System.out.println("args = [" + args + "]");
        //打印方法
        System.out.println("TemplatesTest.main");
        //打印变量,如果有多个变量，就近原则打印
        int num = 10;
        System.out.println("num = " + num);
        //用.方法进行打印
        System.out.println(num);

        //模版三：fori
        String[] arr = new String[]{"TOm","Jerry","Naruto","Sasike"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);
        }

        //模版四
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(234);
        list.add(345);
        //list.for
        for (Object o : list) {

        }
        //list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //list.forr //倒序遍历数组
        for (int i = list.size() - 1; i >= 0; i--) {

        }





    }



}
