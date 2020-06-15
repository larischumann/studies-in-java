package bytebank;

public class TesteReferencia {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 300.00;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
		
		segundaConta.saldo += 100.00;
		System.out.println("Saldo da segunda conta (ap�s o dep�sito): " + segundaConta.saldo);
		
		System.out.println("Saldo da primeira conta (ap�s o dep�sito): " + primeiraConta.saldo);
		
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
	}

}
