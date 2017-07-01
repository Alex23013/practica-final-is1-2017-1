package app;

import domain.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Import;

import config.WebConfig;
import domain.BaseEntity;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Import(WebConfig.class)
@EnableAutoConfiguration
@EnableWebMvc
@EntityScan(basePackageClasses=BaseEntity.class)
public class BankApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(BankApplication.class, args);
	}
}