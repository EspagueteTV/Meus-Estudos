#include <stdio.h>
	
	int main(){
		
		int i;
		float nota[10];
		float soma, media;

//	Preenchendo o vetor com cada nota		
		for(i=0; i<10; i++){
			printf("Digite a nota %i: ", i+1);
				scanf("%f", &nota[i]);
		}
//	Mostra o relatorio das notas
		for(i=0; i<10; i++){
			printf("A nota do aluno %i eh %.2f \n", i+1, nota[i]);
		}
//	Calculo da média
		soma = 0.0;
		for(i=0; i<10; i++){
			soma = soma + nota [i];
		}
		media = soma / 10;
//	Mostrar a média ao usuario
	printf("A media da turma eh: %.2f \n", media);
		
		
		
		
		return 0;
	}
