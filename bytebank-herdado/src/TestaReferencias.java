
public class TestaReferencias {

	public static void main(String[] args) {
		Gerente g2 = new Gerente ();
		g2.setNome("Mar�lia Pe�anha");
		g2.setSalario(5000.00);
		 System.out.println(g2.getNome());
		 System.out.println(g2.getBonificacao());
		//g2.autentica(666);
		 
		 Designer f2 = new Designer ();
		 f2.setSalario(2000.00);
		 
		 ControleBonificacao controle = new ControleBonificacao();
		 controle.registra(g2);
		 System.out.println(controle.getSoma());
		 
		 controle.registra(f2);
		 System.out.println(controle.getSoma());
		 
		 EditorVideo e1 = new EditorVideo ();
		 e1.setSalario(3000.00);
		 
		 controle.registra(e1);
		 // N�o precisa criar um m�todo registra para cada tipo de funcion�rio. � s� utilizar a referencia gen�rica/super class, como, no caso, o funcion�rio.
			 
		 System.out.println(controle.getSoma());

	}

}
