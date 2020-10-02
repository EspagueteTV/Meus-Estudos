#include <stdio.h>

	int main(){
		
		int A[3][3], B[3][3], i, j;
	for( i = 0; i < 3; i++ ) {
		for( j = 0; j < 3; j++ ) {
			if( (i+j) % 2 == 0) {
A[i][j] = i + j;
B[i][j] = 5;
}
else {
A[i][j] = 3;
B[i][j] = i - j;
}
}
}
	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
				printf("%d \t", A[i][j]);

		}
				printf("\n");

	}
			printf("\n");
		printf("\n");

	for(i=0; i<3; i++){
		for(j=0; j<3; j++){
				printf("%d \t", B[i][j]);

		}
		printf("\n");
	}
		
		
		
		system("pause");
		return 0;
	}
