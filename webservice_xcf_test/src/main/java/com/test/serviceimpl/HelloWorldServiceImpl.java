package com.test.serviceimpl;

import java.util.List;

import com.test.service.HelloWorldService;
import com.test.vo.User;

import javax.jws.WebService;

@WebService(endpointInterface="com.test.service.HelloWorldService",serviceName="helloWorld")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String sayHello(String text) {
		return "Hello" + text;
	}

	public String sayHelloToUser(User user) {
		return "Hello" + user.getName();
	}

	public String sayHelloToUserList(List<User> userList) {
		return "Hello" + userList.size();
	}

}
