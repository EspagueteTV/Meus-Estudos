#include <stdio.h>

	int main(){
	
		int  num;
		char cont=1;
		
		while(cont !='F' || cont!= 'f'){
		
		printf("Digite um numero: \n");
			scanf("%i", &num);
			
			if(num%2 == 0){
				printf("Nao e numero primo !");
			}
			else{
				printf("Eh numero primo !");
			}
			
			printf("Para finalizar aperte a tecla 'F', para continuar aperte qualquer tecla: ");
				scanf("%c", &cont);
			
	}
			
			
			
			
			
			
			
			
			
		return 0;
	}
