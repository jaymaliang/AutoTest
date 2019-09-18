package com.course.testng;/**
 * @Author: JayChou
 * @Date: 2019/9/16 20:43
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/16
 *
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
    }

    @Test
    public void test2(){
        System.out.println("test2 run");
    }

    @Test  (dependsOnMethods = {"test2","test1"})
    public void test3(){
        System.out.println("test3 run");
    }
}
