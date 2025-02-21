package springmvc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan(basePackages = "springmvc")
@EnableWebMvc
/*
  启用 Spring MVC 配置：
       @EnableWebMvc 会导入 DelegatingWebMvcConfiguration 类，该类是 Spring MVC 的默认配置类。
 *      它会自动配置 Spring MVC 的核心组件，例如：
 *          RequestMappingHandlerMapping：用于处理请求映射。
 *          RequestMappingHandlerAdapter：用于处理请求并调用控制器方法。
 *          ExceptionHandlerExceptionResolver：用于处理异常。
 *          其他默认的视图解析器、消息转换器等。
 */
public class SpringmvcConfig implements WebMvcConfigurer {
    // 配置视图解析器,将逻辑视图名解析为实际的视图
    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        // 创建视图解析器
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        // 设置前缀
        viewResolver.setPrefix("/");
        // 设置后缀
        viewResolver.setSuffix(".html");
        return viewResolver;
    }
}
