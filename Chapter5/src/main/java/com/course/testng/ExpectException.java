package com.course.testng;/**
 * @Author: JayChou
 * @Date: 2019/9/16 20:37
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/16
 *
 */
public class ExpectException {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常");
        throw new RuntimeException();
    }
}
