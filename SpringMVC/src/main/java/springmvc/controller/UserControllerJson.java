package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.pojo.User;

import java.util.List;

@Controller
@RequestMapping("/json")
public class UserControllerJson {
    
    // json获取数组
    @RequestMapping("/getArrayByJson")
    @ResponseBody
    // 通过 @RequestBody 注解将请求体中的 JSON 数据绑定到 List<String> 类型的参数中。
    // ["xiaohei","xiaobai","xiaohong"]
    public String listGetArrayByJson(@RequestBody List<String> names) {
        names.forEach(System.out::println);
        return names.toString();
    }
    
    // json获取对象
    @RequestMapping("/getObjectByJson")
    @ResponseBody
    // {"name":"xiaohei","password":404}
    public String listGetObjectByJson(@RequestBody User user) {
        System.out.println(user);
        return user.toString();
    }
    
    // json获取对象数组
    @RequestMapping("/getObjectsByJson")
    @ResponseBody
    // [
    //      {"name":"xiaohei","password":404},
    //      {"name":"xiaobai","password":400},
    //      {"name":"xiaohong","password":500}
    // ]
    public String listGetObjectsByJson(@RequestBody List<User> users) {
        users.forEach(System.out::println);
        return users.toString();
    }
}
