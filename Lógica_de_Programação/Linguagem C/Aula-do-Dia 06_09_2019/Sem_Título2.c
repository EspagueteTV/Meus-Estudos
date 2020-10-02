#include <stdio.h>
#include <string.h>

	int main(){
		
		int opcao;
		float salario, maior=0 , menor=0;
		char nome[60], nomaior[60] , nomenor[60];
		
		printf("Digite o seu nome: ");
				gets(nome);
			printf("Digite o seu salario: ");
				scanf("%f", &salario);
				
				maior=salario;											
				strcpy(nomenor, nome);
				
				
				menor=salario;
				strcpy(nomenor, nome);
				
		do{
			fflush(stdin);
			printf("Digite o seu nome: ");
				gets(nome);
			printf("Digite o seu salario: ");
				scanf("%f", &salario);
				
				if(salario > maior){
					maior=salario;
					strcpy(nomaior, nome);		/* é a string que recebe a cópia */
					
				}	
				else if(salario < menor){
					menor= salario;
					strcpy(nomenor, nome);
				}
				printf("Para finalizar digite '-1' para continuar aperte qualquer numero: ");
					scanf("%i", &opcao);
						
		}while(opcao != -1);
		
		printf("O funcionario com maior salario  e o %s com um salario de %.2f \n",nomaior,  maior);
		printf("O funcionario com menor salario  e o %s com um salario de %.2f \n",nomenor,  menor);

		
		
		system("pause");
		return 0;
	}
