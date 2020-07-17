#include <stdio.h>
#include <string.h>

	int main(){
		
		
		char senha[7]; 
		char senha_true[7] = "tin2019";
		
		printf("Digite a senha de 7 digitos: ");
			gets(senha);
			
		if(strcmp(senha, senha_true) == 0) {
			printf("Senha Valida !!");
		}
		else{
			printf("Senha Invalida !!");
		}
		
		
		return 0;
	}
