import java.math.BigInteger;
import java.util.Random;


public class GerarEuler {

	public static void main(String[] args) {
		
	}
	
	public static BigInteger GerarNumEuler() {
		String euler = new Random().toString();
		return new BigInteger(euler);
	}
}
