package org.example;

import java.io.File;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

public class JAXB {
    public Reptils obrirXMLambJAXB(File file){
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Reptil.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            Reptils reptils = (Reptils) unmarshaller.unmarshal(file);

            return reptils;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
