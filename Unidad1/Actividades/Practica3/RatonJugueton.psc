Algoritmo RatonJugueton
	Escribir 'El rat�n juguet�n'
	Escribir 'Leyendo altura (cm)...'
	Leer altura
	Si altura<140 Entonces
		Diferencia <- 140-altura
		Escribir 'LO SIENTO, NO PUEDES MONTAR EN LA ATRACCI�N. Te faltan ', Diferencia, 'cm de altura.'
	SiNo
		Si altura<0 O altura>230 Entonces
			Escribir 'ERROR DE LECTURA. Baja de la b�scula y vuelve a subir...'
		FinSi
	FinSi
	Escribir 'Leyendo peso (kg)...'
	Leer peso
	PesoMinimo <- ((altura*2)/8)
	PesoMaximo <- 120
	Escribir 'Pesas ', peso, 'kg. Peso m�nimo calculado: ', PesoMinimo, 'kg.'
	Si peso<PesoMinimo Entonces
		DiferenciaPeso <- PesoMinimo-peso
		Escribir 'LO SIENTO. Te faltan ', DiferenciaPeso, ' kg para poder montar.'
	SiNo
		Si peso>PesoMaximo Entonces
			Escribir 'LO SIENTO. Excedes el peso m�ximo permitido de ', PesoMaximo, ' kg.'
		SiNo
			Escribir '��Sube a la atracci�n!!'
		FinSi
	FinSi
FinAlgoritmo
