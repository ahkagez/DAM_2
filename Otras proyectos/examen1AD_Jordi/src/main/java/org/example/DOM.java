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

    public int anadirDOM(String nom_comu, String color, String nocturno){
        try{
            Node nNom_comu = doc.createElement("nom_comu");
            Node nNom_comuText = doc.createTextNode(nom_comu);
            nNom_comu.appendChild(nNom_comuText);

            Node nColor = doc.createElement("color");
            Node nColorText = doc.createTextNode(color);
            nColor.appendChild(nColor);

            Node reptil = doc.createElement("reptil");
            ((Element)reptil).setAttribute("nocturn", nocturno);
            reptil.appendChild(nNom_comu);
            reptil.appendChild(nColor);

            Node root = doc.getChildNodes().item(0);
            root.appendChild(reptil);

            return 0;
        } catch (Exception e){
            e.printStackTrace();
            return -1;
        }
    }
}
