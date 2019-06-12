package org.lasencinas.fastbreaktruck.food;

import org.lasencinas.fastbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.packing.Caja;

public abstract class Cereal implements Item {

    // Métodos
    @Override
    public Packing empaquetado() {
        return new Caja();
    }
}
