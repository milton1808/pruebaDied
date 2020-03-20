package prueba03;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String args[]) {
		
		Double a , b;
		char selec;
		Calculadora cal = new Calculadora();
		Scanner input = new Scanner(System.in);
		int temperatura[] = new int[5];
		
		System.out.println("Tipee s para sumar, m para multiplicar y p para PI:");
		selec = input.next().charAt(0);
				
		switch(selec) {
			case 's':
				System.out.println("Ingrese numeros a sumar:");
				a=input.nextDouble();
				b=input.nextDouble();
				System.out.println("Respuesta: "+cal.suma(a, b));
				break;
			case 'm':
				System.out.println("Ingrese numeros a multiplicar:");
				a=input.nextDouble();
				b=input.nextDouble();
				System.out.println("Respuesta: "+cal.multiplicacion(a, b));
				break;
			case 'p':
				System.out.println("Pi es: "+cal.pi());
		}
		input.close();
		
		ArrayList<String> palabras = new ArrayList<>();
		palabras.add("HOLA");
		palabras.add("CHAU");
		palabras.size(); // size = 2
		palabras.get(0); // elemento-0 = “HOLA”
		palabras.remove(0); // remover elemento 0
		palabras.get(0); // el element 0 ahora es “CHAU”
		palabras.size(); // size =1
		palabras.add("CLASE"); // agregamos en indice 1 “CLASE
		for(String aux : palabras) {
			System.out.println(aux); // 0:CHAU – 1:CLASEp
			
		}
			
		
	}
}
