package com.course.testng;/**
 * @Author: JayChou
 * @Date: 2019/9/17 21:29
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/17
 *
 */
public class TimeOutTest {
    @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException {
        Thread.sleep(3000);
    }
}
