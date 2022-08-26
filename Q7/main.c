// #include <stdio.h>
// #include <string.h>

// int isVogal(char c);
// int isConsoante(char c);

// void validador(char entrada[]);

// int main() {
//   char entrada[1000][1000];

// 	int n = 0;

// 	do { scanf(" %[^\n]", entrada[n]); } while (strcmp(entrada[n++], "FIM") != 0);

// 	for (int i = 0; i < n - 1; i++){
//     validador(entrada[i]);
//   }
// }

// void validador(char entrada[]) {
// 	int vogal = 0, consoante = 0, countInt = 0, numerosReais = 0;
  
// 	for (int i = 0; i < strlen(entrada); i++) {
// 		if (isVogal(entrada[i])) vogal++;

// 		if (isConsoante(entrada[i])) consoante++;

// 		if (entrada[i] >= '0' && entrada[i] <= '9') countInt++;

// 		if (entrada[i] == '.' || entrada[i] == ',') numerosReais++;
// 	}
	
//   if(vogal == strlen(entrada)){
// 	  printf("SIM");
//     printf(" ");
//   }else{
//     printf("NAO");
//     printf(" ");
//   }

//   if(consoante == strlen(entrada)){
// 	  printf("SIM");
//     printf(" ");
//   }else{
//     printf("NAO");
//     printf(" ");
//   }

//   if(countInt == strlen(entrada)){
// 	  printf("SIM");
//     printf(" ");
//   }else{
//     printf("NAO");
//     printf(" ");
//   }

//   if(numerosReais + countInt == strlen(entrada) && numerosReais <= 1){
// 	  printf("SIM \n");
//   }else{
//     printf("NAO \n");
//   }

// }

// int isVogal(char c) { return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'); }

// int isConsoante(char c) { return c == 'b'
//                         || c == 'c'
//                         || c == 'd'
//                         || c == 'f'
//                         || c == 'g'
//                         || c == 'h'
//                         || c == 'j'
//                         || c == 'k'
//                         || c == 'l'
//                         || c == 'm'
//                         || c == 'n'
//                         || c == 'p'
//                         || c == 'q'
//                         || c == 'r'
//                         || c == 's'
//                         || c == 't'
//                         || c == 'v'
//                         || c == 'w'
//                         || c == 'y'
//                         || c == 'z'; }

