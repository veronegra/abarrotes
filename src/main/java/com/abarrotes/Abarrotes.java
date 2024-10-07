/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.abarrotes;

import com.mysql.cj.jdbc.AbandonedConnectionCleanupThread;
import com.sun.faces.config.ConfigureListener;
import java.util.TimeZone;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Juan de la Cruz
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.abarrotes.")
public class Abarrotes extends SpringBootServletInitializer{

    public static void main(String[] args) {
	SpringApplication.run(Abarrotes.class, args);
    }
    
    @PostConstruct
    public void init() {
        TimeZone.setDefault(TimeZone.getTimeZone("America/Monterrey"));
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Abarrotes.class);
    }

    @Bean
    public ServletRegistrationBean facesServletRegistration() {
	ServletRegistrationBean registration = new ServletRegistrationBean<>(new FacesServlet(), "*.xhtml");
	registration.setLoadOnStartup(1);
	registration.addUrlMappings("*.fr");
	return registration;
    }

    @Bean
    public ServletContextInitializer servletContextInitializer() {
	return servletContext -> {
	    servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
	};
    }

    @Bean
    public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
	return new ServletListenerRegistrationBean<>(new ConfigureListener());
    }

    @Bean
    public RestTemplate restTemplate() {
	return new RestTemplate();
    }
    
    @PreDestroy
    public void cleanUp() throws Exception {
        AbandonedConnectionCleanupThread.checkedShutdown();
    }
}
