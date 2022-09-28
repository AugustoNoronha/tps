#include <stdio.h>
#include <string.h>

int main(void)
{
    char palavra1[100];
    char palavra2[100];
    char resp[200];
    int cc = 0;
    int count = 0;
    int maior = 0, menor = 0;
    while (scanf(" %s", palavra1) == 1 && scanf(" %s", palavra2) == 1)
    {

        if (strlen(palavra1) <= strlen(palavra2))
        {
            maior = strlen(palavra2);
            menor = strlen(palavra1);
        }
        else
        {
            maior = strlen(palavra1);
            menor = strlen(palavra2);
        }
        int sobra = strlen(maior) - strlen(menor);
        for (int i = 0; i < menor; i++)
        {
            if (cc = 0)
            {
                resp[count] = palavra1[count];
                cc = 1;
            }
            else
            {
                resp[count] = palavra2[count];
                cc = 0;
            }
            count++;
        }
        for (int j = 0; j <= sobra; j++)
        {
            if (cc = 0)
            {
                resp[count] = palavra1[count];
                cc = 1;
            }
            else
            {
                resp[count] = palavra2[count];
                cc = 0;
            }
            count++;
        }
        printf("%s", resp);
    }
    return 0;
}