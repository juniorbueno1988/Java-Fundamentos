
public class LacoRepeticao {

	public static void main(String[] args) {
		// Comando WHILE - la�o pr�-testado
		System.out.println("Comando WHILE");
		int qtdVezes = 1;
		
		while (qtdVezes <= 10) {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		}
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");
		
	
		// Do While - la�o p�s-testado
		System.out.println("Comando DO ...WHILE");
		qtdVezes = 1; 
		do {
			System.out.println("Estou fazendo a " + qtdVezes + "� vez");
			qtdVezes++; // qtdVezes = qtdVezes + 1
		} while (qtdVezes <= 10);
		System.out.println("Sa� do la�o e executei " + (qtdVezes-1) + " vezes");

		// For
		System.out.println("Comando FOR");
		qtdVezes = 0;
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "� vez");
			qtdVezes = qtdVezes1;
		}
		System.out.println("Sa� do la�o e executei " + (qtdVezes) + " vezes");
		
		for (int qtdVezes1 = 1; qtdVezes1 <= 10; qtdVezes1++) {
			System.out.println("Estou fazendo a " + qtdVezes1 + "� vez");
			if (qtdVezes1 == 5) {
				System.out.println("Parei na " + qtdVezes1 + "� vez");
				break;
			}
		}
		
	}
}
