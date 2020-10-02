/* Exercicio 03 Sexo */
#include <stdio.h>

int main(){
	
	char sexo;
	
	printf("Digite a primeira letra do seu sexo: ");
		scanf("%c", &sexo);
		
		if(sexo=='m' || sexo=='M'){
			printf("Sexo Masculino");
		}
		else if(sexo=='f' || sexo=='F'){
			printf("Sexo Feminino");
		}
		else{
			printf("Codigo Invalido");
		}
		
		return 0;
}
