
public class TestaIR {
	public static void main(String[] args) {

        double salario = 3300.0;
        double ir = 0;
        double valorAdeduzir = 0;

        //ifs aqui. valores de ir de 2015!
        
        if (salario <= 1903.98) {
        	ir = 0;
        	valorAdeduzir = 0;
        	System.out.println("O IR � de 0%.");
        	
        } else if (salario >= 1903.99 && salario <= 2826.65) {
        	ir = 0.075;
        	valorAdeduzir = 142.80;
        	System.out.println("O IR � de 7,5%.");
        	
        } else if (salario >= 2826.66 && salario <= 3751.05){
        	ir = 0.15;
        	valorAdeduzir = 354.80;
        	System.out.println("O IR � de 15%.");
        	
        }else if (salario >= 3751.06 && salario <= 4664.68){
        	ir = 0.225;
        	valorAdeduzir = 636.13;
        	System.out.println("O IR � de 22,5%.");  
        	
        }else if (salario >= 4664.69){
        	ir = 0.275;
        	valorAdeduzir = 869.36;
        	System.out.println("O IR � de 27,5%.");
        }
        
        double valorIR = (salario * ir) - valorAdeduzir ;
        double salarioLiquido = salario - valorIR;
        System.out.println("Vai ser descontado: " + valorIR);
        System.out.println("O sal�rio l�quido � " + salarioLiquido);
	}
}
