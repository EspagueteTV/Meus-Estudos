#include <stdio.h>
#include <math.h>

	int main(){
		
		int cont, produt, soma=0;
		
		for(cont=0; cont<=64; cont++){
			produt= pow(2,cont);
			soma = soma + produt;
				
		}
		printf("O valor total de graos que o monge recebeu foi:  %i \n", soma);
		
		system("pause");
		return 0;
	}
