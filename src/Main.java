import Figuras.geometricas.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do
        {
            System.out.println("==== Menu ====");
            System.out.println("1) Circulo");
            System.out.println("2) Triangulo");
            System.out.println("3) Cuadrado");
            System.out.println("4) Esfera");
            System.out.println("5) Priamide");
            System.out.println("6) Cubo");
            System.out.println("7) Salir");

            System.out.print("Selecciona una de las opciones: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> {

                    System.out.println("El area del \"Circulo\" es: ");
                    System.out.println("El perimetro del \"Circulo\" es: ");

                }
                case 2 -> {

                    System.out.println("El area del \"Triangulo\" es: ");
                    System.out.println("El perimetro del \"Triangulo\" es: ");
                }
                case 3 -> {

                    System.out.println("El area del \"Cuadrado\" es: ");
                    System.out.println("El perimetro del \"Cuadrado\" es: ");
                }
                case 4 -> {

                    System.out.println("El area del \"Esfera\" es: ");
                    System.out.println("El perimetro del \"Esfera\" es: ");
                }
                case 5 -> {

                    System.out.println("El area del \"Piramide\" es: ");
                    System.out.println("El perimetro del \"Piramide\" es: ");
                }
                case 6 -> {

                    System.out.println("El area del \"Cubo\" es: ");
                    System.out.println("El perimetro del \"Cubo\" es: ");
                }
                case 7 -> System.out.println("¡Hasta luego!");

                default -> System.out.println("¡Opcion invalida!");
            }
        }while (opcion != 7);
    }
}