import java.math.BigInteger;


public class DecifrarMensagem {

	public static void main(String[] args) {
		if(args.length < 3){
			System.out.println("Execute o programa informando 3 números: a mensagem cifrada mc, o inverso de euler d, e o modulo N:");
			System.out.println("\2 23 8");
		} else {
			BigInteger mc = new BigInteger(args[0]);
			int d = Integer.parseInt(args[1]);
			BigInteger N = new BigInteger(args[2]);
			BigInteger mensagemConvertida_M = decifrarMensagem(mc,d,N);
			System.out.println(mensagemConvertida_M);
		}
	}
	
	private static BigInteger decifrarMensagem(BigInteger mc, int d, BigInteger N){
		BigInteger mcElevedoD = mc.pow(d);
		BigInteger divisao_resto[] = mcElevedoD.divideAndRemainder(N);
		BigInteger mensagemDecifrada = divisao_resto[1];
		return mensagemDecifrada;
	}
}
