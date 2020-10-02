#include <stdio.h> 
#include <string.h>

int main (){
  char letra [60];
  int tamanho;
  
  printf("Digite uma palavra: ");
  	gets(letra);
  	
  	tamanho=strylen(letra);
  	
  	printf("O ultimo caractre eh: %i",tamanho);
  	
  return 0;
}

	
	
	
	

