import java.math.BigInteger;

public class CalcularDInversoEuler {

	public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Execute o programa informando 2 número: euler e phi:");
            System.out.println("\t5 7");
            System.exit(0);
        } else {
        	BigInteger e = new BigInteger(args[0]);
        	BigInteger phi = new BigInteger(args[1]);
        	BigInteger d = calcularD(e, phi);
            System.out.println(d);
        }
	}
	
	private static BigInteger calcularD(BigInteger e, BigInteger phi) {
		return e.modInverse(phi);
	}

}
