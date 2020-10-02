#include <stdio.h>

	int main(){
		
		float  N,cont, cont1=0, V, P, A=0;
		
		printf("Digite seu numero inteiro e positivo: ");
			scanf("%f", &N);
		
		for(cont=1; cont<=N; cont++){
			
			 V = N - cont1;
			 P = V/cont;
			 A = (A + P);
			cont1++;

		}
		
			printf("O valor de A eh: %.2f \n", A);
			
			
		
		return 0;
	}
