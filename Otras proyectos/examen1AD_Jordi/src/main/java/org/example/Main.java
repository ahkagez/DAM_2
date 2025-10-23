package org.example;

import java.io.*;
import java.util.Arrays;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Main {
    public static void main(String[] args) {
        // ------------- Actividad 1 -------------
        File file = new File("text.txt");

        //// 1.1 Escribir
        try{
            FileWriter fw = new FileWriter(file);
            fw.write("Activitat 1");
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

        //// 1.2 Leer
        try{
            FileReader fr = new FileReader(file);
            char[] letras = new char[100];
            fr.read(letras);
            String frase = new String(letras);
            fr.close();
            System.out.println(frase.replace("\0", ""));

        }catch (Exception e){
            e.printStackTrace();
        }


        // ------------- Actividad 2 -------------
        try{
            RandomAccessFile raf = new RandomAccessFile(file, "rw");
            byte[] texto = new byte[(int) raf.length()];
            raf.read(texto);
            raf.seek(0);
            raf.write("Actividad 2\n".getBytes());
            raf.write(texto);

            raf.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        // ------------- Actividad 3 -------------
        // esta hecho en la clase GSON
        Gson gson = new Gson();
        Amfibi amfibi = new Amfibi("Test", "Test", true);
        String json = gson.toJson(amfibi);

        // Crear el archivo JSON
        try{
            FileWriter fileWriter = new FileWriter(new File("amfibi.json"));
            fileWriter.write(json);
            fileWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Leer el archivo JSON
        try{
            FileReader fr = new FileReader(new File("amfibi.json"));
            char[] letras = new char[100];
            fr.read(letras);
            String frase = new String(letras);
            fr.close();
            System.out.println(frase.replace("\0", ""));
        } catch (Exception e){
            e.printStackTrace();
        }



        // ------------- Actividad 4 -------------
        // Esta en la clase DOM.java, cree un metodo solo para añadir


        // ------------- Actividad 5 -------------
        // 5.a --> " xjc reptils.xsd "
        // 5.b esta hecho en la clase JAXB



    }
}