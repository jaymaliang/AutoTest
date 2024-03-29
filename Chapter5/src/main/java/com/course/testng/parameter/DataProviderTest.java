package com.course.testng.parameter;/**
 * @Author: JayChou
 * @Date: 2019/9/17 11:23
 * @Description:
 */

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 *liang.ma
 *2019/9/17
 *
 */
public class DataProviderTest {
    @Test(dataProvider = "data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+",age="+age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"zhangsan",10},
                {"lisi",20},
                {"wangwu",30}
        };
        return o;
    }

    @Test(dataProvider="methodData")
    public void test1(String name,int age){
        System.out.println("test11111方法:"+"name="+name+",age="+age);
    }
    @Test(dataProvider="methodData")
    public void test2(String name,int age){
        System.out.println("test22222方法:"+"name="+name+",age="+age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",25},
            };
        }else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"wangwu",50},
                    {"zhouliu",60},
            };
        }
        return result;
    }
}
