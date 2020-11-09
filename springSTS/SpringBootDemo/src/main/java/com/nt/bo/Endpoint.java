package com.nt.bo;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@org.springframework.boot.actuate.endpoint.annotation.Endpoint(id="say-hello")
public class Endpoint {
	//WriteOperation, DeleteOperation  JMXEndPoint Webendpoint
	@ReadOperation
	public String sayHello() {
		return "Hello World";
	}
	

}
