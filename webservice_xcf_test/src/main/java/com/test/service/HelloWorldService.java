package com.test.service;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import com.test.vo.User;

@WebService
public interface HelloWorldService {
	
	public String sayHello(@WebParam(name="text") String text);
	public String sayHelloToUser(User user);
	public String sayHelloToUserList(List<User> userList);
	
}
