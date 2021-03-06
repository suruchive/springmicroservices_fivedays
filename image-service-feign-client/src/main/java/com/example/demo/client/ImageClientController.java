package com.example.demo.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ImageClientController {

	
	@Autowired
	private ImageClient client;



	 @GetMapping(path = "/feign/message/{id}")
	  public String getMessage(@PathVariable("id") int id)  {
		
		 log.info("Client Called");
		  return this.client.getInfo(id);
	  }

	
	 @GetMapping(path = "/feign/images/{id}")
	  public String getImage(@PathVariable("id") int id)  {
		  
		 log.info("Get Image Client Called");
		  return this.client.getImage(id);
	  }

}
