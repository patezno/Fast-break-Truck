package org.lasencinas.fastbreaktruck.drinks;

public class TurbulentJuice extends Bebida {

    // Atributos
    private String name = null;
    private Float pvp = null;

    // Constructor
    public TurbulentJuice() {
        this.name = "Turbulent juuuuuice";
        this.pvp = 30.0f;
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
    public Float pvp() {
        return getPvp();
    }
}
