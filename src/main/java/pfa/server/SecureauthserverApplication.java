package pfa.server;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import pfa.server.model.Account;
import pfa.server.repository.AccountRepository;

@SpringBootApplication
@EnableAuthorizationServer
@EnableResourceServer
@RestController
public class SecureauthserverApplication {

	@Autowired
	AccountRepository repository;
	
//  Descomentar para Generar Usuarios Iniciales
	@Bean
	CommandLineRunner demo(){
		if(repository.findAll().isEmpty()){
			repository.save(new Account("fheras.garcia@gmail.com", "fherasg*321.", true, "wolfsoftco", "Farith", "Administrador"));
		}
		return null;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SecureauthserverApplication.class, args);
	}
	
	@RequestMapping("/account")
	public Account getAccount(@RequestParam String username) {
		return repository.findByUserNameAndActive(username, true);
	}
	
	@RequestMapping("/user")
	public Principal user(Principal user) {
		return user;
	}
}
