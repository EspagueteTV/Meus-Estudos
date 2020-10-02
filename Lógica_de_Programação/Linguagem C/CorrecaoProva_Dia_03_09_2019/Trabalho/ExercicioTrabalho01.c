// *****
//	****
//	 ***
//	  **
//	   * 

#include <stdio.h>

	int main(){
		
	int j, i, n;
	
		printf("Digite um numero:  ");
			scanf("%i", &n);
			
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				if(i<=j ){
					printf("*");
				}
				else{
					printf(" ");
				}

			}
			printf("\n");
	}
		
		
		
		
		return 0;
	}
