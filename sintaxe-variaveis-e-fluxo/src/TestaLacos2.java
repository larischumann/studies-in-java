
public class TestaLacos2 {
	
	public static void main(String[] args) {
		for (int linha = 1; linha < 10; linha ++) {
			for (int coluna = 0; coluna <= linha; coluna ++) {
				
				//if (coluna > linha) {
					//break;
				//} o if n�o � mais necess�rio, pq mudamos (coluna < 10) por (coluna <= linha).
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
