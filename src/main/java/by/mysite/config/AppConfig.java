package by.mysite.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.ViewResolver;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableWebMvc
@ComponentScan("by.mysite.controllers")
public class AppConfig {
    @Bean
    public ViewResolver viewResolver() {
        System.out.println("ViewResolver");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/pages/");
        resolver.setSuffix(".jsp");
        return resolver;
    }

    @Bean
    public ViewResolver viewResolverHtml() {
        System.out.println("ViewResolver");
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/html-pages/");
        resolver.setSuffix(".html");
        return resolver;
    }
}
