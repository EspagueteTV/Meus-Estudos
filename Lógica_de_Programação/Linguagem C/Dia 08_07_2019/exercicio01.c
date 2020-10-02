#include <stdio.h>

int main(){
	
	float nota1, nota2, nota3,media;
	
	printf("Digite a primeira nota do aluno: ");
		scanf("%f", &nota1); 
	printf("Digite a segunda nota do aluno: ");
		scanf("%f", &nota2); 
	printf("Digite a terceira nota do aluno: ");
		scanf("%f", &nota3); 
		
	media = ((nota1 + nota2 + nota3)/3);
	
	if(media>=7){
		printf("A media do aluno(a) foi %.2f, ele(a) esta Aprovado", media);
	}
	else{
		printf("A media do aluno(a) foi %.2f, ele(a) esta Reprovado", media);
	}
	return 0;
}
