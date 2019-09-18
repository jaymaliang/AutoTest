package com.course.testng.parameter;/**
 * @Author: JayChou
 * @Date: 2019/9/17 10:03
 * @Description:
 */

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/17
 *
 */
public class ParameterTest {

    @Test
    @Parameters({"name","age"})
    public void parameterTest1(String name,int age){
        System.out.println("name="+name+",age="+age);
    }
}
