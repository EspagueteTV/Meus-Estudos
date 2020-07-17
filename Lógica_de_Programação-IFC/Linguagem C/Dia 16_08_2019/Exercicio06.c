#include <stdio.h>

	int main(){
		
		int cont=1, total_compra, quant_parc,  valor_parcela=0, valor_mes;
		
		printf("Digite o valor total de sua compra: ");
			scanf("%i", &total_compra);
		printf("Digite a quantidade de parcelas realizada para a sua compra: ");
			scanf("%i", &quant_parc);
			
			while(cont<=quant_parc){
				valor_parcela= (total_compra) / (quant_parc);
				
				valor_mes= total_compra- (valor_parcela*cont);
				
				printf("O valor restante no %i mes eh: %i \n", cont, valor_mes);
					
				cont++;
			}
	}
