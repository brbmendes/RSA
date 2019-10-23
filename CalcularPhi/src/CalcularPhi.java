import java.math.BigInteger;

public class CalcularPhi {
	public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Execute o programa informando 2 números primos: p e q");
            System.out.println("\t5 7");
            System.exit(0);
        } else {
        	BigInteger p = new BigInteger(args[0]);
        	BigInteger q = new BigInteger(args[1]);
            BigInteger phi = BigInteger.ZERO;
            phi = GerarNumPhi(p, q);
            System.out.println(phi);
        }
	}
	
	private static BigInteger GerarNumPhi(BigInteger p, BigInteger q) {
		return (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
	}
}
