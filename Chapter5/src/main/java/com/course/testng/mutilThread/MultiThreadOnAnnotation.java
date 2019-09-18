package com.course.testng.mutilThread;/**
 * @Author: JayChou
 * @Date: 2019/9/17 17:14
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/17
 *
 */
public class MultiThreadOnAnnotation {
    @Test(invocationCount = 10, threadPoolSize = 10)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id  : %s%n",Thread.currentThread().getId());
    }
}
