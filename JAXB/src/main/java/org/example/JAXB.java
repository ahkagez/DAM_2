/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXB {

    public int abrirXMLconJAXB(File file, Mamifers mamifers) {
        JAXBContext context;

        try {
            context = JAXBContext.newInstance(Mamifers.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            mamifers = (Mamifers) unmarshaller.unmarshal(file);

            mamifers.mostrarMamifers(mamifers);

            return 0;
        } catch (JAXBException e) {
            e.printStackTrace();
            return -1;
        }
    }

}