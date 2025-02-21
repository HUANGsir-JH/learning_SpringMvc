package ssm.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import ssm.controller.interceptor.ProjectInterceptor;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new ProjectInterceptor()).addPathPatterns("/**");
        // 这里可以设置拦截那些请求进行处理，目前是拦截所有请求
        // 其他的比如说：/user/**，表示拦截/user/下的所有请求；/book，表示拦截/book请求
    }
}
