import java.math.BigInteger;
import java.util.Random;

public class GerarPrimo {

	public static void main(String[] args) {
        if (args.length != 1 || args[0] == null || args[0] == "")
        {
            System.out.println("Execute o programa informando o número de bits da chave:");
            System.out.println("Ex: 1024, 2048");
            System.exit(0);
        } else {
        	int _numBits = Integer.parseInt(args[0]);
            BigInteger primo = GerarNumPrimo(_numBits);
            if(primo.equals(BigInteger.valueOf(-1))){
            	System.out.println("Não foi possivel encontrar um numero primo apos 10000 tentativas.");
            	
            } else if(primo.equals(BigInteger.ZERO)){
            	System.out.println("Quantidade de bits deve ser maior que 1000.");
            } else {
            	System.out.println(primo);
            }
        }
	}
	
	public static BigInteger Gerar(int numBits){
		if(numBits < 1000){
			return BigInteger.ZERO;
		}
		return GerarNumPrimo(numBits);
	}
	
	private static BigInteger GerarNumPrimo(int numBits) {
		BigInteger resultado = BigInteger.ZERO;
		BigInteger base = new BigInteger("2");
		BigInteger primo = BigInteger.ZERO;
		int contador = 1;
		do {
			if(contador > 10000) break;
			primo = new BigInteger(numBits,0,new Random());
			resultado = base.modPow(primo.subtract(BigInteger.ONE),primo);
		} while(!resultado.equals(BigInteger.ONE));
		
		if(contador > 10000){
			return BigInteger.valueOf(-1);
		}
		return primo;
	}
}
