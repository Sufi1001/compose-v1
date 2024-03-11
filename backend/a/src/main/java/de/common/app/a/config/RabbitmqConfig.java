package de.common.app.a.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import de.common.app.a.rest.RabbitmqSender;

@Profile({"rabbitmq-config"})
@Configuration
public class RabbitmqConfig {

	@Bean
	public Queue queue() {
		return new Queue("q-application-send-a-to-b-local-01");
	}

	@Profile("sender")
	@Bean
	public RabbitmqSender sender() {
		return new RabbitmqSender();
	}
}