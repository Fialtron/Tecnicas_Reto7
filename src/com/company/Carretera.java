package com.company;

import java.util.ArrayList;

public class Carretera {
    private ArrayList<Via> camino = new ArrayList<>();

    public ArrayList<Via> getCamino() {
        return camino;
    }

    public double longitudTotal(){
        return 1;
    }

    public double areaTotal(){
        return 1;
    }

    public double volumenMaterial(){
        return 1;
    }

    public double volumenAsfalto(){
        return 1;
    }

    public double volumenNoAsfalto(){
        return 1;
    }

    public boolean conexionCamino(){
        return true;
    }
}
