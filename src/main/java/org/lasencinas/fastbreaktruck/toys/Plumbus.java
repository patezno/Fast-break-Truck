package org.lasencinas.fastbreaktruck.toys;

import org.lasencinas.fastbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.packing.Caja;

public class Plumbus implements Item {

    // Atributos
    private String name = null;
    private Float pvp = null;

    public Plumbus() {
        this.name = "Plumbus";
        this.pvp = 100.0f;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPvp(Float pvp) {
        this.pvp = pvp;
    }

    // Getters
    public String getName() {
        return name;
    }

    public Float getPvp() {
        return pvp;
    }

    // Metodos
    @Override
    public String nombre() {
        return getName();
    }

    @Override
    public Packing empaquetado() {
        return new Caja();
    }

    @Override
    public Float pvp() {
        return getPvp();
    }
}
