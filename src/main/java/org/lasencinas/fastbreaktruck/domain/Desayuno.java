package org.lasencinas.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.interfaces.Packing;

public class Desayuno implements Item {

    // Atributos


    public void mostrarItems() {
        System.out.println();
    }

    public String getCoste() {
    }

    @Override
    public String nombre() {
        return null;
    }

    @Override
    public Packing empaquetado() {
        return null;
    }

    @Override
    public Float pvp() {
        return null;
    }
}
