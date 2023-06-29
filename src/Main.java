import Figuras.geometricas.Circulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion, subopcion;

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
                    Circulo circulo = new Circulo(5);
                    System.out.println("Que es lo que desea calcular de la figura \"Circulo\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {
                        circulo.calcular_Area();
                    }
                    else if(subopcion == 2)
                    {
                        circulo.calcular_Perimetro();
                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 2 -> {
                    System.out.println("Que es lo que desea calcular de la figura \"Triangulo\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {

                    }
                    else if(subopcion == 2)
                    {

                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 3 -> {
                    System.out.println("Que es lo que desea calcular de la figura \"Cuadrado\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {

                    }
                    else if(subopcion == 2)
                    {

                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 4 -> {
                    System.out.println("Que es lo que desea calcular de la figura \"Esfera\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {

                    }
                    else if(subopcion == 2)
                    {

                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 5 -> {
                    System.out.println("Que es lo que desea calcular de la figura \"Piramide\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {

                    }
                    else if(subopcion == 2)
                    {

                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 6 -> {
                    System.out.println("Que es lo que desea calcular de la figura \"Cubo\"?");
                    System.out.println("1) Area");
                    System.out.println("2) Perimetro");
                    System.out.print("Selecciona una opcion: ");
                    subopcion = scanner.nextInt();

                    if(subopcion == 1)
                    {

                    }
                    else if(subopcion == 2)
                    {

                    }
                    else
                    {
                        System.out.println("¡Opcion invalida!");
                    }
                }
                case 7 -> System.out.println("¡Hasta luego!");

                default -> System.out.println("¡Opcion invalida!");
            }
        }while (opcion != 7);
    }
}