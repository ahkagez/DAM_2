package org.example;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        int num = ejecutarXPath();
    }

    public static int ejecutarXPath() {

        try {
            XPath xpath = XPathFactory.newInstance().newXPath();
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            Document xmlDoc = factory.newDocumentBuilder().parse(new InputSource(new FileInputStream("mamifers.xml")));
            XPathExpression expression = xpath.compile("mamifers/mamifer[@perill_extincio=sí]/nom_comu");
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

