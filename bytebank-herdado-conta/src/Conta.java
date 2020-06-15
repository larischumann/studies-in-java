

public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    
    public Conta ( int agencia, int numero) { 
    	Conta.total++; // Poderia ser s� total++
    	System.out.println("O total de contas � " + Conta.total);
        this.agencia = agencia;
        this.numero = numero;
    	System.out.println("Estou criando sua conta n�: " + this.numero);
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta destino) {
        if(this.saca (valor)) {
            destino.deposita(valor);
            return true;
        }
        return false;
    }
    
    public double getSaldo() {
    	return this.saldo;
    }
    
    public int getNumero() {
    	return this.numero;
    }
    
    public void setNumero (int numero) {
    	if (numero <= 0) {
    		System.out.println("Error 0001: N�o pode usar n�mero menor ou igual � zero como n�mero da conta.");
    		return;
    	}
    	this.numero = numero;
    }
    
    public int getAgencia() {
		return this.agencia;
	}
    
    public void setAgencia(int agencia) {
    	if (agencia <=0) {
    		System.out.println("Error 0002: N�o pode usar n�mero menor ou igual � zero como n�mero da ag�ncia.");
    		return;
    	}
		this.agencia = agencia;
	}
    
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}
    
    public Cliente getTitular() {
		return this.titular;
	}
    
    public static int getTotal () {
    	return Conta.total;
    }
}