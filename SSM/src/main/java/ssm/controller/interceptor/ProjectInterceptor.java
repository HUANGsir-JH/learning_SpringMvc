package ssm.controller.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 拦截器：
 *
 */
@Component
public class ProjectInterceptor implements HandlerInterceptor {
    @Override
    /**
     * 在请求处理之前进行调用（Controller方法调用之前）
     * 相应的request，response都会被传入，可以进行一些前置处理
     * 比如说：权限验证、日志打印等等
     * 类似与AOP
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle...");
        return true; // 返回true表示放行，返回false表示拦截
    }
    
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }
    
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
