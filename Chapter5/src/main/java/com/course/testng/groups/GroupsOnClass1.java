package com.course.testng.groups;/**
 * @Author: JayChou
 * @Date: 2019/9/16 20:21
 * @Description:
 */

import org.testng.annotations.Test;

/**
 *liang.ma
 *2019/9/16
 *
 */
@Test(groups = "stu")
public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("GroupOnClass1中的stu1运行!!");
    }
    public void stu2(){
        System.out.println("GroupOnClass1中的stu2运行!!");
    }
}
