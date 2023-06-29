package Figuras.geometricas;

import Calculos.Figuras.Figura;

//En revision
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double calcular_Area() {
        double area = Math.PI * Math.pow(radio, 2);

        System.out.print("El area del \"Circulo\" es: " + area + "\n");
        return area;
    }

    @Override
    public double calcular_Perimetro() {
        double perimetro = 2 * Math.PI * radio;

        System.out.println("El perimetro del \"Circulo\" es: " + perimetro + "\n");
        return perimetro;
    }
}
