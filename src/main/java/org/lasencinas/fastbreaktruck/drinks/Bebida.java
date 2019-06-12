package org.lasencinas.fastbreaktruck.drinks;

import org.lasencinas.fastbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.packing.Tubo;

public abstract class Bebida implements Item {

    public Packing empaquetado() {
        return new Tubo();
    }
}
