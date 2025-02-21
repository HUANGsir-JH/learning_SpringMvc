package ssm.controller;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ssm.domain.Book;
import ssm.service.BookService;

@Data
@RestController // @RestController = @Controller + @ResponseBody
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean flag = bookService.save(book);
        return new Result(flag ? Code.SAVE_SUC : Code.SAVE_FAIL, null, flag ? "save success" : "save fail");
    }
    
    @PutMapping
    public Result update(@RequestBody Book book) {
        boolean flag = bookService.update(book);
        return new Result(flag ? Code.UPDATE_SUC : Code.UPDATE_FAIL, null, flag ? "update success" : "update fail");
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable(value = "id") Integer id) {
        boolean flag = bookService.delete(id);
        return new Result(flag ? Code.DELETE_SUC : Code.DELETE_FAIL, null, flag ? "delete success" : "delete fail");
    }

    @GetMapping("/{id}")
    public Result findById(@PathVariable(value = "id") Integer id) {
        return new Result(Code.FIND_SUC, bookService.findById(id), "find success");
    }

    @GetMapping
    public Result findAll() {
        return new Result(Code.FIND_SUC, bookService.findAll(), "findAll success");
    }
}
