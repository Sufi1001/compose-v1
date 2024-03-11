package de.common.app.b.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import de.common.app.b.rest.RabbitmqReceiver;
import org.json.JSONObject;

@RestController
public class PersonController {
	
	@Autowired
	RabbitmqReceiver receiver;
	
	@RequestMapping("/test")
	public String AppB(){
		return ("Application B");
	}
	
	@RequestMapping("/hello")
	public String HelloB(){
		return "Hello B";
	}
	
	@RequestMapping("/sendtoangular")
	public String AppC(){
		System.out.println("sendtoangular: "+ receiver.receive2() );
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("name", receiver.receive2());
		return jsonObject.toString();
	}
}

