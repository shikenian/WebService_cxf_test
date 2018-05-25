package com.test.client;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class SimpleTestXml {
	public static void main(String[] args) throws DocumentException, UnsupportedEncodingException {
		SAXReader reader = new SAXReader();
		File xmlfile = new File(
				"C:/Users/kshi/Documents/GitHub/WebService_cxf_test/webservice_xcf_test/src/main/java/com/test/client/books.xml");

		Document document = reader.read(xmlfile);
		// Document document = reader.read(new
		// ByteArrayInputStream(xml.getBytes("utf-8")));
		Element root = document.getRootElement();
		List<Element> childElements = root.elements();

		for (Element child : childElements) {
			List<Element> books = child.elements();
			for (Element book : books) {
				String name = book.getName();
				String text = book.getText();
				if (text.equals("MySQL从删库到跑路")) {
					System.out.println(name + " aaa " + text);
				}
				System.out.println(name + ":" + text);
			}

		}
		try {
			Thread.sleep(1000 * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Element book2 = childElements.get(1);
		// Element author = book2.element("author");
		// Element title = book2.element("title");
		// Element publisher = book2.element("publisher");
		// System.out.println("Ã¤Â½Å“Ã¨â‚¬â€¦Ã¯Â¼Å¡" + author.getText());
		// System.out.println("Ã¤Â¹Â¦Ã¥ï¿½ï¿½Ã¯Â¼Å¡" + title.getText());
		// System.out.println("Ã¥â€¡ÂºÃ§â€°Ë†Ã§Â¤Â¾Ã¯Â¼Å¡" +
		// publisher.getText());
	}
}
