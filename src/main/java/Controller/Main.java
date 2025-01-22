package Controller;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Escolha o número de sua opção:");
            System.out.println("1 - Buscar livro pelo título");
            System.out.println("2 - Listar livros registrados");
            System.out.println("3 - Listar autores registrados");
            System.out.println("4 - Listar autores vivos em um determinado ano");
            System.out.println("5 - Listar livros em um determinado idioma");
            System.out.println("0 - Sair");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após o número

            switch (choice) {
                case 1:
                    // Implementar busca por título
                    break;
                case 2:
                    // Implementar listagem de livros
                    break;
                case 3:
                    // Implementar listagem de autores
                    break;
                case 4:
                    // Implementar listagem de autores vivos
                    break;
                case 5:
                    // Implementar listagem de livros por idioma
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
