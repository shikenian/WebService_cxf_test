package com.test.serviceimpl;

import java.io.File;
import java.util.List;

import javax.jws.WebService;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import com.test.service.HelloWorldService;
import com.test.vo.User;

@WebService(endpointInterface="com.test.service.HelloWorldService",serviceName="helloWorld")
public class HelloWorldServiceImpl implements HelloWorldService {

	public String sayHello(String text) {
		return "Hello" + text;
	}

	public String sayHelloToUser(User user) {
		
		SAXReader reader = new SAXReader();
		File xmlfile = new File(
				"C:/Users/kshi/Documents/GitHub/WebService_cxf_test/webservice_xcf_test/src/main/java/com/test/client/books.xml");

		Document document = null;
		try {
			document = reader.read(xmlfile);
		} catch (DocumentException e1) {
			e1.printStackTrace();
		}
		Element root = document.getRootElement();
		List<Element> childElements = root.elements();

		for (Element child : childElements) {
			List<Element> books = child.elements();
			for (Element book : books) {
				String name = book.getName();
				String text = book.getText();
				if (user.getDesc().equals(text)) {
					System.out.println(name + " : " + text);
				}
			}

		}
		try {
			Thread.sleep(1000 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Hello" + user.getName();
	}

	public String sayHelloToUserList(List<User> userList) {
		return "Hello" + userList.size();
	}

}
