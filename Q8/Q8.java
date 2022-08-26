// package Q8;
// import java.io.*;
// import java.net.*;
// import java.util.Scanner;

// import MyIO;  

// public class Q8 {
//     public static String testeVogal(String codigo) {

//         int tamanho = codigo.length();
//         int a = 0;
//         int e = 0;
//         int i = 0;
//         int o = 0;
//         int u = 0;

//         int Aagudo = 0;
//         int Eagudo = 0;
//         int Iagudo = 0;
//         int Ogudo = 0;
//         int Uagudo = 0;

//         int Acrase = 0;
//         int Ecrase = 0;
//         int Icrase = 0;
//         int Ocrase = 0;
//         int Ucrase = 0;

//         int Atiu = 0;
//         int Echapeu = 0;
//         int Ichapeu = 0;
//         int Otiu = 0;
//         int Uchapeu = 0;

//         int consoante = 0;
//         int br = 0;
//         int table = 0;

//         for (int x = 0; x < tamanho; x++) {

//             // Sem acento

//             if (codigo.charAt(x) == 'a') {
//                 a++;
//             }
//             if (codigo.charAt(x) == 'e') {
//                 e++;
//             }
//             if (codigo.charAt(x) == 'i') {
//                 i++;
//             }
//             if (codigo.charAt(x) == 'o') {
//                 o++;
//             }
//             if (codigo.charAt(x) == 'u') {
//                 u++;
//             }

//             // Acento agudo

//             if (codigo.charAt(x) == 'á') {
//                 Aagudo++;
//             }
//             if (codigo.charAt(x) == 'é') {
//                 Eagudo++;
//             }
//             if (codigo.charAt(x) == 'í') {
//                 Iagudo++;
//             }
//             if (codigo.charAt(x) == 'ó') {
//                 Ogudo++;
//             }
//             if (codigo.charAt(x) == 'ú') {
//                 Uagudo++;
//             }

//             // Acento craseado

//             if (codigo.charAt(x) == 'à') {
//                 Acrase++;
//             }
//             if (codigo.charAt(x) == 'è') {
//                 Ecrase++;
//             }
//             if (codigo.charAt(x) == 'ì') {
//                 Icrase++;
//             }
//             if (codigo.charAt(x) == 'ò') {
//                 Ocrase++;
//             }
//             if (codigo.charAt(x) == 'ù') {
//                 Ucrase++;
//             }

//             // Acento louco

//             if (codigo.charAt(x) == 'ã') {
//                 Atiu++;
//             }
//             if (codigo.charAt(x) == 'ê') {
//                 Echapeu++;
//             }
//             if (codigo.charAt(x) == 'î') {
//                 Ichapeu++;
//             }
//             if (codigo.charAt(x) == 'õ') {
//                 Otiu++;
//             }
//             if (codigo.charAt(x) == 'û') {
//                 Uchapeu++;
//             }

//             // consoante

//             if (codigo.charAt(i) == 'b' ||
//                     codigo.charAt(i) == 'c' ||
//                     codigo.charAt(i) == 'd' ||
//                     codigo.charAt(i) == 'f' ||
//                     codigo.charAt(i) == 'g' ||
//                     codigo.charAt(i) == 'h' ||
//                     codigo.charAt(i) == 'j' ||
//                     codigo.charAt(i) == 'k' ||
//                     codigo.charAt(i) == 'l' ||
//                     codigo.charAt(i) == 'm' ||
//                     codigo.charAt(i) == 'n' ||
//                     codigo.charAt(i) == 'p' ||
//                     codigo.charAt(i) == 'q' ||
//                     codigo.charAt(i) == 'r' ||
//                     codigo.charAt(i) == 's' ||
//                     codigo.charAt(i) == 't' ||
//                     codigo.charAt(i) == 'v' ||
//                     codigo.charAt(i) == 'w' ||
//                     codigo.charAt(i) == 'x' ||
//                     codigo.charAt(i) == 'y' ||
//                     codigo.charAt(i) == 'z') {
//                 consoante++;
//             }

//             if (codigo.charAt(i) == '<' && codigo.charAt(i + 1) == 'b' && codigo.charAt(i + 2) == 'r'
//                     && codigo.charAt(i + 3) == '>') {
//                 br++;
//             }

//             if (codigo.charAt(i) == '<' &&
//                     codigo.charAt(i + 1) == 't' &&
//                     codigo.charAt(i + 2) == 'a' &&
//                     codigo.charAt(i + 3) == 'b' &&
//                     codigo.charAt(i + 4) == 'l' &&
//                     codigo.charAt(i + 5) == 'e' &&
//                     codigo.charAt(i + 6) == '>') {
//                 table++;
//             }

//         }
//         MyIO.print("a" + "(" + a + ")");
//         MyIO.print("e" + "(" + e + ")");
//         MyIO.print("i" + "(" + i + ")");
//         MyIO.print("o" + "(" + o + ")");
//         MyIO.print("u" + "(" + u + ")");

//         MyIO.print("á" + "(" + Aagudo + ")");
//         MyIO.print("é" + "(" + Eagudo + ")");
//         MyIO.print("í" + "(" + Iagudo + ")");
//         MyIO.print("ó" + "(" + Ogudo + ")");
//         MyIO.print("ú" + "(" + Uagudo + ")");

//         MyIO.print("à" + "(" + Acrase + ")");
//         MyIO.print("è" + "(" + Ecrase + ")");
//         MyIO.print("ì" + "(" + Icrase + ")");
//         MyIO.print("ò" + "(" + Ocrase + ")");
//         MyIO.print("ù" + "(" + Ucrase + ")");

//         MyIO.print("ã" + "(" + Atiu + ")");
//         MyIO.print("ê" + "(" + Echapeu + ")");
//         MyIO.print("î" + "(" + Ichapeu + ")");
//         MyIO.print("õ" + "(" + Otiu + ")");
//         MyIO.print("û" + "(" + Uchapeu + ")");

//         MyIO.print("consoante" + "(" + consoante + ")");

//         MyIO.print("<br>" + "(" + br + ")");
//         MyIO.print("<table>" + "(" + table + ")");

//         return "";
//     }

//     public static String getHtml(String endereco) {
//         URL url;
//         InputStream is = null;
//         BufferedReader br;
//         String resp = "", line;

//         try {
//             url = new URL(endereco);
//             is = url.openStream(); // throws an IOException
//             br = new BufferedReader(new InputStreamReader(is));

//             while ((line = br.readLine()) != null) {
//                 resp += line + "\n";
//             }
//         } catch (MalformedURLException mue) {
//             mue.printStackTrace();
//         } catch (IOException ioe) {
//             ioe.printStackTrace();
//         }

//         try {
//             is.close();
//         } catch (IOException ioe) {
//             // nothing to see here
//         }

//         testeVogal(resp);

//         return resp;
//     }

//     public static boolean isFim(String s) {

//         return (s.length() == 3 && s.charAt(0) == 'F' && s.charAt(1) == 'I' && s.charAt(2) == 'M');
//     }

//     public static void main(String[] args) {
//         MyIO.setCharset("UTF-8");
//         String endereco, html, nome;
//         nome = MyIO.readLine();
//         do {
//             endereco = MyIO.readLine();
//         } while (!isFim(nome));
//         html = getHtml(endereco);

//     }

// }
