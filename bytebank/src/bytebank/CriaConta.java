package bytebank;

public class CriaConta {
	public static void main(String[] args) {
        Conta primeiraConta = new Conta();
        primeiraConta.saldo = 200;
        System.out.println (primeiraConta.saldo);
        primeiraConta.saldo += 100;
        System.out.println(primeiraConta.saldo);
        
        Conta segundaConta = new Conta();
        segundaConta.saldo = 50;
        
        System.out.println("A primeira conta tem R$" + primeiraConta.saldo);
        System.out.println("A segunda conta tem R$" + segundaConta.saldo);
        System.out.println(primeiraConta.agencia);
        System.out.println(segundaConta.agencia);
        
        if (primeiraConta == segundaConta) {
        	System.out.println("Mesmas contas!");
        } else {
        	System.out.println("Contas diferentes!");
        }
        
        System.out.println(primeiraConta);
        System.out.println(segundaConta);
    }
	
}
