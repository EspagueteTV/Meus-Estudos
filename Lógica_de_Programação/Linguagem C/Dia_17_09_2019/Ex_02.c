#include <stdio.h>

	int main(){
		
		int cont , soma_p=0 , soma_n=0, num;
		
		for(cont=1; cont<=50; cont++){
			printf("Digite um valor %i: ", cont);
				scanf("%i", &num);
			
				if(num<0){
					soma_n++;
				}
				else{
					soma_p= soma_p + num;
				}
				
			
		}
		printf("A soma dos numeros positivos eh: %i \n", soma_p);
		printf("A quantidade dos numeros negativos eh: %i \n", soma_n);
		
	system("pause");
	return 0;
	}
