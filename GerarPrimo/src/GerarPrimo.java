import java.math.BigInteger;
import java.util.Random;

public class GerarPrimo {

	public static void main(String[] args) {

        if (args.length != 1)
        {
            System.out.println("Execute o programa informando o número de bits conforme exemplos:");
            System.out.println("\t1024");
            System.exit(0);
        } else {
        	int _numBits = Integer.parseInt(args[0]);
            BigInteger primo = GerarNumPrimo(_numBits);
            System.out.println(primo);
        }
	}
	
	private static BigInteger GerarNumPrimo(int numBits) {
		BigInteger resultado = BigInteger.ZERO;
		BigInteger base = new BigInteger("2");
		BigInteger primo = BigInteger.ZERO;
		
		do {
			primo = new BigInteger(numBits,0,new Random());
			resultado = base.modPow(primo.subtract(BigInteger.ONE),primo);
		} while(!resultado.equals(BigInteger.ONE));
		
		return primo;
	}
}
