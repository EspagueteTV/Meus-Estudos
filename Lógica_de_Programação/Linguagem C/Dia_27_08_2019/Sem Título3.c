#include <stdio.h>

	int main(){
		
		int n, m, cont, cont2, cont3;
		
		printf("Digite um numero positivo: ");
			scanf("%i", &n);
				m=n;
				
			for(cont2=0; cont2>=m; cont2++){
					printf(" ");
				}
				
			for(cont=2; cont<=n; cont++){
				
				for(cont3=1; cont3<=m; cont3++){
					printf("*");
				}
				m=m-1;
				printf("\n");
			}
			
		return 0;
	}
