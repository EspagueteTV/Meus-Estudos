#include <stdio.h>

	int main(){
		
		int quant_alu, cont;
		float nota, soma, media_turma;
		cont=1;
		soma=0;
		
		printf("Digite a quantidade de alunos da sala:  ");
			scanf("%i",&quant_alu);
		
		while(cont<=quant_alu){
			printf("Digite a nota do aluno: ");
				scanf("%f", &nota);
					soma= soma+nota;
						cont++;
		}
		media_turma= soma/quant_alu;
		
		printf("A media da turma foi: %.2f", media_turma);
		
		return 0;
	}
