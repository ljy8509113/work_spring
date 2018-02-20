package di;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DaoFactory {
	private static Map<String, String> daos = new HashMap<>();
	
	static {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder parser = factory.newDocumentBuilder();
			
			Document dom = parser.parse(new FileInputStream("./src/di/config.xml"));
			Element root = dom.getDocumentElement();
			NodeList list = root.getChildNodes();
			for(int i=0; i<list.getLength(); i++) {
				if(list.item(i) instanceof Element) {
					Element el = (Element) list.item(i);
					String id = el.getAttribute("id");
					String className = el.getTextContent();
					daos.put(id, className);
					System.out.println(id + ":" + className);
				}
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static UserDao getDao(String type) {
		String className = daos.get(type);
		System.out.println("class name : " + className);
		
		try {
			Class<?> daoClass = Class.forName(className);
			Object obj = daoClass.newInstance();
			
			if(UserDao.class.isInstance(obj)) {
				UserDao dao = (UserDao)obj;
				return dao;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
