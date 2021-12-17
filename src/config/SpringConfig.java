package config;


import java.util.Properties;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiTemplate;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "repository",entityManagerFactoryRef = "factory",transactionManagerRef = "txManager" )
@ComponentScan(basePackages = { "repository,service"})
@Configuration
@PropertySource("classpath:config/application.properties")
public class SpringConfig {
	@Value("${gestion.temperaturas.driver}")
	String driver;
	@Value("${gestion.temperaturas.url}")
	String cadena;
	@Value("${gestion.temperaturas.user}")
	String usuario;
	@Value("${gestion.temperaturas.pwd}")
	String pw;
	

	/* @Bean

	private DataSource crearDataSource() {// equivalente abean en xml

		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName("com.mysql.cj.jdbc.Driver");
		data.setUrl("jdbc:mysql://localhost:3306/formacion?serverTimezone=UTC");
		data.setUsername("root");
		data.setPassword("root");
		return data;

	}*/
	@Bean
	public DataSource crearDataSource() {
		DriverManagerDataSource data=new DriverManagerDataSource();
		data.setDriverClassName(driver);
		data.setUrl(cadena);
		data.setUsername(usuario);
		data.setPassword(pw);
		return data;
	}
	
	 /* private DataSource crearDatasource() { DataSource dataSource = null;
	  JndiTemplate jndi = new JndiTemplate(); try { dataSource =
	  jndi.lookup("java:comp/env/reftemperaturas", DataSource.class); } catch
	  (NamingException e) { e.printStackTrace(); } return dataSource; }*/
	 

	/*
	 * @Bean public JdbcTemplate crearTemplate() {
	 * 
	 * JdbcTemplate template=new JdbcTemplate();
	 * 
	 * template.setDataSource(crearDataSource());
	 * 
	 * return template; }
	 */
	// adaptador de Hibernate
	@Bean
	public HibernateJpaVendorAdapter adapter() {
		HibernateJpaVendorAdapter adp = new HibernateJpaVendorAdapter();
		adp.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		return adp;
	}

	// factoria EntityManager: Objeto para acceder a capa de persistencia con JPA
	@Bean
	public LocalContainerEntityManagerFactoryBean factory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setPersistenceUnitName("temperaturasPU");
		factory.setDataSource(crearDataSource());
		factory.setPackagesToScan("model");
		factory.setJpaVendorAdapter(adapter());
		Properties properties = new Properties();
		properties.put("hibernate.enable_lazy_load_no_trans", true);
		factory.setJpaProperties(properties);
		return factory;
	}

	// gestor de transacción
	@Bean
	public JpaTransactionManager txManager() {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(factory().getObject());

		return manager;
	}
	@Bean
    public JavaMailSender getJavaMailSender() 
    {
        JavaMailSenderImpl mailSender = new JavaMailSenderImpl();
        mailSender.setHost("smtp.gmail.com");
        mailSender.setPort(587);
          
        mailSender.setUsername("compartiendoJava@gmail.com");
        mailSender.setPassword("pupmbklbtjgjfnrf");
          
        Properties props = mailSender.getJavaMailProperties();
        props.put("mail.transport.protocol", "smtp");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.debug", "true");
          
        return mailSender;
    }
     
    @Bean
    public SimpleMailMessage emailTemplate()
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("somebody@gmail.com");
        message.setFrom("admin@gmail.com");
        message.setText("FATAL - Application crash. Save your job !!");
        return message;
    }
	

}
