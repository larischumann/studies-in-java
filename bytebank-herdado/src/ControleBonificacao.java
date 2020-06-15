
public class ControleBonificacao {
	
	private double soma;
	
	 // Não precisa criar um método registra para cada tipo de funcionário. É só utilizar a referencia genêrica/super class, como, neste caso, o funcionário.
	public void registra (Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
	public double getSoma() {
		return this.soma;
	}

}
