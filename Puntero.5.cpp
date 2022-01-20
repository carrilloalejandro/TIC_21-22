#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	//RESERVA DINAMICA DE MEMORIA
	char aux[10];//reservo una memoria temporalpara guardar la palabra
	int longitud;
	char*mispalabras[5];
	int cont;
	for(cont=0;cont<5;cont++){
	
		
		//1. Pido la palabra
		printf("\nDime la palabra %d: ",cont);
		//2.Variable auxiliar
		scanf("%s",aux);
		//3.Cuento el numero de letras
		longitud=strlen(aux);
		//4.Busco un hueco en la memoria de ese tamaño y me apunto su direccion
		mispalabras[cont]=(char *)malloc(longitud*sizeof(char));
		//5.Copio el nombre dewsde auxiliar hasta el hueco encontrado
		strcpy(mispalabras[cont],aux);
		}
		printf("\nLas cinco palabras son: ");
	for(cont=0;cont<5;cont++){
		printf("\n %s",*(mispalabras+cont));
	}
	return(0);
}
	
