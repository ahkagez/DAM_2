package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        JAXB jaxb = new JAXB();
        Mamifers mamifers = new Mamifers();
        jaxb.abrirXMLconJAXB(new File("C:\\jaxb-ri\\actividad_8.xml"), mamifers);
    }
}
