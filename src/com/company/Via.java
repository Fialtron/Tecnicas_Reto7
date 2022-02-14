package com.company;

public abstract class Via {
    protected double coordenadasIniciales[] = new double[2];
    protected double coordenadasFinales[] = new double[2];
    protected int ancho ;

 /*   public Via(double[] coordenadasIniciales, double[] coordenadasFinales, int ancho) {
        this.coordenadasIniciales = coordenadasIniciales;
        this.coordenadasFinales = coordenadasFinales;
        this.ancho = ancho;
    }

    public double[] getCoordenadasFinales() {
        return coordenadasFinales;
    }

    public double[] getCoordenadasIniciales() {
        return coordenadasIniciales;
    }


    public int getAncho() {
        return ancho;
    }
*/

    public double longitud() {
        return Math.sqrt(Math.pow(coordenadasFinales[0]-coordenadasIniciales[0],2)+Math.pow(coordenadasFinales[1]-coordenadasIniciales[1],2));
    }

    public double area() {
        return ancho*this.longitud();
    }

    public abstract double volumen();
}
