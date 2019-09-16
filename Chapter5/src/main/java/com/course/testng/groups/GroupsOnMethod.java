package com.course.testng.groups;/**
 * @Author: JayChou
 * @Date: 2019/9/16 19:53
 * @Description:
 */

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/16
 *
 */
public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端组的测试方法11111111111111");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端组的测试方法22222222222");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端组的测试方法33333333333");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端组的测试方法4444444444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组的运行之前运行的方法!!!!!!!!!");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端组的运行之后运行的方法!!!!!!!!!");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("客户端组的运行之前运行的方法!!!!!!!!!");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("客户端组的运行之后运行的方法!!!!!!!!!");
    }
}
