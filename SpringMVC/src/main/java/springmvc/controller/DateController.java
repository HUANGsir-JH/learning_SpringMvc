package springmvc.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class DateController {
    
    // 日期型数据在传输过程中会被转换为时间戳
    // 注意传输时的格式
    @RequestMapping("/getDate")
    @ResponseBody
    public String getDate(@RequestParam("date") Date date, // 默认是 yyyy/MM/dd
                          @RequestParam("date1") @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                          @RequestParam("date2") @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date date2,
                          @RequestParam("date3") @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date3
    ) {
        System.out.println(date);
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        String[] times = {date.toString(), date1.toString(), date2.toString(), date3.toString()};
        return String.join("\n", times);
    }
}
