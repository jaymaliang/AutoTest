package hello.com.course.server;/**
 * @Author: JayChou
 * @Date: 2019/10/10 20:44
 * @Description:
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *liang.ma
 *2019/10/10
 *
 */
@RestController   //说明是要被扫描的类
public class MyGetMethod {

    @RequestMapping(value = "/getCookies",method = RequestMethod.GET)
    public String getCookies(){
        return "恭喜你获取cookies成功";
    }
}
