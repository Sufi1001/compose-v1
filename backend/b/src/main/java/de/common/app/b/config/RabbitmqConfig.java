package de.common.app.b.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import de.common.app.b.rest.RabbitmqReceiver;

@Profile({"rabbitmq-config"})
@Configuration
public class RabbitmqConfig {

	@Bean
	public Queue queue() {
		return new Queue("q-application-send-a-to-b-local-01");
	}

	@Profile("receiver")
	@Bean
	public RabbitmqReceiver receiver() {
		return new RabbitmqReceiver();
	}
}