import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("1º valor");
		int parametroUm = terminal.nextInt();
		System.out.println("2º valor");
		int parametroDois = terminal.nextInt();
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		}catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        } else {			
		int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número");
        }	
	}
    
}
public static int terminal(Scanner scanner) {
	while (true) {
		try {
			return Integer.parseInt(scanner.nextLine());
		} catch (NullPointerException exception) {
			System.out.println("Entrada Invalida. Digite um numero inteiro:");
		}
	}
 }
}