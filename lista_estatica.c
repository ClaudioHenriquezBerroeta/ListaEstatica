#include <stdlib.h>
#include <stdio.h>

#define long_max 200 //cantidad máxima de elementos en la lista

struct lista { 
	int arreglo[long_max]; //arreglo de elementos dentro de la lista
	int ultimo; //indicador de la primera posición vacía
};

struct lista *constructor(){ //función para crear una lista
	struct lista * L=malloc(sizeof(struct lista)); 
	L->ultimo=0; 
	return L; 
}

void destructor(struct lista * L){ //función para destruir una lista
	free(L);
}

struct lista *insertar(int x, int p, struct lista *L){
	int i;
	if(L->ultimo==long_max){
		printf("Lista llena\n");
	}else{
		if((p<0)||(p>L->ultimo)){
			printf("posición inválida\n");
		}else{
			for(i=0;i<L->ultimo-p;i++){
				L->arreglo[L->ultimo-i]=L->arreglo[L->ultimo-i-1];
			}
			L->arreglo[p]=x;
			L->ultimo++;
		}
	}
	return L;
}
void mostrar(struct lista *L){
	int i;
	for(i=0;i<L->ultimo;i++)
		printf("%i - ", L->arreglo[i]);
	printf("\n");
}

int main(int argc, char const *argv[])
{
	/* code */
	struct lista *Lista1; //declaramos la lista
	Lista1 = constructor(); //creamos la lista, asignar memoria (instanciar)
	Lista1 = insertar(100,0,Lista1);
	Lista1 = insertar(200,0,Lista1);
	mostrar(Lista1);
	//printf("%i\n",Lista1->arreglo[10]);
	//printf("%i\n",Lista1->arreglo[20]);	
	destructor(Lista1); // liberamos memoria

	return 0;
}
