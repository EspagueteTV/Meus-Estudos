#include <stdio.h>

int ehPrimo(int num)
{
    int i = 2;
    while( i < num )
    {
        if(num % i == 0 ) return 0;
        i++;
    }
    return 1;
}

int main()
{
    int numero,	primo = 0;			

    printf("Digite um numero inteiro positivo: ");
    scanf("%d", &numero);

	
    while (primo == 0)
	{
		if ( ehPrimo(numero) )
		    primo = 1;
	    else numero++;
	}
	printf("O proximo primo eh %d\n", numero);
    return 0;
}

