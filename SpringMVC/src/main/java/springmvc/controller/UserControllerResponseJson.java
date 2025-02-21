package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import springmvc.pojo.User;

import java.util.ArrayList;
import java.util.List;

// 响应页面请求，返回内容（页面，json等）
@Controller
public class UserControllerResponseJson {
    // 返回页面
    // 返回页面的方法不需要 @ResponseBody 注解
    // 返回页面的方法返回值是 String 类型，表示逻辑视图名
    // 返回页面的方法返回值会被视图解析器解析为实际的视图
    @RequestMapping("/getPage")
    public String getPage() {
        return "helloMVC";
    }
    
    // 返回 json
    @RequestMapping("/getTxt")
    @ResponseBody
    public String getTxt() {
        return "Hello, SpringMVC!";
    }
    
    // 用json返回pojo对象
    @RequestMapping("/getUser")
    @ResponseBody
    public User getUser() {
        User user = new User();
        user.setName("Tom");
        user.setPassword(1234);
        return user;
    }
    
    // 返回pojo列表
    @RequestMapping("/getUsers")
    @ResponseBody
    public List<User> getUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.setName("Tom");
        user1.setPassword(1234);
        users.add(user1);
        
        User user2 = new User();
        user2.setName("Jerry");
        user2.setPassword(5678);
        users.add(user2);
        
        return users;
    }
}
