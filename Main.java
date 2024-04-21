import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int distancia;
		double combustivelGasto, consumoMedio;

		System.out.print("Se a distância percorrida foi de: ");
		distancia = sc.nextInt();
		System.out.print("E o combustível gasto foi de: ");
		combustivelGasto = sc.nextDouble();

		consumoMedio = (distancia / combustivelGasto);

		System.out.printf("Então o consumo médio será de %.3f", consumoMedio);

		sc.close();

	}

}
