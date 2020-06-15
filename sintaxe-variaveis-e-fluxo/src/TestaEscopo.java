
public class TestaEscopo {
	public static void main(String [] args) {
		System.out.println("Testando condicionais pela 3ª vez ;D");
        int idade = 18;
        int quantidadePessoas = 3;
        boolean acompanhado;
        if (quantidadePessoas >= 2) {
        	acompanhado = true;
        }else {
        	acompanhado = false;
        }
        	System.out.println("valor de acompanhado = " + acompanhado);
        
        if (idade >= 18 || acompanhado) {
        	System.out.println("Sejam bem vindos(as) ao Centro de Detenção Municipal ;)");
        }else {
        	System.out.println("Infelizmente você não pode ser preso ainda, mas não fique triste. "
        			+ "O seu tempo vai chegar ;)");
        }
		
	}
}
