package org.superbiz.moviefun;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean(HttpServlet actionServlet){
        ServletRegistrationBean<HttpServlet> servletRegistrationBean = new ServletRegistrationBean<>(actionServlet);
        servletRegistrationBean.setOrder(ServletRegistrationBean.LOWEST_PRECEDENCE);
        servletRegistrationBean.addUrlMappings("/moviefun/*");
        return servletRegistrationBean;
    }
}
