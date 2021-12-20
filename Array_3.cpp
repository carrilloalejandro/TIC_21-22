#include<stdio.h>
int main(){
int x[10];
int cont;
float suma=0;
float media;
for(cont=1;cont<=10;cont=cont+1){
printf("Dame una cifra: ");
scanf("%d",&x[cont]);
}
for(cont=0;cont<=10;cont++){
	printf("\nx[%d]=%f",cont,x[cont]);
	suma+=x[cont];
}
media=suma/10;
printf("\nLA MEDIA VALE= %.2f",media);
return(0);
}

