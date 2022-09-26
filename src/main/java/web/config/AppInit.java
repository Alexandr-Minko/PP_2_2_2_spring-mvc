package web.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInit extends AbstractAnnotationConfigDispatcherServletInitializer {

    // класс - конфигурация для всех Сервлетов (общий или корневой контекст)
    // нам он не нужен, поэтому null
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }


    // класс - конфигурация для одного Сервлета
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[]{
                WebConfig.class
        };
    }


    // url за который отвечает DispatcherServlet. Если “/”, то за все
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

}