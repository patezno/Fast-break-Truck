package org.lasencinas.fastbreaktruck.packing;

import org.lasencinas.fastbreaktruck.interfaces.Packing;

public class Tubo implements Packing {
    @Override
    public String envoltorio() {
        return "Tubo";
    }
}
