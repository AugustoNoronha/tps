package Q4;

import java.util.Random;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "UTF-8"); // SET DO SCANER COM TIPO DE TECLADO
        String[] entrada = new String[1000]; // SET DE ENTRADA
        StringBuilder aux = new StringBuilder();// SET STRING ENTRADA
        int n = 0; // COUNT

        do {
            entrada[n] = sc.nextLine(); // LEITURA DA LINHA DE ENTRADA
        } while (!(isFim(entrada[n++]))); // CONDIÇÃO DE PARADA
        n--; // tirar o FIM

        for (int i = 0; i < n; i++) {
            aux = new StringBuilder();
            Random geradorL1 = new Random();
            geradorL1.setSeed(4);
           char letra01 = (char) ('a' + (Math.abs(geradorL1.nextInt()) % 26));
           char letra02 = (char) ('a' + (Math.abs(geradorL1.nextInt()) % 26));


            for (int j = 0; j < entrada[i].length(); j++) { // FOR POR CARCTER PARA RECONSTRUIR A PALAVRA

                if((char) entrada[i].charAt(j) == letra01)
                aux.append(letra02);
                else
                aux.append(entrada[i].charAt(j));
            }

            MyIO.println(aux.toString());

        }

        sc.close(); // fecha o scanner
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condição de
        // parada
    }
}
