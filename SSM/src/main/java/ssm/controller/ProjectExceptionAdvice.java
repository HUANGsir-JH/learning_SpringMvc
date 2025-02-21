package ssm.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // 统一异常处理类
public class ProjectExceptionAdvice {
    @ExceptionHandler(Exception.class) // 标识该方法为异常处理方法，处理那些异常（此处为全部异常）
    public Result doException(Exception e) {
        System.out.println("Exception: " + e.getMessage());
        return new Result(Code.SYSTEM_UNKNOWN_ERR, null, "Sorry, the server is busy, please try " +
                "again later.");
    }
    // 可以自定义异常类（继承RuntimeException），对不同的异常进行不同的处理
    // 比如说：系统错误、服务器错误、用户错误等等
    // 然后@ExceptionHandler(自定义异常类.class)进行处理
}
