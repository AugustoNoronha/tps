
import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "UTF-8"); // SET DO SCANER COM TIPO DE TECLADO
        String[] entrada = new String[10000]; // SET DE ENTRADA
        StringBuilder aux = new StringBuilder();// SET STRING ENTRADA
        int n = 0; // COUNT

        do {
            entrada[n] = sc.nextLine(); // LEITURA DA LINHA DE ENTRADA
        } while (!(isFim(entrada[n++]))); // CONDIÃ‡ÃƒO DE PARADA
        n--; // tirar o FIM

        // Function to find whether an input
        // character is vowel or not
        for (int i = 0; i < n; i++) {
            int consoante = 0;
            int vogal = 0;

            for (int j = 0; j < entrada[i].length(); j++) { // FOR POR CARCTER PARA RECONSTRUIR A PALAVRA
                // volgal
                if (entrada[i].charAt(j) == 'a' || entrada[i].charAt(j) == 'e' || entrada[i].charAt(j) == 'i'
                        || entrada[i].charAt(j) == 'o'
                        || entrada[i].charAt(j) == 'u') {
                    vogal++;
                }
                // consoante

                if (entrada[i].charAt(j) == 'b'
                        || entrada[i].charAt(j) == 'c'
                        || entrada[i].charAt(j) == 'd'
                        || entrada[i].charAt(j) == 'f'
                        || entrada[i].charAt(j) == 'g'
                        || entrada[i].charAt(j) == 'h'
                        || entrada[i].charAt(j) == 'j'
                        || entrada[i].charAt(j) == 'k'
                        || entrada[i].charAt(j) == 'l'
                        || entrada[i].charAt(j) == 'm'
                        || entrada[i].charAt(j) == 'n'
                        || entrada[i].charAt(j) == 'p'
                        || entrada[i].charAt(j) == 'q'
                        || entrada[i].charAt(j) == 'r'
                        || entrada[i].charAt(j) == 's'
                        || entrada[i].charAt(j) == 't'
                        || entrada[i].charAt(j) == 'v'
                        || entrada[i].charAt(j) == 'w'
                        || entrada[i].charAt(j) == 'y'
                        || entrada[i].charAt(j) == 'z'

                ) {
                    consoante++;
                }

                // aux.append((int) entrada[i].charAt(j));

            }
            if (vogal == entrada[i].length()) {
                MyIO.print("SIM");
                MyIO.print(" ");
            }

            else {
                MyIO.print("NAO");
                MyIO.print(" ");

            }

            if (consoante == entrada[i].length()) {
                MyIO.print("SIM");
                MyIO.print(" ");

            }

            else {
                MyIO.print("NAO");
                MyIO.print(" ");

            }

            boolean inteiro = isInteger(entrada[i]);
            if (inteiro == true) {
                MyIO.print("SIM");
                MyIO.print(" ");

            } else {
                MyIO.print("NAO");
                MyIO.print(" ");

            }

            boolean rel = isNumber(entrada[i]);
            if (rel == true) {
                MyIO.println("SIM");
            } else {
                MyIO.println("NAO");
            }
        }
        sc.close(); // fecha o scanner

    }
    // The Driver code
    private static boolean isInteger(String str) {
        return str != null && str.matches("[0-9]*");
    }

    private static boolean isNumber(String s) {
    boolean xb = true;
        try{
            double x = Double.parseDouble(s);
        }catch(Exception e){
            xb = false;
        }
    return xb;
    }

       static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condiÃ§Ã£o de
        // parada
    }
}
