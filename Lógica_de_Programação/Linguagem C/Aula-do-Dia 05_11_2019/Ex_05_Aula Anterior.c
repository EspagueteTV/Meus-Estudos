#include <stdio.h>

	int main(){
		
//		MAtriz para sa respostas
		char respostas[5][4]; // 5 alunos, 4 questões
//		Vetor para o gabarito
		char gabarito[4] = {'a', 'c', 'a', 'c'};		// 4 questoes
//		Vetor para as notas
		float notas[5] = {0, 0, 0, 0, 0,};			// 5 alunos
		
//		FAzer a leitura das notas
		int i, j;
		
		for(i=0; i<5;i++){
			printf("Aluno %d\n", i+1);
			for(j=0; j<4; j++){
				printf("Questao %d: ", j+1);
					scanf("%c", &respostas[i][j]);
				fflush(stdin); 		// limpa o buffet
			}
			printf("\n");
		}
		
//		Calculo da Nota
		for(i=0; i<5; i++){		// Para cada aluno
			for(j=0; j<4; j++){		// Para cad questao
//			Compara notas com o gabarito 
				if(respostas[i][j] == gabarito[j]){
					notas[i] = notas[i] + 2.5;
				}
			}
		}
		
//		Mostrar as Notas
	for(i=0; i<5; i++){
		printf("Aluno %d: %.2f \n", i+1, notas[i]);
	}
		
		
		system("pause");
		return 0;
	}
