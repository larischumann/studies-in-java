
public class TestaEscopo {
	public static void main(String [] args) {
		System.out.println("Testando condicionais pela 3� vez ;D");
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
        	System.out.println("Sejam bem vindos(as) ao Centro de Deten��o Municipal ;)");
        }else {
        	System.out.println("Infelizmente voc� n�o pode ser preso ainda, mas n�o fique triste. "
        			+ "O seu tempo vai chegar ;)");
        }
		
	}
}
