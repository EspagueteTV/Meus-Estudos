#include <stdio.h>
#include <string.h>

int main(){
	
	char str1[60], str2[60];
	int a, b;
	
	printf("Digite uma cadeia: ");
		gets(str1);
	printf("Digite uma outra cadeia");
		gets(str2);
		
	a = strlen(str1);
	b = strlen(str2);
	
	if(a>b){
		printf("A cadeia (a) tem mais caracter");
	}
	else if(b>a){
		printf("A cadeia (b) tem mais caractere");
	}
	else if(a==b){
		printf("As cadeias possuem o mesmo numero de caractere");
	}
	else{
		printf("Codigo Invalido");
	}
	
	return 0;
}
