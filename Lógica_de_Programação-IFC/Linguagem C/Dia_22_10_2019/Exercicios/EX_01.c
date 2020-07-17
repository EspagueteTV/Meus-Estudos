#include <stdio.h>

	int main(){
		
		int cont, v_a = 0;
		char letra[10];
		
		printf("Digite uma palavra: ");
			gets(letra);
			
			for(cont=0; cont<10; cont++){
				if(letra[cont] == 'a'){
					v_a++;
				}
			}
		
		printf("A letra 'a' apareceu %d vezes.", v_a);
		
		
		
		
		
		return 0;
	}
