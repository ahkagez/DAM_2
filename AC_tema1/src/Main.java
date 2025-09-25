import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) {
        File arxiu = new File("C:\\Users\\Jordi B\\IdeaProjects\\AC_tema1\\ad_bosch_ud1_activitat1.txt");

        try{
            FileWriter fw = new FileWriter("ad_bosch_ud1_activitat1.txt");
            fw.write("Activitat 1 \n");
            fw.close();
        }catch(IOException e){
            System.out.println("Error");
        }




        System.out.println("El contenido del documento de texto es: ");
        try{
            FileReader fr = new FileReader("ad_bosch_ud1_activitat1.txt");
            int i = fr.read();
            while(i > -1){
                System.out.print((char)i);
                i = fr.read();
            }
        }catch(IOException e){
            System.out.println("Error");
        }





        try{
            RandomAccessFile raf = new RandomAccessFile("C:\\Users\\Jordi B\\IdeaProjects\\AC_tema1\\ad_bosch_ud1_activitat1.txt", "rw");
            byte[] bytes = new byte[100];
            long longitud = raf.length();

            raf.seek(longitud);
            raf.write("\nActivitat 3 de Jordi Bosch Ciejka".getBytes());

            raf.seek(longitud);
            raf.read(bytes);
            System.out.println(new String(bytes).replace("\0", ""));
        }catch(IOException e){
            System.out.println("Error");
        }
    }
}