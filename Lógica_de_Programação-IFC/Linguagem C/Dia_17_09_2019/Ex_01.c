#include <stdio.h>

	int main(){
		
		int cont, produt=1;
		
		for(cont=1; cont<=15; cont= cont+2){
			produt= produt * cont;
			printf("%i \n", produt);
		}
		
		
		system("pause");
		return 0;
	}
