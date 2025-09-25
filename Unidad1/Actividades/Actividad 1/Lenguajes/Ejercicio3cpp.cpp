#include<iostream>
using namespace std;

int main() {
	float contador;
	float num;
	float suma;
	contador = 10;
	suma = 0;
	while (contador>0) {
		cout << "> Te quedan " << contador << " números por escribir para poder sumarlos." << endl;
		cin >> num;
		suma = suma+num;
		contador = contador-1;
	}
	cout << "El resultado es: " << suma << endl;
	return 0;
}

