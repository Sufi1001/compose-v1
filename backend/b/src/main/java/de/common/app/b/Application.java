package de.common.app.b;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import de.common.app.b.service.EmailService;


@SpringBootApplication
public class Application {

   
    private EmailService emailservice;
    
    public Application(EmailService emailservice) {
    	this.emailservice = emailservice;
    }
    
    public static void main(String[] argv) throws Exception { 
        
        ApplicationContext context = SpringApplication.run(Application.class, argv);
        Application app = context.getBean(Application.class);
        
        app.Run();
    }

	private void Run() {
		// TODO Auto-generated method stub
        emailservice.sendEmail("springB@local.de","App B testing","Dear World, you are beautiful. Yours Sincerely Deaf World");
	}






}
