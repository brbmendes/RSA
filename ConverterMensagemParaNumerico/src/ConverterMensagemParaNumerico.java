import java.math.BigInteger;


public class ConverterMensagemParaNumerico {

	public static void main(String[] args) {
		if (args.length < 1)
        {
            System.out.println("Execute o programa informando a mensagem sem caracteres especiais:");
            System.out.println("\nDisciplina de seguranca de sistemas");
            System.exit(0);
        } else {
        	BigInteger mensagemConvertida = converterMensagem(args[0]);
        	System.out.println("Mensagem original: \t" + args[0]);
        	System.out.println("Mensagem convertida: \t" + mensagemConvertida);
        }

	}
	
	private static BigInteger converterMensagem(String mensagem){
		BigInteger mensagemConvertida = new BigInteger(mensagem.getBytes());
		return mensagemConvertida;
	}
}
