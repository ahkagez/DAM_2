package org.example;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class DOM {

    Document doc;

    public int abrirXMLconDOM(File file) {

        doc = null;

        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setIgnoringComments(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            doc = builder.parse(file);

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }

    }

    protected String[] procesarSkate (Node node){
        String data[] = new String[5];
        Node nTemp = null;
        NodeList nList = null;
        int counter = 1;

        data[0] = node.getAttributes().item(0).getNodeValue();

        nList = node.getChildNodes();
        for (int i=0; i < nList.getLength(); i++) {
            nTemp = nList.item(i);

            if (nTemp.getNodeType() == Node.ELEMENT_NODE) {
                data[counter] = nTemp.getChildNodes().item(0).getNodeValue();
                counter++;
            }
        }

        return data;
    }

    public String mostrarDOM(){
        Node node;
        Node root = doc.getFirstChild();
        NodeList nodeList = root.getChildNodes();
        String nodeData[] = null;
        String output = "";

        for (int i = 0; i < nodeList.getLength(); i++) {
            node = nodeList.item(i);

            if(node.getNodeType() == Node.ELEMENT_NODE) {
                nodeData = procesarSkate(node);
                output = output + "\n" + "Tipo de Skate: " + nodeData[0];
                output = output + "\n" + "Descripcion: " + nodeData[1];
                output = output + "\n" + "Tipo de Ruedas: " + nodeData[2];
                output = output + "\n" + "Su uso: " + nodeData[3];
                output = output + "\n -------------------";
            }
        }

        return output;
    }

    public int anadirDom(String tipo, String descripcion, String ruedas, String uso, String id) {

        try {
            Node nTipo = doc.createElement("Tipo");
            Node nTipoText = doc.createTextNode(tipo);
            nTipo.appendChild(nTipoText);

            Node nDescripcion = doc.createElement("Descripcion");
            Node nDescripcionText = doc.createTextNode(descripcion);
            nDescripcion.appendChild(nDescripcionText);

            Node nRuedas = doc.createElement("Ruedas");
            Node nRuedasText = doc.createTextNode(ruedas);
            nRuedas.appendChild(nRuedasText);

            Node nUso = doc.createElement("Uso");
            Node nUsoText = doc.createTextNode(uso);
            nUso.appendChild(nUsoText);

            Node nSkate = doc.createElement("Skate");
            ((Element)nSkate).setAttribute("id", id);
            nSkate.appendChild(nTipo);
            nSkate.appendChild(nDescripcion);
            nSkate.appendChild(nRuedas);
            nSkate.appendChild(nUso);

            Node root= doc.getChildNodes().item(0);
            root.appendChild(nSkate);
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }

    public int guardarDOM(File file) {
        try {
            TransformerFactory tFactory = TransformerFactory.newInstance();
            Transformer transformer = tFactory.newTransformer();
            transformer.setOutputProperty(javax.xml.transform.OutputKeys.INDENT, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(file);

            transformer.transform(source, result);

            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
    }
}
