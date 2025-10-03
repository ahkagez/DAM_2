package org.example;

import javax.swing.text.Document;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("skates.xml");

        DOM dom = new DOM();
        dom.abrirXMLconDOM(file);

        System.out.println(dom.mostrarDOM());
    }
}