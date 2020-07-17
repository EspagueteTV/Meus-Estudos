#include <stdio.h>

	int main(){
		
		int cont=0, opcao=0, nv;
		float men_10, men_15, acim_15;
		
		while(opcao != -1){
			printf("Quantas vezes voce utilizou o restaurante da universidade no ultimo mes: ");
				scanf("%i", &nv);
				
			if(nv<10){
				men_10++;
			}
			if(nv>=10 && nv<15){
				men_15++;
			}
			if(nv>=15){
				acim_15++;
			}
				
			printf("Para finalizar aperte a tecla '-1', senao aperte outro numero: ");		
				scanf("%i", &opcao);
				
			cont++;
		}
			men_10 = men_10 / cont;
			printf("O porcentual de alunos que utilizaram menos que 10 vezes: %.2f \n", men_10);
			men_15 = men_15 / cont;
			printf("O porcentual de alunos que utilizaram ente 10 e 15 vezes: %.2f \n", men_15);
			acim_15 = acim_15 / cont;
			printf("O porcentual de alunos que utilizaram mais que 15 vezes: %.2f \n", acim_15);
		
		
		
			return 0;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return 0;
	}
