package org.example;

import javax.swing.text.Document;
import java.io.File;

public class Main {
    public static void main(String[] args) {

        File file = new File("skates.xml");

        DOM dom = new DOM();
        dom.abrirXMLconDOM(file);
        dom.anadirDom("Surfing", "Agua", "No tiene", "Hacer surf en el agua", "5");
        dom.guardarDOM(file);

        System.out.println(dom.mostrarDOM());
    }
}