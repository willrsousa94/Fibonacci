import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		int x;
		
		Fibonacci f = new Fibonacci();
		
		System.out.println("Digite o número máximo que deseja para a sequência de Fibonacci");
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		
		f.fib(0, 1, x);
		

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
