
public class ControleBonificacao {
	
	private double soma;
	
	 // N�o precisa criar um m�todo registra para cada tipo de funcion�rio. � s� utilizar a referencia gen�rica/super class, como, neste caso, o funcion�rio.
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
