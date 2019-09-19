package com.course.testng;/**
 * @Author: JayChou
 * @Date: 2019/9/16 18:31
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/16
 *
 */
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1执行！");
    }

    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2执行！");
    }

    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3执行！");
    }

    @Test(enabled = false)
    public void ignore4(){
        System.out.println("ignore4执行！");
    }
}
