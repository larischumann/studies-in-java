public class FatorialDoCu {
	public static void main(String[] args) {
		int resultado = 0;
		int i = 0;

		for (int n = 1; n <= 10; n++) {
			if (n < 2) {
				System.out.println(n + "! = 1");

			} else {
				resultado = n;

				for (i = resultado-1; i > 1; i--) {
					resultado *= i;
				}

				System.out.println(n + "! = " + resultado);
			}
		}
	}
}
