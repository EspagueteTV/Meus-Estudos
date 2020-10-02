#include <stdio.h>

	int main(){
		
		int Num1, Num2, Resto, opcao=1;
		float Quoc;
		
		while(opcao != -1){
		
			printf("Digite um numero inteiro e positivo: ");
				scanf("%i", &Num1);
			printf("Digite um numero inteiro e positivo: ");
				scanf("%i", &Num2);
					Quoc= Num1 / Num2;
					Resto= Num1%Num2;
					
			printf("O quociente de %i por %i eh: %.2f \n", Num1, Num2, Quoc);
			printf("O resto de %i por %i eh: %i \n", Num1, Num2, Resto);
			printf("Para finalizar digite '-1', para continuar aperte qualque numero: ");
				scanf("%i", &opcao);
				
		}	
		
		return 0;
	}
