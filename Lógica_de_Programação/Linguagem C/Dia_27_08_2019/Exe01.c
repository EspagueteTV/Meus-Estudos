#include <stdio.h>

	int main(){
		
		int n, cont, cont2,cont3,  soma=0, m=0;
		
		printf("Digite um numero positivo:  ");
			scanf("%i", &n);
			m=n;
			
			for(cont3=1; cont<=n; cont++){
			
				for(cont=1; cont<=m; cont++){
					printf("*");
					
				}
					m=m-1;
					printf("\n");
				}
		
			
		
		
		
		
		return 0;
	}
