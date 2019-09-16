package com.course.testng;/**
 * @Author: JayChou
 * @Date: 2019/9/13 13:39
 * @Description:
 */

import org.testng.annotations.*;

/**
 *liang.ma
 *2019/9/13
 *
 */
public class BasicAnnotation {
    //最基本的注解，用来把方法标记为测试方法
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("BeforeMethed这是方法之前运行的");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod这是方法之后运行的");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass这是类运行之前运行的");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass这是类运行之后运行的");
    }

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuite测试套件");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite测试套件");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
}