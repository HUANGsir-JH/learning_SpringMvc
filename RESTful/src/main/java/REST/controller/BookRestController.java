package REST.controller;

import REST.pojo.Book;
import org.springframework.web.bind.annotation.*;

@RestController // @Controller + @ResponseBody
@RequestMapping("/books")
public class BookRestController {
    // 新增图书
//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    public String addBook(@RequestBody Book book) {
        System.out.println("addBook "+book);
        return "{\"method\":\"addBook()\"}";
    }
    
    // 查询单个图书
//    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getBookById(@PathVariable(value = "id") String id) {
        System.out.println("getBookById "+id);
        return "{\"method\":\"getBookById()\"}";
    }
    
    // 查询所有图书
//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public String listBook() {
        System.out.println("listBook");
        return "{\"method\":\"listBook()\"}";
    }
    
    // 删除图书
//    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String deleteBookById(@PathVariable(value = "id") String id) {
        System.out.println("deleteBookById "+id);
        return "{\"method\":\"deleteBookById()\"}";
    }
    
    // 更新图书
//    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    @PutMapping
    public String updateBook(@RequestBody Book book) {
        System.out.println("updateBook "+book);
        return "{\"method\":\"updateBook()\"}";
    }
}
