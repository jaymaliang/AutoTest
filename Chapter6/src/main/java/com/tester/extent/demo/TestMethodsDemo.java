package com.tester.extent.demo;/**
 * @Author: JayChou
 * @Date: 2019/9/18 14:37
 * @Description:
 */

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/18
 *
 */
public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我们自己的运行时的异常");
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
}
