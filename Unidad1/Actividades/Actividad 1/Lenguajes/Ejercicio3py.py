if __name__ == '__main__':
	contador = 10
	suma = 0
	while contador>0:
		print("> Te quedan ",contador," números por escribir para poder sumarlos.")
		num = float(input())
		suma = suma+num
		contador = contador-1
	print("El resultado es: ",suma)

