/**
 * O projeto é um pequeno contador de dois valores.
 * Tem como objetivo exercitar o uso de Estruturas Excepicionais.
 * Além disso, também exercita o uso de métodos e criação de exceções personalizadas.
 * 
 * @author Bruno Rodrigues Peixoto
 * @version 1.0
 * @since 05/09/2023
 * 
 */
import java.util.Scanner;
import java.util.Locale;

public class Contador {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("----- CONTADOR -----");

        System.out.println("Digite um número: ");
        int numeroUm = scanner.nextInt();

        System.out.println("Digite um segundo valor: ");
        int numeroDois = scanner.nextInt();

        try{
            contar(numeroUm, numeroDois);
        }
        catch(ParametrosInvalidosException e) {
            System.out.println("O segundo valor precisa ser MAIOR que o primeiro valor.");
        }
/**
 * Esse método vai fazer a contagem dos dois parâmetros enviados pelo usuário no output.
 * Além disso, é possível verificar uma exceção personalizada para caso o primeiro parâmetro
 * seja menor que o segudo parâmetro.
 * 
 */
    }
    static void contar(int numeroUm, int numeroDois) throws ParametrosInvalidosException {
        int contagem = numeroDois - numeroUm;

    }
    
}
