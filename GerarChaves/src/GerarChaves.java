import java.math.BigInteger;
import java.util.Scanner;



public class GerarChaves {

	public static void main(String[] args) {
		System.out.println("Gerar chaves");
		System.out.println("Informe o número de bits da chave:");
		
		Scanner entradaTexto = new Scanner(System.in);
		int bits = entradaTexto.nextInt();
		
		System.out.println("Numero primo p:\n");
		BigInteger p = GerarPrimo.Gerar(bits);
		
		System.out.println("\n");
		
		System.out.println("Numero primo q:\n");
		BigInteger q = GerarPrimo.Gerar(bits);
		
		System.out.println("Modulo N:\n");
		BigInteger N = MultiplicarPrimos.Multiplicar(p, q);
		
		System.out.println("Phi(N) phi:\n");
		BigInteger phi = CalcularPhi.Calcular(p, q);
		
		System.out.println("Euler e:\n");
		BigInteger e = GerarEuler.Gerar(phi);
		
	}

}
