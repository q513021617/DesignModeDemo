package FactoryMethod;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class XMLUtil {

	public static Object getBean() {
		
		try {
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder=dFactory.newDocumentBuilder();
			Document doc;
			doc=dBuilder.parse(new File("src//chart.xml"));
			NodeList nl=doc.getElementsByTagName("className");
			Node classnode=nl.item(0).getFirstChild();
			String cName=classnode.getNodeValue();
			
			Class c=Class.forName(cName);
			Object object=c.newInstance();
			return object;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
		
	}

}
