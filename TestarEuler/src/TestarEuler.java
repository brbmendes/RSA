import java.math.BigInteger;

public class TestarEuler {

	public static void main(String[] args) {
        if (args.length < 2)
        {
            System.out.println("Execute o programa informando 2 números: euler e phi:");
            System.out.println("\t5 7");
            System.exit(0);
        } else {
        	BigInteger e = new BigInteger(args[0]); // esse e é gerado aleatoriamente
        	BigInteger phi = new BigInteger(args[1]);
            BigInteger relativamentePrimo = BigInteger.ZERO;
            relativamentePrimo = MDC(e, phi);
            System.out.println(relativamentePrimo);
        }
	}
	
	private static BigInteger MDC(BigInteger e, BigInteger phi) {
		BigInteger[] array =  algorEstendEuclides(e,phi);
		return array[0];
		
	}
	
	private static BigInteger[] algorEstendEuclides(BigInteger e, BigInteger phi) {
		BigInteger[] auxArray = new BigInteger[3];
		BigInteger[] retArray = new BigInteger[3];

		if (phi.equals(BigInteger.ZERO)){
			auxArray[0] = e;
			auxArray[1] = BigInteger.ONE;
			auxArray[2] = BigInteger.ZERO;
			return auxArray;
		}
		
		BigInteger[] divisao_resto = new BigInteger[2];
		divisao_resto = e.divideAndRemainder(phi);
		
		auxArray = algorEstendEuclides(phi, divisao_resto[1]);
		
		retArray[0] = auxArray[0];
		retArray[1] = auxArray[2];
		retArray[2] = auxArray[1].subtract((divisao_resto[0]).multiply(auxArray[2]));
		return retArray;
	}
}
