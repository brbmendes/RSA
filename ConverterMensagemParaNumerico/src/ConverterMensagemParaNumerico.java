import java.math.BigInteger;


public class ConverterMensagemParaNumerico {

	public static void main(String[] args) {
		if (args.length < 1)
        {
            System.out.println("Execute o programa informando a mensagem sem caracteres especiais:");
            System.out.println("\nDisciplina de seguranca de sistemas");
            System.exit(0);
        } else {
        	BigInteger mensagemConvertida = ConverterDeString(args[0]);
        	System.out.println("Mensagem original: \t" + args[0]);
        	System.out.println("Mensagem convertida: \t" + mensagemConvertida);
        }

	}
	
	public static BigInteger ConverterDeString(String mensagem){
		BigInteger mensagemConvertida = new BigInteger(mensagem.getBytes());
		return mensagemConvertida;
	}
	
	public static BigInteger ConverterDeBigInteger(String bigIntegerComoString){
		BigInteger mensagem = new BigInteger(bigIntegerComoString);
		BigInteger mensagemConvertida = new BigInteger(mensagem.toByteArray());
		return mensagemConvertida;
	}
}
