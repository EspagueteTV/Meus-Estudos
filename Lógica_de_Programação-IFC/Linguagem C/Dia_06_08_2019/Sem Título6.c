#include <stdio.h>
#include <string.h>

	int main(){
	
		int  num;
		char cont=1;
		
		while(cont !='F' || cont!= 'f'){

		printf("\n Digite um numero: \n");
			scanf("%i", &num);
			
			if( num!=2 && num%2 == 0 ){
				printf("Nao e numero primo !\n");
			}
			
			else if(num!=3 && num%3 ==0 ){
				printf("Nao e numero primo !\n");
			}
			
			else if(num!=5 && num%5 ==0 ){
				printf("Nao e numero primo !\n");
			}
			else if(num!=7 && num%7 ==0){
				printf("Nao eh numero primo !");
			}
			
			else{
				printf("Eh numero primo !\n");
			}
			fflush(stdin);
			printf("Para finalizar aperte a tecla 'F', para continuar aperte qualquer tecla: ");
				scanf("%c", &cont);
						
	}
			
		return 0;
	}
