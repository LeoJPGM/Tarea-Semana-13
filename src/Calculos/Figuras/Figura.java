package Calculos.Figuras;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class Figura {
    protected List<Puntos> puntosList = new ArrayList<>();
    public abstract double calcular_Area();
    public abstract double calcular_Perimetro();

    public void ingresar_Puntos()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la componente del punto x: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la componente del punto y: ");
        double y = scanner.nextDouble();
        System.out.print("Ingrese la componente del punto z: ");
        double z = scanner.nextDouble();
        puntosList.add(new Puntos(x, y, z));
    }

    public double calcular_Distancia_Puntos(int i, int j)
    {
        Puntos punto_1 = puntosList.get(i);
        Puntos punto_2 = puntosList.get(j);
        double distancia = Math.sqrt(Math.pow(punto_1.getX() - punto_2.getX(), 2)
                                   + Math.pow(punto_1.getY() - punto_2.getY(), 2)
                                   + Math.pow(punto_1.getZ() - punto_2.getZ(), 2));
        return distancia;
    }
    
}
