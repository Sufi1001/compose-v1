package de.common.app.a.rest;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import java.util.*;
import de.common.app.a.repository.PersonRepository;
import de.common.app.a.entity.Person;

public class RabbitmqSender {

	@Autowired
	private RabbitTemplate template;

	@Autowired
	private Queue queue;
	
	@Autowired
	PersonRepository personRepository;
	
	@Scheduled(fixedDelay = 60000, initialDelay = 500)
	public void send() {
		
		List<Person> persons = new ArrayList<>();
	    persons = personRepository.findAll();    
	    System.out.println(persons);
	    
		//String message = "Hello Deaf World!";
		String message = persons.get(0).getName();
		//Object message = persons;
		
		this.template.convertAndSend(queue.getName(), message);
		System.out.println(" [x] Sent '" + persons + "'");
	}
}