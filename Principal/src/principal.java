import java.math.BigInteger;
import java.util.Scanner;

public class principal {

	public static BigInteger _p = null;
	public static BigInteger _q = null;
	public static BigInteger _N = null;
	public static BigInteger _phi = null;
	public static BigInteger _e = null;
	public static BigInteger _d = null;
	public static BigInteger _C = null;
	public static String _Morig = null;
	public static BigInteger _MorigConv = null;
	public static BigInteger _MdecConv = null;
	public static String _M = null;
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int operacao;
		
		
		while(true) {
			System.out.println("Informe a operacao desejada: ");
			System.out.println("1 - Gerar chaves");
			System.out.println("2 - Cifrar mensagem");
			System.out.println("3 - Decifrar mensagem");
			System.out.println("4 - Sair");
			
			operacao = s.nextInt();
			if(operacao == 4) {
				break;
			} else  if(operacao == 1) {
				GerarChaves.main(args);
			} else if(operacao == 2){
				s = new Scanner(System.in);
				System.out.println("Informe a mensagem a ser cifrada");
				_Morig =  s.nextLine();
				System.out.println("Informe o numero de Euler e");
				_e = new BigInteger(s.next());
				System.out.println("Informe o modulo N");
				_N = new BigInteger(s.next());
				_MorigConv = ConverterMensagemParaNumerico.ConverterDeString(_Morig);
				_C = CifrarMensagem.Cifrar(_MorigConv, _e, _N);
				ImprimirC();
			} else if(operacao == 3){
				s = new Scanner(System.in);
				System.out.println("Informe a mensagem cifrada");
				_C =  new BigInteger(s.next());
				System.out.println("Informe o inverso de Euler d");
				_d = new BigInteger(s.next());
				System.out.println("Informe o modulo N");
				_N = new BigInteger(s.next());
				_MdecConv = DecifrarMensagem.Decifrar(_C, _d, _N);
				ImprimirM();
			} else {
				System.out.println("Operacao invalida\n");
			}
		}
		System.exit(0);
	}
	
	private static void ImprimirC() {
		System.out.println("");
		System.out.println("Mensagem original (texto claro):");
		System.out.println("\t" + _Morig);
		System.out.println("Mensagem cifrada:");
		System.out.println("\t" + _C);
		System.out.println("");
	}
	
	private static void ImprimirM() {
		System.out.println("");
		System.out.println("Mensagem cifrada:");
		System.out.println("\t" + _C);
		System.out.println("Mensagem decifrada (texto claro):");
		String _M = new String(_MdecConv.toByteArray());
		System.out.println("\t" + _M);
		System.out.println("");
	}
}
