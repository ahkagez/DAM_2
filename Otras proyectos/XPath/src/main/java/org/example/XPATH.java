package org.example;

import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import java.io.FileInputStream;

public class XPATH {

    public int EjecutarXPath() {

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document xmlDoc = factory.newDocumentBuilder().parse(new InputSource(new FileInputStream("mamifers.xml")));
            XPathExpression expression = xpath.compile("*");
            NodeList nodeList = (NodeList) expression.evaluate(xmlDoc, XPathConstants.NODESET);
            String output = "";

            for (int i = 0; i < nodeList.getLength(); i++) {
                output = output + "\n" + nodeList.item(i).getChildNodes().item(0).getNodeValue();
            }

            System.out.println(output);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
