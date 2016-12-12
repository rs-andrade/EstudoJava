
public class Principal {
	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci();
		for (int i = 1; i <= 10; i++) {
		  int resultado = fibonacci.calculaFibonacci(i);
		  System.out.println(resultado);
		}
	}

}