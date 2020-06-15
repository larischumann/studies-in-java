//N�o pode instanciar (criar objetos) desta classe, pois ela � abstrata.
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario () {
		System.out.println ("Criando perfil da (o) funcion�ria (o).");
	}
	
	 //metodo sem corpo, nao ha implementacao
	public abstract double getBonificacao ();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
