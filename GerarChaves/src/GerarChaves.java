import java.math.BigInteger;
import java.util.Scanner;



public class GerarChaves {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Gerar chaves");
		System.out.println("Informe o número de bits da chave:");
		
		Scanner entradaTexto = new Scanner(System.in);
		int bits = entradaTexto.nextInt();
		System.out.println("\n");
		System.out.println("Numero primo p:");
		BigInteger p = GerarPrimo.Gerar(bits);
		System.out.println("\t" + p);
		System.out.println("");
		System.out.println("Numero primo q:");
		BigInteger q = GerarPrimo.Gerar(bits);
		System.out.println("\t" + q);
		System.out.println("");
		System.out.println("Modulo N:");
		BigInteger N = MultiplicarPrimos.Multiplicar(p, q);
		System.out.println("\t" + N);
		System.out.println("");
		System.out.println("Phi(N) phi:");
		BigInteger phi = CalcularPhi.Calcular(p, q);
		System.out.println("\t" + phi);
		System.out.println("");
		System.out.println("Euler e:");
		BigInteger e = GerarEuler.Gerar(phi);
		
		if(e.equals(BigInteger.ZERO)) {
			boolean encontrouE = false;
			for(int i = 0 ; i < 3 ; i++) {
				e = GerarEuler.Gerar(phi);
				if(!e.equals(BigInteger.ZERO)) {
					encontrouE = true;
					break;
				}
			}
			if(!encontrouE) {
				System.out.println("Não foi possivel encontrar e após 30.000 tentativas");
				System.exit(-1);
			}
		}
		System.out.println("\t" + e);
		
		System.out.println("Inverso de Euler d:");
		BigInteger d = GerarEuler.Gerar(phi);
		System.out.println("\t" + d);
		
		System.out.println("\n");
		
		System.out.println("Chave Publica: \nPK\n{\n\te: "+ e +"\n\tN: "+ N +"\n}");
		System.out.println("Chave Privada: \nSK\n{\n\td: "+ d +",\n\tp: "+ p +",\n\tq: "+ q +"\n}");
	}

}
