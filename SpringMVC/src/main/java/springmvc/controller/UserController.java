package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.pojo.User;

import java.util.Arrays;

@Controller
@RequestMapping("/user")
// 用来定义控制器的根访问路径，在类上定义的路径会拼接在方法上定义的路径之前，如/user/save，避免命名冲突
public class UserController {
    @RequestMapping("/save") // 用来处理请求地址映射的注解，如同@WebServlet("/save")注解
    @ResponseBody // 告诉SpringMVC框架，设置当前控制器返回值作为响应体,而不是返回一个视图
    public String save() {
        System.out.println("save");
        return "{\"status\":\"success\"}";
    }
    
    // 接收普通参数请求
    @RequestMapping("/getParam")
    @ResponseBody
    // @RequestParam注解用来接收请求参数,保证springmvc能够正确的将请求参数映射到方法的参数上
    public String getParam(@RequestParam("name") String name,
                           @RequestParam("password") int password) {
        System.out.println("name: " + name + ", password: " + password);
        return "{" + "\"name\":\"" + name + "\", \"password\":\"" + password + "\"}";
    }
    
    // 接收对象参数请求
    @RequestMapping("/getObject")
    @ResponseBody
    // springmvc会自动将请求参数映射到User对象的属性上
    public String getObject(User user) {
        System.out.println(user);
        return user.toString();
    }
    
    // 接收数组参数请求
    @RequestMapping("/getArray")
    @ResponseBody
    // springmvc会自动将同键值的请求参数映射到数组中
    public String getArray(@RequestParam("names") String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
        return Arrays.toString(names);
    }
}
