
public class Fibonacci {

	public static void main(String[] args) {
		
		Fibonacci f = new Fibonacci();
		
		f.fib(0, 1, 1000);
	}
	
	public int fib(int anterior, int atual, int max) {
		
		int novoAtual = anterior + atual;
		
		System.out.println(atual);
			
		if(novoAtual >= max) {
			return atual;
		} else {
			return fib(atual, novoAtual, max);
		}
	}
	
}
