
public class Fibonacci {
	public void ImprimirAte(int valorMaximoSerie){
		int valor1 = 0;
		System.out.println(valor1 + ",");
		int valor2 = 1;
		System.out.println(valor2 + ",");
		int resultado = 0;
		while (resultado < valorMaximoSerie){
			resultado = valor1 + valor2;
			valor1 = valor2;
			valor2 = resultado;
			System.out.println(resultado + ",");
		}
			
	}

}
