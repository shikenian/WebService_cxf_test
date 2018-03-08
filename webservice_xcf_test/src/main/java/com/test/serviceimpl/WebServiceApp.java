package com.test.serviceimpl;

import com.test.service.HelloWorldService;
import javax.xml.ws.Endpoint;

public class WebServiceApp {
	public static void main(String[] args) {
		System.out.println("web service start");
		HelloWorldService helloWorldService = new HelloWorldServiceImpl();
		String address = "http://localhost:8081/cxfservice"; 
		Endpoint.publish(address, helloWorldService);
		System.out.println("web service finished");
	}
}
