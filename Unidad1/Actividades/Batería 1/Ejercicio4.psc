Algoritmo Bateria2
	Escribir 'Escribe un n�mero A'
	Leer A
	Escribir 'Escribe un n�mero B'
	Leer B
	Escribir 'Escribe un n�mero C'
	Leer C
	Si A<>B Y A<>C Y B<>C Entonces
		Si A>B Y A>C Entonces
			Si B>C Entonces
				Escribir 'A(', A, ') es el mayor y C(', C, ') es el menor.'
			SiNo
				Escribir 'A(', A, ') es el mayor y B(', B, ') es el menor.'
			FinSi
		FinSi
		Si B>A Y B>C Entonces
			Si A>C Entonces
				Escribir 'B(', B, ') es el mayor y C(', C, ') es el menor.'
			SiNo
				Escribir 'B(', B, ') es el mayor y A(', A, ') es el menor.'
			FinSi
		FinSi
		Si C>A Y C>B Entonces
			Si B>A Entonces
				Escribir 'C(', C, ') es el mayor y A(', A, ') es el menor.'
			SiNo
				Escribir 'C(', C, ') es el mayor y B(', B, ') es el menor.'
			FinSi
		FinSi
	SiNo
		Escribir 'Hay 2 n�meros repetidos, el programa no funciona.'
	FinSi
FinAlgoritmo
