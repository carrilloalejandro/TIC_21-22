#include<stdio.h>
int main(){
	char palabra[5];
	int cont;
	printf("Escribe una palabra: ");
	scanf("%s",palabra);
	printf("\nHas escrito la palabra %s",palabra);
	printf("\nVoy a deletrearla: ");
	for (cont=0;cont<5;cont++){
		printf("\n%c",palabra[cont]);
	}
	palabra[1]='U';
	printf("\nPalabra cambiada: %s",palabra);
	printf("\nQuien es quien: ");
	printf("\npalabra[1]= %x",&palabra[2]);
	
	return(0);
}
