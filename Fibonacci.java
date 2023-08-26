//0 1 1 2 3 5 7

//recursivo
public class Fibonacci {

	public static void main (String [] args) {
		
		int n = 3;
		
		System.out.println("Série de Fibonacci com " + n + " termos:");
		for (int i = 0 ; i < n ; i++) {
				System.out.printf ("[ %d ] ", fibonacci(i) );
			}
	}
	
	public static int fibonacci(int n) {
		
		if (n <= 2) {
			return n;
		} else {
			return (fibonacci(n-1) + fibonacci(n-2));
			
		}
	
	}


}