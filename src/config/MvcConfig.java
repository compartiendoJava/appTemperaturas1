package config;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;

@EnableWebMvc
@ComponentScan(basePackages = {"controller"})
@Configuration
public class MvcConfig implements WebMvcConfigurer, ApplicationContextAware{
	private ApplicationContext applicationContext;
	
	public void setApplicationContext(ApplicationContext applicationContext)
            throws BeansException {
        this.applicationContext = applicationContext;
    }
	 @Bean
	    public SpringResourceTemplateResolver templateResolver(){
	      
	        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
	        templateResolver.setApplicationContext(this.applicationContext);
	        templateResolver.setPrefix("/");
	        templateResolver.setSuffix(".html");
	        // HTML es la plantilla por defecto, se indica por claridad.
	        templateResolver.setTemplateMode(TemplateMode.HTML);
	        // Template cache is true by default. Set to false if you want
	        // templates to be automatically updated when modified.
	        templateResolver.setCacheable(true);
	        return templateResolver;
	    }

	    @Bean
	    public SpringTemplateEngine templateEngine(){
	        // SpringTemplateEngine automatically applies SpringStandardDialect and
	        // enables Spring's own MessageSource message resolution mechanisms.
	        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
	        templateEngine.setTemplateResolver(templateResolver());
	        // Enabling the SpringEL compiler with Spring 4.2.4 or newer can
	        // speed up execution in most scenarios, but might be incompatible
	        // with specific cases when expressions in one template are reused
	        // across different data types, so this flag is "false" by default
	        // for safer backwards compatibility.
	        templateEngine.setEnableSpringELCompiler(true);
	        return templateEngine;
	    }

	    @Bean
	    public ThymeleafViewResolver viewResolver(){
	        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
	        viewResolver.setTemplateEngine(templateEngine());
	        return viewResolver;
	    }
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
	    registry.addViewController("/toAgregar").setViewName("agregar");
	    registry.addViewController("/toRespuestaMicro").setViewName("respuestaMicro");
	    registry.addViewController("/").setViewName("inicio");
	    registry.addViewController("/toMenu").setViewName("menu");
	    registry.addViewController("/toGraficoBarras").setViewName("graficoBarras");
	    registry.addViewController("/toGraficoLinea").setViewName("graficoLinea");
	    registry.addViewController("/toTodas").setViewName("todas");
	    registry.addViewController("/toGraficoEntreFechas").setViewName("graficoEntreFechas");
	    registry.addViewController("/tologin").setViewName("login");
	    registry.addViewController("/toInformacion").setViewName("informacion");
	    registry.addViewController("/toconfiguracion").setViewName("configuracion");
	    registry.addViewController("/toAlta").setViewName("alta");
	    registry.addViewController("/toBaja").setViewName("baja");
	    registry.addViewController("/tologing").setViewName("loging");
	    registry.addViewController("/toTodos").setViewName("todosusuarios");
	    registry.addViewController("/toUsuarios").setViewName("usuario");
	    registry.addViewController("/toEnviar").setViewName("enviarmail");
	    registry.addViewController("/toSeleccion").setViewName("seleccion");
	    registry.addViewController("/toSeleccionColores").setViewName("seleccionColores");
	    registry.addViewController("/toTodosTusGraficos").setViewName("todosTusGraficos");
	    registry.addViewController("/toContacto").setViewName("contacto");
	 }
	
	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/*").addResourceLocations("/");
    }
	

	   

	   
	
}
