#include <stdio.h>
#include <string.h>

int main(){
	
	int idade, cont, maior=0, menor=0;
	char nome[60];
	
	for(cont=1; cont<=10; cont++){
				fflush(stdin);
		printf("Digite seu Nome:  ");
			gets(nome);
		printf("Digite a sua Idade: ");
			scanf("%i", &idade);
			
		if(idade>=21)
			maior++;
		
		else
			menor++;
		}
		printf("Somente %i de pessoas possuem mais de 21 anos", maior);
			
			
	return 0;
}
