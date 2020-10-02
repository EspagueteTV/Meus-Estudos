#include <stdio.h>

	int main(){
		
		int j, i, n;
		
		printf("Digite um numero positivo:  ");
			scanf("%i", &n);
			
			for(j = 0; j<n; j++){
				for(i = n; i >= -n; i--)
					if (i > 0){
						printf("*");
				}
					else{
						printf("\b");
					}
					
						if(j)
							for(i = 0; i <j; i++ )
								printf(" ");
								
								printf("\n");
			}
			return 0;
	}
