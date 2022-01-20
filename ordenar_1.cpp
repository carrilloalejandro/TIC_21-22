#include<stdio.h>
//Ordenar una lista de numeros por metodo burbuja
int main(){
	int numeros[5];
	int cont;
	int aux;
	int repetir;
	//Leo la lista
	for(cont=0;cont<5;cont++){
		printf("\nDame un numero: ");
		scanf("%d",&numeros[cont]);	
	}
	//Muestro por pantalla
	for(cont=0;cont<5;cont++){
		printf("%d ",numeros[cont]);
		
	}
	//LA ordeno de menor a mayor
	for(repetir=1;repetir<5;repetir++){
		for(cont=0;cont<=3;cont++){
		if(numeros[cont]>numeros[cont+1]){
			aux=numeros[cont];
			numeros[cont]=numeros[cont+1];
			numeros[cont+1]=aux;
			}
		}
	}
	printf("\nLista ordenada: ");
	for(cont=0;cont<5;cont++){
		printf(" %d ",numeros[cont]);
	}
	return(0);
}
