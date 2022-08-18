
package Q3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in, "UTF-8"); // SET DO SCANER COM TIPO DE TECLADO
        String[] entrada = new String[1000];
        String letraCifradas, maiuscula;// SET DE ENTRADA
        StringBuilder aux = new StringBuilder();// SET STRING ENTRADA
        int n = 0; // COUNT

        // usando stringBuilder pois permite o append com um inteiro e pode ser parceado
        // para string

        do {
            entrada[n] = sc.nextLine().toUpperCase(); // LEITURA DA LINHA DE ENTRADA
        } while (!(isFim(entrada[n++]))); // CONDIÇÃO DE PARADA
        n--; // tirar o FIM

        for (int i = 0; i < n; i++) {
           
            letraCifradas = "";
            maiuscula = "";

            for (int j = 0; j < entrada[i].length(); j++) { // FOR POR CARCTER PARA RECONSTRUIR A PALAVRA
                maiuscula = entrada[i].toUpperCase();
                letraCifradas += (char) (maiuscula.charAt(j) + 3);
            }

            MyIO.println(letraCifradas.toLowerCase());

        }

        sc.close(); // fecha o scanner
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condição de
        // parada
    }

}
