
public class Fibonacci {

	public int calculaFibonacci(int posicaoSerie) {
		if ((posicaoSerie == 1) || (posicaoSerie == 2))
			return 1;
		return calculaFibonacci(posicaoSerie - 1) + calculaFibonacci(posicaoSerie - 2);
	}
}
