#include <stdio.h>

	int main(){
		
		int num, cont, maior, menor;
		cont=2;
		
		printf("Digite um numero: ");
			scanf("%i", &num);
				maior=num;
				menor=num;
		
			while(cont<=10){
				printf("Digite um numero: ");
					scanf("%i", &num);
				
						if(num>maior)
							maior=num;
						
						else if(num<menor)
							menor=num;
						
					cont++;
			}
			
			printf("O maior numero eh %i e o menor numero eh %i", maior, menor);
		
		return 0;
	}
