package pacote;

public class Main {

	
	// Chamando método não estático através do construtor
	Main() {
		int a = 5;
		System.out.println(a);
		display();
	}

	// Método não estático
	void display() {
		// Imprimir instrução sempre o método não estático for chamado
		System.out.println("O método não estático é chamado usando o construtor.");
	}

	public static void main(String[] args) {

//		Método 2
		new Main();
	}

}
