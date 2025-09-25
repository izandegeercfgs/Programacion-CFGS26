#include<stdio.h>

int main() {
	float contador;
	float num;
	float suma;
	contador = 10;
	suma = 0;
	while (contador>0) {
		printf("> Te quedan %f números por escribir para poder sumarlos.\n", contador);
		scanf("%f", &num);
		suma = suma+num;
		contador = contador-1;
	}
	printf("El resultado es: %f\n", suma);
	return 0;
}

