#include <stdio.h>

	int main(){
		
		int n, m, cont, cont2;
		
		printf("Digite um numero positivo: ");
			scanf("%i", &n);
				m=n;
			
			for(cont=1; cont<=n; cont++){
				for(cont2=0; cont2<=m; cont2++){
					printf(" ");
				}
				for(cont2=1; cont2<=m; cont2++){
					printf("*");
				}
				m=m-1;
				printf("\n");
			}
			
		
		
		
		
		return 0;
	}
