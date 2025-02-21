package springmvc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ServletContainerInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    
    /**
     * 这个方法用来配置ContextLoaderListener创建的应用上下文中的bean
     * 通常在这里配置一些根应用上下文的配置类，比如数据源、事务管理等
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { SpringmvcConfig.class };
    }
    
    /**
     * 这个方法用来配置DispatcherServlet创建的应用上下文中的bean
     * 通常在这里配置Spring MVC相关的配置类，比如控制器、视图解析器等
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] { SpringmvcConfig.class };
    }
    
    /**
     * 这个方法用来配置DispatcherServlet的映射路径
     * 这里配置了"/"，表示所有的请求都由DispatcherServlet处理
     */
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}