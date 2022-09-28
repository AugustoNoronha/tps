// package Q13;
// import java.util.Scanner;

// import MyIO;

// public class Q13 {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in, "iso-8859-1"); // SET DO SCANER COM TIPO DE TECLADO
//         String[] entrada = new String[1000]; // SET DE ENTRADA
//         int n = 0; // COUNT
//         String[] saida = new String[1000];
//         String aux = "";

//         do {
//             entrada[n] = sc.nextLine(); // LEITURA DA LINHA DE ENTRADA
//             int j = entrada[n].length();
//             String x = cifraCesar(entrada[n], aux, 0, j);
//             saida[n] = x;
//         } while (!(isFim(entrada[n++]))); // CONDI��O DE PARADA
//         n--; // tirar o FIM
//         for(int k = 0; k < n; k++){
//            MyIO.println(saida[k]);
//         }

//         sc.close(); // fecha o scanner
//     }

//     public static String cifraCesar(String entrada, String aux, int i, int j) {
//         String resp = "";
//         if (i <= j - 1) {
//             aux += (char) (entrada.charAt(i) + 3);
//             if (aux.length() == entrada.length()) {
//                 resp = aux;
//             } else {
//                 resp = cifraCesar(entrada, aux, ++i, j);
//             }
//         }
//         return resp;
//     }

//     static boolean isFim(String s) {
//         return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); // metodo de
//                                                                                                     // condi��o de
//                                                                                                     // parada
//     }
// }