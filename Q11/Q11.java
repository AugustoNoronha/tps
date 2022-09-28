import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in, "UTF-8"); // SET DO SCANER COM TIPO DE TECLADO
        String[] entrada = new String[1000]; // SET DE ENTRADA
        int n = 0; // COUNT
       

        do {
            entrada[n] = sc.nextLine(); // LEITURA DA LINHA DE ENTRADA
            int j = entrada[n].length() -1;
            boolean x = isPalindromo(entrada[n], 0, j);
            MyIO.println(x == true ? "SIM" : "NAO");
        } while (!(isFim(entrada[n++]))); // CONDI��O DE PARADA
        n--; // tirar o FIM

        sc.close(); // fecha o scanner
    }

    public static boolean isPalindromo(String entrada, int i, int j) {
        boolean resp = true;
        if (i <= j) {
            if (entrada.charAt(i) != entrada.charAt(j))
                resp = false;
            else
                resp = isPalindromo(entrada, ++i, --j);
        }
        return resp;
    }

    static boolean isFim(String s) {
        return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
                                                                                                    // condi��o de
                                                                                                    // parada
    }
}