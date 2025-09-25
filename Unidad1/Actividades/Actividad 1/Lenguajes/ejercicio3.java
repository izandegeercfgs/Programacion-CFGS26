import java.io.*;

public class ejercicio3 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double contador = 5;
		double suma = 0;
		while (contador>0) {
			System.out.println("> Te quedan "+contador+" números por escribir para poder sumarlos.");
			double num = Double.parseDouble(bufEntrada.readLine());
			suma = suma+num;
			contador = contador-1;
		}
		System.out.println("El resultado es: "+suma);
	}


}

