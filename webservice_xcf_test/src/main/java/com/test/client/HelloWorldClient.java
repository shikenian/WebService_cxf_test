package com.test.client;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.test.service.HelloWorldService;
import com.test.vo.User;

public class HelloWorldClient {
	public static void main(String[] args) {
		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(HelloWorldService.class);
		jwpfb.setAddress("http://localhost:8081/cxfservice");
		//实例化出一个Service的调用对象，其实是动态生成的HelloService 的一个代理
		HelloWorldService hws = (HelloWorldService)jwpfb.create();
		
		User user = new User();
		user.setAge("13");
		user.setDesc("I am a demo");
		user.setID("3344");
		user.setName("SB");
		
		System.out.println(hws.sayHelloToUser(user));
		
	}
}
