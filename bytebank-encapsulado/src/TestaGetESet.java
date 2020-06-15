
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta (123, 22221);
	
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente ();
		// Conta.titular = paulo;
		paulo.setNome("Paulo Silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular()); // impress�o: Cliente@15db9742
		System.out.println(conta.getTitular().getNome()); // impress�o: Paulo Silveira
		
		conta.getTitular().setProfissao("Programador");
		// agora em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("Programador");
		
		System.out.println(titularDaConta); // resultado: Cliente@15db9742
		System.out.println(paulo); // resultado: Cliente@15db9742
		System.out.println(conta.getTitular()); // resultado: Cliente@15db9742
		// Resultados iguais, pois essas vari�veis e metodos s�o o mesmo cliente.

	}

}