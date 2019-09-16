package com.course.testng.suit;/**
 * @Author: JayChou
 * @Date: 2019/9/13 14:21
 * @Description:
 */

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 *liang.ma
 *2019/9/13
 *
 */
public class SuitConfig {

    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before Suit运行了");
    }

    @AfterSuite
    public void afterSuit(){
        System.out.println("after Suit运行了");
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
