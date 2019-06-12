package org.lasencinas.fastbreaktruck.food;

public class Eyeholes extends Cereal {

    // Atributos
    private String name = null;
    private Float pvp = null;

    // Constructor
    public Eyeholes() {
        this.name = "Eyeholes";
        this.pvp = 25.0f;
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

    // Métodos
    @Override
    public String nombre() {
        return getName();
    }

    @Override
    public Float pvp() {
        return getPvp();
    }
}
