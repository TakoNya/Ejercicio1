package archivosejercicio1;
import java.io.*;

public class ArchivosEjercicio1 {

        public static void main(String[] args) {
            System.out.println("Volcando a archivo de texto...");
            try {
                BufferedWriter archivoSalida = new BufferedWriter(new FileWriter (new File("archivo1.txt")));
                archivoSalida.write("Hola");
                archivoSalida.newLine();
                archivoSalida.write("Este es");
                archivoSalida.write(" un archivo de texto");
                archivoSalida.newLine();
                archivoSalida.close();
            }catch (IOException errorDeArchivo){
                System.out.println("Ha habido problemas: " + errorDeArchivo.getMessage());
            }
        
    }
    
}
