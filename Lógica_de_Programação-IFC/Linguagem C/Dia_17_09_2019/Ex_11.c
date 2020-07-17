#include <stdio.h>

	int main(){
		
		int matricula, cont=0, alu=0, aprov=0, reprov=0;
		float nota, media, soma, n1, n2, n3;
		
		while(matricula != 9999){
			printf("Digite a matricula do Aluno: \n");
				scanf("%i", &matricula);
		
				for(cont=1; cont<=3; cont++){
					printf("Digite a nota %i: ", cont);
						scanf("%f", &nota);
				
				if(cont==1)
					n1 = nota;
				if(cont==2)
					n2 = nota;
				if(cont==3)
					n3 = nota;
				
				}	
				media= ((2*n1)+ (3*n2)+ (4*n3))/9;
				
				if(media>=5){
					printf("A matricula eh: %i \n", matricula);
					printf("A sua media foi %.2f \n", media);
					printf("Aprovado !\n");
					aprov++;
				}
				else{
					printf("Reprovado \n");
					reprov++;
				}
				
				soma=0;
				alu++;
			printf("Para finalizar a leitura digite '9999': ");
				scanf("%i", &matricula);
				
		}
			printf("Num total de %i alunos, %i foram aprovados e %i foram reprovados \n", alu, aprov, reprov);
		
		return 0;
	}
