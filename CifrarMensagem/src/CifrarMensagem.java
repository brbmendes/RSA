import java.math.BigInteger;


public class CifrarMensagem {

	public static void main(String[] args) {
		if(args.length < 3){
			System.out.println("Execute o programa informando 3 números: a mensagem convertida M, euler e, e o modulo N:");
			System.out.println("\t687236487263487324 7 55");
		} else {
			BigInteger M = new BigInteger(args[0]);
			int e = Integer.parseInt(args[1]);
			BigInteger N = new BigInteger(args[2]);
			BigInteger mensagemCifrada_C = cifrarMensagem(M,e,N);
			System.out.println(mensagemCifrada_C);
		}
	}
	
	private static BigInteger cifrarMensagem(BigInteger M, int e, BigInteger N){
		BigInteger mElevedoE = M.pow(e);
		BigInteger divisao_resto[] = mElevedoE.divideAndRemainder(N);
		BigInteger mensagemCifrada = divisao_resto[1];
		return mensagemCifrada;
	}
}
