#include <stdio.h>

	int main(){
		
		int num, num1, cont;
		
		printf("Digite um numero: ");
			scanf("%i", &num);
			num1=num;
			
			if(num%2 != 0){
				num1= num1+1;
			}
			for(cont=0; cont<=num; cont++){
				printf("%i \n", num1);
				num1= num1+2;
			}
			
		
	
		
		
		
		
		system("pause");
		return 0;
	}
