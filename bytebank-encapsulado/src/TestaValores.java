
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta (123,22222);
	
		System.out.println("Ag�ncia: " + conta.getAgencia());
		System.out.println("N�mero: " + conta.getNumero());
		
		Conta conta2 = new Conta (123,22224);
		
		System.out.println(Conta.getTotal());
		
	}

}
