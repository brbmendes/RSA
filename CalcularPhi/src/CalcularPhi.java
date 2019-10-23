import java.math.BigInteger;

public class CalcularPhi {
	public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Execute o programa informando 2 números primos, p e q");
            System.out.println("Ex: 5 7");
            System.exit(0);
        } else {
        	BigInteger p = new BigInteger(args[0]);
        	BigInteger q = new BigInteger(args[1]);
            BigInteger phi = BigInteger.ZERO;
            phi = CalcularNumPhi(p, q);
            System.out.println(phi);
        }
	}
	
	public static BigInteger Calcular(BigInteger p, BigInteger q) {
		return CalcularNumPhi(p,q);
	}
	
	private static BigInteger CalcularNumPhi(BigInteger p, BigInteger q) {
		return (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE));
	}
}
