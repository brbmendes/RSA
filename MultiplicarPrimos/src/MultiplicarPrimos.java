import java.math.BigInteger;

public class MultiplicarPrimos {
	public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Execute o programa informando 2 números primos: p e q");
            System.out.println("\t5 7");
            System.exit(0);
        } else {
        	BigInteger p = new BigInteger(args[0]);
        	BigInteger q = new BigInteger(args[1]);
            BigInteger N = BigInteger.ZERO;
            N = MultiplicarNumerosPrimos(p, q);
            System.out.println(N);
        }

	}
	
	private static BigInteger MultiplicarNumerosPrimos(BigInteger p, BigInteger q) {
		return p.multiply(q);
	}
}
