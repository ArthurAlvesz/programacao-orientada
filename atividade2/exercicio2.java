/*Conversor de Temperatura Crie um conversor de temperatura que permita ao usuário converter entre Celsius e Fahrenheit. Peça ao usuário para escolher a direção da conversão e, em seguida, faça a conversão e exiba o resultado. */

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversor de Temperatura");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1. Celsius para Fahrenheit");
        System.out.println("2. Fahrenheit para Celsius");

        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
        } else if (choice == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.println("A temperatura em Celsius é: " + celsius);
        } else {
            System.out.println("Escolha inválida. Por favor, escolha 1 ou 2.");
        }

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
}
