import java.math.BigInteger;


public class DecifrarMensagem {

	public static void main(String[] args) {
		if(args.length < 3){
			System.out.println("Execute o programa informando 3 números: a mensagem cifrada mc, o inverso de euler d, e o modulo N:");
			System.out.println("Ex: 2 23 55");
		} else {
			BigInteger mc = ConverterMensagemParaNumerico.ConverterDeBigInteger(args[0]);
			BigInteger d = new BigInteger(args[1]);
			BigInteger N = new BigInteger(args[2]);
			BigInteger mensagemConvertida_M = decifrarMensagem(mc,d,N);
			String mensagemDecifrada = new String(mensagemConvertida_M.toByteArray());
			System.out.println(mensagemDecifrada);
		}
	}
	
	public static BigInteger Decifrar(BigInteger mc, BigInteger d, BigInteger N) {
		return decifrarMensagem(mc,d,N);
	}
	
	private static BigInteger decifrarMensagem(BigInteger mc, BigInteger d, BigInteger N){
		BigInteger mensagemConvertida = mc.modPow(d,N);
		return mensagemConvertida;
	}
}
