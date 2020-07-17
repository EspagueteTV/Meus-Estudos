#include <stdio.h>
#include <string.h>


	int main(){
		
		char str1[60], str2[60];
		int i, cont = 0;
		
		printf("Digite o nome 1: ");
			gets(str1);
		printf("Digite o nome 2: ");
			gets(str2);
		
		
		
			if(strcmp(str1, str2) > 0){
				printf("%s \n", str2);
				printf("%s \n", str1);
			}
			
			if(strcmp(str1, str2) < 0){
				printf("%s \n", str1);
				printf("%s \n", str2);
			}
			
	
			
		
		
		
		return 0;
	}
