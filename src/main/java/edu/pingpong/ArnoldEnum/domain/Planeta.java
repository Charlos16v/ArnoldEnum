package edu.pingpong.ArnoldEnum.domain;

import java.util.EnumSet;

public enum Planeta {


    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),

    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double masa;
    private final double radio;

    Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    private final static double G = 6.67300e-11;

    double getMasa() {
        return this.masa;
    }

    double getRadio() {
        return this.radio;
    }

    public double pesoSuperficie(double pesoHumano) {
        return masaHumano(pesoHumano) * gravedadSuperficie();
    }

    double masaHumano(double pesoHumano) {
        return pesoHumano / EARTH.gravedadSuperficie();
    }

    double gravedadSuperficie() {
        return G * getMasa() / (getRadio() * getRadio());
    }

    public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    public static EnumSet<Planeta> getGigantesGaseosos() {
        return EnumSet.range(JUPITER, NEPTUNE);
    }
}
