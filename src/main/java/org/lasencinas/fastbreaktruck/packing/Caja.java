package org.lasencinas.fastbreaktruck.packing;

import org.lasencinas.fastbreaktruck.interfaces.Packing;

public class Caja implements Packing {
    @Override
    public String envoltorio() {
        return "Caja";
    }
}
