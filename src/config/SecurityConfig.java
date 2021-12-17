package config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	@Autowired
	DataSource dataSource;
	//definición roles y usuarios
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth
        .inMemoryAuthentication()
        .withUser("nombre")
          .password("password") 
          .roles("usuarios");
          
		
		/*la seguiente configuración será para el caso de 
		 * usuarios en una base de datos
		 */ auth.jdbcAuthentication().dataSource(dataSource)
        	.usersByUsernameQuery("select nombre , password "
        			+ "+from temperaturas where nombre=?")
        	.authoritiesByUsernameQuery("select nombre, authority "
                	+ "from authorities where nombre=?");
        	
		 
	}
//definición de políticas de seguridad
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
		//solo los miembros del rol admin podrán realizar altas
		//y para buscar cuentas tendrán que estar autenticados
		
		.antMatchers("/toMenu").hasAnyRole("nombre","password")
		
		
		.and()
		//.httpBasic();
		.formLogin()
		.loginPage("/loging.html")
	       .loginProcessingUrl("/doLoging")
	       .defaultSuccessUrl("/toMenu.html", true)
	       .failureUrl("/inicio.html?error=true")
	       .usernameParameter("nombre")
	       .passwordParameter("password");

	
	}
}

