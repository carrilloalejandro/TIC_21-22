#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	//RESERVA DINAMICA DE MEMORIA
	char aux[100];//reservo una memoria temporalpara guardar la palabra
	int longitud;
	printf("\nDime una palabra: ");
	scanf("%s",aux); 
	longitud=strlen(aux);
	char*palabra;//palabra es un puntero (una variable que contiene
	//direccion de memoria de algo que es una letra
	palabra=(char*)malloc(longitud*sizeof(char));
	strcpy(palabra,aux);
	printf("\nRESULTADO: ");
	printf("%s",palabra);
	return(0);
}
