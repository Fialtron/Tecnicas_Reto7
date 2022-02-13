package com.company;

import java.util.Arrays;

public class Asfalto extends Via{
    private String asfaltoProvedoor;
    private int velocidadMax;
    private boolean adelantar;

    public Asfalto(String asfaltoProvedoor, int velocidadMax, boolean adelantar) {
        super();
        this.asfaltoProvedoor = asfaltoProvedoor;
        this.velocidadMax = velocidadMax;
        this.adelantar = adelantar;
    }

    @Override
    public double volumen() {
        return area() * 0.25;
    }
}
