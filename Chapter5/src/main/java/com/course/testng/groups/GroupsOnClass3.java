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
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupOnClass3中的teacher1运行!!");
    }
    public void teacher2(){
        System.out.println("GroupOnClass3中的teacher2运行!!");
    }
}
