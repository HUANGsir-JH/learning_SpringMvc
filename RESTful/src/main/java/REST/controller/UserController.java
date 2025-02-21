package REST.controller;

import REST.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {
    // 保存
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    public String save() {
        System.out.println("save");
        return "{\"method\":\"save()\"}";
    }
    
    // 查询单个
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    @ResponseBody
    /**
     * @PathVariable注解用来接收请求路径中占位符的值
     * 需要注意的是，@PathVariable注解的value属性值必须和@RequestMapping注解的value属性值中的占位符一致
     */
    public String getById(@PathVariable(value = "id") Integer id) {
        System.out.println("getID"+id);
        return "{\"method\":\"getById()\"}";
    }
    
    // 查询所有
    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    public String list() {
        System.out.println("list");
        return "{\"method\":\"list()\"}";
    }
    
    // 删除
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    @ResponseBody
    public String delete(@PathVariable(value = "id") Integer id) {
        System.out.println("delete"+id);
        return "{\"method\":\"delete()\"}";
    }
    
    // 更新用户（json）
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    public String update(@RequestBody User user) {
        System.out.println("register "+user);
        return "{\"method\":\"update()\"}";
    }
    
}
