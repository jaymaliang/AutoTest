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

    @Parameters({"name","age"})
    @Test
    public void parameterTest1(String name,int age){
        System.out.println("name="+name+",age="+age);
    }

    @Parameters({"name","age"})
    @Test
    public void parameterTest2(String name,int age){
        System.out.println("name="+name+",age="+age);
    }
}
