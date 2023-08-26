
public class FibonacciSimples {
	public static void main (String[] args) {
		int n = 10;
		
		System.out.printf ("Série Fibonacci com %d elementos: %n", n);
		
		for (int i=0 ; i < n ; i++) {
				System.out.printf("[ %d ] ",fibonacci(i));		
		}
	}
	
	
	public static int fibonacci (int n) {
		//retornando os dois primeiros termos da série
		if (n <= 1) {
			return n;
		}
				
		int ant = 0;
		int atual = 1;
		
		for (int i=2; i<=n; i++) {
			int prox = ant + atual;
			ant = atual;
			atual = prox;
		}
		
		return atual;
	}
}