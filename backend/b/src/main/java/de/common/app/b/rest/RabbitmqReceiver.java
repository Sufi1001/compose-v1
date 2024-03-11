package de.common.app.b.rest;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import de.common.app.b.model.Person;

@RabbitListener(queues = "q-application-send-a-to-b-local-01")
public class RabbitmqReceiver {

	private String value;
	
    @RabbitHandler
    public void receive(String in) {
        System.out.println(" [x] Received '" + in + "'");
        
        Person persons = new Person();
	    
        persons.setName(in);
        
        System.out.println("NAME: "+ persons.getName() );
        
        value = in;
    }
    
    public String receive2() {
    	return value;
    }
}
