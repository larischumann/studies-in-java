
public class TesteFuncionario {
	public static void main(String[] args) {
		
		Gerente clau = new Gerente ();
		clau.setNome ("Claudete Ramos");
		clau.setCpf("222.222.222-9");
		clau.setSalario(3500.0);
		
		System.out.println(clau.getNome());
		System.out.println(clau.getBonificacao());
		
		
	}

}
