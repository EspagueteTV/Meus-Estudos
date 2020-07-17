#include <stdio.h>

	int main(){
		
		int opcao, voto,  cont;
		float dif,c01, c02, c1, c2;
		c1=0;
		c2=0;
		
		
		do{
			printf("\n-------------Votacao para concuros de Miss------------- \n \n");
			printf("Para votar na Primeira Candidata aperte '1': \n");
			printf("Para votar na segunda candidata aperte '2':  \n");
				scanf("%i", &voto);
				
				if(voto==1){
					c1++;
				}
					else if(voto==2){
						c2++;
					}
						else{
							printf("candidato Invalido !!!");
						}
			
			printf("Para finalizar digite '-1' para continuar digite qualquer numero: ");
				scanf("%i", &opcao);
			
			cont++;
		}while(opcao != -1);
		
		
		printf("\n --------------------------------Resultado da Votacao-------------------------");
//		porcentual candidata 1
		c01 = c1/cont;
		printf("\nO porcentual de votos da candidata 1 eh: %.2f \n", c01);
//		Porcentual candidata 2
		c02 = c2 / cont;
		printf("O porcentual de votos da candidata 2 eh: %.2f \n", c02);

		
		
		
		
		
		system("pause");
		return 0;
	}
