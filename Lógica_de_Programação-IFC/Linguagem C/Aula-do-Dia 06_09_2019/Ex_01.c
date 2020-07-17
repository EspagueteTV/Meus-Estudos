#include <stdio.h>

	int main(){
		
		int cont=1, sim=0;
		float falso=0;
		char opcao;
		
		do{
			printf("Voce gosta de futebol ? \n");
			printf("Se voce gosta de futebol digite 'S' \n");
			printf("Se voce nao gosta de futebol digite 'N' \n");
				scanf("%s", &opcao);
				
				if(opcao == 'N' || opcao == 'n'){
					falso++;
				}
				else if(opcao == 'S' || opcao == 's'){
					sim++;
				}
				else{
					printf("Codigo Invalido !!! \n");
				}
				cont++;
				
		}while(cont<=5);
		
			printf("Entre as cinco(05) pessoas apenas %i gostam de Futebol e %.1f nao gostam de futebol \n", sim, falso);
		
		
		system("pause");
		return 0;
	}
