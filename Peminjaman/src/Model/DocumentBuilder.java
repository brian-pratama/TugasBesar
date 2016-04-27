/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.File;
import java.io.IOException;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import Model.Barang;

/**
 *
 * @author Brian
 */
public class DocumentBuilder {
    
    @SuppressWarnings("empty-statement")
    public static Barang[] readDaftarBarang() throws ParserConfigurationException, SAXException, IOException{
        
        Barang[] barang = new Barang[200];
        
        File fXmlFile = new File("daftarBarang.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	javax.xml.parsers.DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
			
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("barang");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

                        barang[temp].setIdBarang(eElement.getAttribute("id"));
                        barang[temp].setStatusKondisi(eElement.getElementsByTagName("kondisi").item(0).getTextContent());
                        barang[temp].setStatusPinjam(eElement.getElementsByTagName("kondisi").item(0).getTextContent());
		}
	}
        return barang;
    }
    
    public static Petugas[] readDaftarPetugas() throws ParserConfigurationException, SAXException, IOException{
        Petugas[] petugas = new Petugas[9];
        
        File fXmlFile = new File("daftarPetugas.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	javax.xml.parsers.DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	org.w3c.dom.Document doc = dBuilder.parse(fXmlFile);
			
	doc.getDocumentElement().normalize();

	System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			
	NodeList nList = doc.getElementsByTagName("petugas");

	for (int temp = 0; temp < nList.getLength(); temp++) {

		Node nNode = nList.item(temp);
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

			Element eElement = (Element) nNode;

                        petugas[temp].setUsername(eElement.getAttribute("username"));
                        petugas[temp].setPassword(eElement.getElementsByTagName("password").item(0).getTextContent());
                        petugas[temp].setNama(eElement.getElementsByTagName("nama").item(0).getTextContent());
		}
	}
        
        return petugas;
    }
    
}
