package Q9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8"); // SET DO SCANER COM TIPO DE TECLADO
        String[] entrada = new String[1000];
        String letraCifradas, maiuscula;// SET DE ENTRADA
        StringBuilder aux = new StringBuilder();// SET STRING ENTRADA
        int n = 0; // COUNT
       

        do {
            entrada[n] = sc.nextLine().toUpperCase(); // LEITURA DA LINHA DE ENTRADA
        } while (!(isFim(entrada[n++]))); // CONDIÇÃO DE PARADA
        n--; // tirar o FIM

        for (int i = 0; i < n; i++) {
            MyIO.println("sdasdasdasd");
            MyIO.println(entrada[i]);
            try {
                File fout = new File("fileq9.txt");

                FileOutputStream fos = new FileOutputStream(fout);
        
                BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for(int j = 0; j < n; j++){
            bw.write(entrada[i].toString());
                bw.newLine();
        }
                
                bw.close();
               
            } catch (IOException e) {
                MyIO.println("nada bom");
            }
        }


    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condição de
        // parada
    }

}
