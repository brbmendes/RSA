import java.math.BigInteger;
import java.util.Random;


public class GerarEuler {

	public static void main(String[] args) {
		if (args.length != 1)
        {
            System.out.println("Execute o programa informando phi:");
            System.out.println("Ex: 40");
            System.exit(0);
        } else {
        	BigInteger e = GerarNumEuler(args[0]);
        	BigInteger zero = new BigInteger("0");
    		if(e.equals(zero)) {
    			System.out.println("Após 10.000 tentativas, não foi possível encontrar e.");
    		} else {
    			System.out.println(e);
    		}
        }
	}
	
	public static BigInteger Gerar(BigInteger phi) {
		return GerarNumEuler(phi);
	}
	
	private static BigInteger GerarNumEuler(String strPhi) {
		BigInteger phi = new BigInteger(strPhi);
		return GerarNumEuler(phi);		
	}
	
	private static BigInteger GerarNumEuler(BigInteger phi) {
		Random rnd = new Random();
		BigInteger e = BigInteger.ZERO; 	
		for(int i = 0 ; i < 10000; i++) {
			long euler = rnd.nextLong();
			e = BigInteger.valueOf(euler);
			BigInteger relativamentePrimo = BigInteger.ZERO;
            relativamentePrimo = MDC(e, phi);
            if(relativamentePrimo.equals(BigInteger.ONE)) {
            	return e;
            }
		}
		return BigInteger.ZERO;
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
