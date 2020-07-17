#include <stdio.h>
#include <string.h>

	int main(){
	
		int  num, cont=1, sol=1;
		
		printf("Digite um numero:  ");
			scanf("%i",&num);
		
		while(sol != 0 && cont<num){
			sol= num%cont;

		
		cont++;
		}		
	
	
	
	
	
	printf("EE %i  ",sol);
	
		return 0;
	}
