package com.course.testng.mutilThread;/**
 * @Author: JayChou
 * @Date: 2019/9/17 17:23
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/17
 *
 */
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id  : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("Thread Id  : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("Thread Id  : %s%n",Thread.currentThread().getId());
    }
}
