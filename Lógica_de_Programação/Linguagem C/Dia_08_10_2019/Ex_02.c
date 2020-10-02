#include <stdio.h>
#include <locale.h>

	int main(){
		
		setlocale(LC_ALL, "portuguese");
		
//		Criar um vetor de 3 numeros
		int a[3], v[3];
		int cont, v1=0, v2=0, v3=0;

		for(cont=0; cont<3; cont++){
			printf("Digite um valor para a posição %i: ", cont);
				scanf("%i", &a[cont]);
		}

//		Ordenar os valores da variavel
			
//		Identificar v[0]

			if(a[0] < a[1] && a[0] < a[2]){
				v[0] = a[0];
					v1++;
		}
			if(a[1] < a[0] && a[1] <a[2]){
				v[0] = a[1];
					v1++;
		}
			if(a[2] < a[0] && a[2] < a[1]){
				v[0] = a[2];
					v1++;
			}
				
//		Fim identificação v[0] 


//		Identificar v[1] e v[2]
	
//			Se v[0] == a[0]
				if( v[0] == a[0]){
					if(a[1] < a[2]){
						v[1] = a[1];
						v[2] = a[2];
					}
					if(a[2] < a[1]){
						v[1] = a[2];
						v[2] = a[1];
					}
				}
			
//			Se v[0] == a[1]
				if( v[0] == a[1]){
					if(a[0] < a[2]){
						v[1] = a[0];
						v[2] = a[2];
					}
					if(a[2] < a[0]){
						v[1] = a[2];
						v[2] = a[0];
					}
				}
				
//			Se v[0] == a[2]
				if( v[0] == a[2]){
					if(a[0] < a[1]){
						v[1] = a[0];
						v[2] = a[1];
					}
					if(a[1] < a[0]){
						v[1] = a[1];
						v[2] = a[0];
					}
				}
			
// Fim identificação v[1] e v[2]
			
// Apresentação dos resultados
		printf("v[0] = %i \nv[1] = %i  \nv[2] = %i \n", v[0], v[1], v[2]);

		system("pause");
		return 0;
	}
