//Escreva um programa em C que lê o nome e o peso de uma pessoa e apresente a seguinte mensagem: "Oi <nome>, voce pesa <peso> quilos.". O peso deve ser apresentado até a terceira casa decimal.

#include <stdio.h>

int main(){
	float peso;
	char nome[40] ;
	
	
	printf("Digite seu nome: ");
		gets(nome);
	printf("Digite seu peso: ");
		scanf("%f", &peso);
		
	printf("Oi %s , voce pesa %.3f quilos.", nome, peso);
	
	
	return 0;
}
