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
		//将会导致数据错乱
		//String类型底层的结构是char[] 数组类型。并且char[]数组底层保存byte是按照Unicode的形式来的
		//但是getBytes的方法会按照当前的默认类型来把Unicode类型byte进行转码取出
		//再次使用byte建立一个string类型，已经相当于是一种转型了。把Unicode字符串 转换成 了已给cp1252字符串。
		//但是Unicode的一些字符，没法完全支持，导致出现问号
		user.setDesc(new String("MySQL从删库到跑路".getBytes()));
		user.setID("3344");
		user.setName("SB");
		
		System.out.println(hws.sayHelloToUser(user));
		
	}
}
