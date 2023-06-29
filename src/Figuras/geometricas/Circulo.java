package Figuras.geometricas;

import Calculos.Figuras.Figura;

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
        return 0;
    }
}
