import Exception.TamanhoMaximoSerieFibonacciOverflow;

public class Fibonacci {
	private int[] seriesJaCalculadas;
	
	public Fibonacci(int tamanhoMaximoSerie) {
		if (tamanhoMaximoSerie > 100)
			throw new TamanhoMaximoSerieFibonacciOverflow("Tamanho máximo da série é 100");
		
		seriesJaCalculadas = new int[tamanhoMaximoSerie];
	}

	public int calculaFibonacci(int posicaoSerie) {
		if ((posicaoSerie == 1) || (posicaoSerie == 2))
			return 1;
		
		if (seriesJaCalculadas[posicaoSerie] > 0)
			return seriesJaCalculadas[posicaoSerie];
		
		seriesJaCalculadas[posicaoSerie] = calculaFibonacci(posicaoSerie - 1) + calculaFibonacci(posicaoSerie - 2);
		
		return seriesJaCalculadas[posicaoSerie];
	}
}
