/* http://linguagemc.com.br/a-biblioteca-string-h/ */

#include <stdio.h>
#include <string.h>

	int main(){
		
		int cont=1, retorno;
		float salario, soma, media, salario_m, salario_p;
		char opcao[4] = "sim" , nome[60], maior_s[60], menor_s[60];
		
		
		
		while(strcmp(opcao,"fim") != 0) {
			
			printf("Digite o seu nome:  ");
				fflush(stdin);
				gets(nome);
			printf("Digite o seu salario: ");
				scanf("%f", &salario);
					soma= soma + salario;
					
//			Seleção de Primeira vez de rodada do progarama
			if(cont==1){
				salario_m = salario;
				salario_p = salario;
					strcpy(maior_s, nome);
					strcpy(menor_s, nome);	
				}
				
//				Vereficação salário maior
				if(salario> salario_m){
					salario_m = salario;
						strcpy(maior_s, nome);
				}
				
				else if(salario < salario_p){
					salario_p = salario;
						strcpy(menor_s, nome);
							}
							
//				Seleção de finalização do programa 
				cont++;
				fflush(stdin);
					printf("Para finalizar digite 'fim' , senão aperte qualquer tecla: \n");
						gets(opcao);
						
						
		}
			media= soma/cont;
			
			printf("\nA media de salario dos funcionarios foi: %.2f \n", media);
			printf("O maior salario eh o %.2f do funcionario %s .\n", salario_m, maior_s);
			printf("O menor salario eh o %.2f do funcionario %s .\n", salario_p, menor_s);
		
		
		
		system("pause");
		return 0;
	}
