package maventest3;

import java.io.FileInputStream;
import java.lang.reflect.Field;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory; 

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import model.Type;
import model.Type2;

public class java_test {
	@Test
	public void aa() throws Exception{
//		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
//		DocumentBuilder b = f.newDocumentBuilder();
//		Document d = b.parse(new FileInputStream("d:/applicationContext.xml"));
//		Node n = d.getFirstChild();
//		NodeList ns = n.getChildNodes();
//		for(int i=0;i<ns.getLength();i++) {
//		//	System.out.println(ns.item(i).getNodeName());
//			if(ns.item(i).getNodeName().equals("bean")) {
//				Element e = (Element) ns.item(i);
//				String cname = e.getAttribute("class");
//				Class<?> cls = Class.forName(cname);
//				Object t= cls.newInstance();
//				System.out.println(t.getClass());
//				NodeList nss = e.getChildNodes();
//				for(int j=0;j<nss.getLength();j++) {
//					Element ee = (Element) nss.item(i);
//					if(ee.getNodeName().equals("property")) {
//						String name = ee.getAttribute("name");
//						String val = ee.getAttribute("value");
//						Field nn = cls.getDeclaredField(name);
//						nn.setAccessible(true);
//						nn.set(t, val);
//					}
//				}
//				Type tt = (Type) t;
//				System.out.println(tt.getName());
//			}
//		}
		ApplicationContext act = new ClassPathXmlApplicationContext("aa.xml");
		//Type t = (Type) act.getBean("ss");
		//System.out.println(t.getName());
		Type2 tt = act.getBean(Type2.class);
		System.out.println(tt.getT().getName());
	}
}
