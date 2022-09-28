// import java.util.Scanner;

// public class Q1 {
//     public static void main(String[] args) throws Exception {

//         Scanner sc = new Scanner(System.in, "UTF-8"); //SET DO SCANER COM TIPO DE TECLADO 
//         String [] entrada = new String [1000]; //SET DE ENTRADA 
//         String aux;//SET STRING ENTRADA
//         int n = 0; //COUNT

//         do {
//             entrada[n] = sc.nextLine(); //LEITURA DA LINHA DE ENTRADA 
//         } while (!(isFim(entrada[n++]))); //CONDIÇÃO DE PARADA
//         n--; //tirar o FIM

//         for(int i = 0; i < n; i++) {

//             aux = ""; //auxiliar

//             for(int j = entrada[i].length()-1; j >= 0; j--) { //FOR POR CARCTER PARA RECONSTRUIR A PALAVRA 

//                 aux += (char)entrada[i].charAt(j); //conversor da palavra
//             }

//             if(aux.equals(entrada[i])){

//                 MyIO.println("SIM"); //e palindromo
//             } else {

//                 MyIO.println("NAO"); //nao e palindromo
//             }
//         }

//         sc.close(); //fecha o scanner
//     }

//     static boolean isFim(String s) {
//         return(s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M'); //metodo de condição de parada
//     }
// }