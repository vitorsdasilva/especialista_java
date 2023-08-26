public class FibonacciCleanCodeExample {
    public static void main(String[] args) {
        int n = 10; // Número de termos da série de Fibonacci a serem calculados
        
        System.out.println("Série de Fibonacci com " + n + " termos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }


    public static int fibonacci(int n) {
		//retorna os dois primeiros termos da serie
        if (n <= 1) {
            return n;
        }
        
		//dois primeiros termos da serie
        int prev = 0;
        int current = 1;
        
        for (int i = 2; i <= n; i++) {
            int next = prev + current;
            prev = current;
            current = next;
        }
        
        return current;
    }
}