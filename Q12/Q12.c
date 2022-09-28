#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>



bool calcPalin(char s[]){
    
    int i, j;
    int length = strlen(s)-1; 
    for(i = 0, j = length; i < j; i++, j--){ 
        if(s[i] != s[j]){ 
            //nao
            return false; 
        }
    }
    //sim
    return true; 
}

void verPalin(char s[]){
    if( calcPalin(s) == true ){
        printf("SIM\n"); 
    }else {
        printf("NAO\n");
    }
}

bool isFim(char s[]){
    return(strlen(s) == 3 && s[0] == 'F' && s[1] == 'I' && s[2] == 'M'); 
}

int main(){ 
    char entrada[1000]; 
    scanf(" %[^\n]s",entrada);
    do {
        verPalin(entrada);
        scanf(" %[^\n]s",entrada);
    } while (isFim(entrada) == false); 
    return 0;
}