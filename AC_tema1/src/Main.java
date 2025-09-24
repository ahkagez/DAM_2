import java.io.*;

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

        try(BufferedReader br = new BufferedReader( new FileReader("C:\\Users\\Jordi B\\IdeaProjects\\AC_tema1\\ad_bosch_ud1_activitat1.txt") )){
            String linea;
            while( (linea = br.readLine()) != null ){
                System.out.println(linea);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}