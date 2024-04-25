package de.common.app.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.common.app.a.service.EmailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;



@SpringBootApplication
@EnableScheduling
public class Application {

	final static Logger logger = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	private EmailService emailservice;

	@Profile("local")
    @Bean
    public CommandLineRunner usage() {
        return args -> {
            System.out.println("This app uses Spring Profiles to control its behavior.\n");
            System.out.println("Sample usage: java -jar rabbit-tutorials.jar --spring.profiles.active=hello-world,sender");
            emailservice.sendEmail("springA@local.de","App A testing","Dear World, you are beautiful. Yours Sincerely Deaf World");
        };
    }

    @Profile("!local")
    @Bean
    public CommandLineRunner tutorial() {
        return new RabbitAmqpTutorialsRunner();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
