package com.dv.SpringReact;

import com.dv.SpringReact.model.User;
import com.dv.SpringReact.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringReactApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringReactApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Dhruvrajsinh","Vansia","iamdv@gmail.com"));
		this.userRepository.save(new User("Krushnarajsinh", "Vansia", "krushna@gmail.com"));
	}
}
