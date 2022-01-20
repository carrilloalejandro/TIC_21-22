#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main(){
	//RESERVA DINAMICA DE MEMORIA
	char aux[10];//reservo una memoria temporalpara guardar la palabra
	int longitud;
	char*lista[3];
	int cont;
	for(cont=0;cont<3;cont++){
	
		
		//1. Pido el nombre
		printf("\nDime el nombre de un rey : ",cont);
		//2.Variable auxiliar
		scanf("%s",aux);
		//3.Cuento el numero de letras
		longitud=strlen(aux);
		//4.Busco un hueco en la memoria de ese tamaño y me apunto su direccion
		lista[cont]=(char *)malloc(longitud*sizeof(char));
		//5.Copio el nombre dewsde auxiliar hasta el hueco encontrado
		strcpy(lista[cont],aux);}
		printf("\nLos tres reyes magos son: ");
	for(cont=0;cont<3;cont++){
		printf("\n %s",lista[cont]);
	}
	return(0);
}
	
