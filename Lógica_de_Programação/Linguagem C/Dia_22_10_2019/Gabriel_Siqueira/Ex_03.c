#include <stdio.h>
#include <string.h>

	int main(){
		
		char alfabeto[27] = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		int i;
		
		for(i=0; i<27; i++){
			printf("%c \n", alfabeto[i]);
		}
		
		system("pause");
		return 0;
	}
