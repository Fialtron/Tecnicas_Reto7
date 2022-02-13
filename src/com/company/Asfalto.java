package com.company;

public class Asfalto extends Via{
    private String asfaltoProvedoor;
    private int velocidadMax;
    private boolean adelantar;
    private final double ESPESOR = 0.25;

    public Asfalto(String asfaltoProvedoor, int velocidadMax, boolean adelantar) {
        super();
        this.asfaltoProvedoor = asfaltoProvedoor;
        this.velocidadMax = velocidadMax;
        this.adelantar = adelantar;
    }

    @Override
    public double volumen() {
        return ESPESOR * area();
    }
}
