package org.lasencinas.fastbreaktruck.food;

public class Smiggles extends Cereal {

    // Atributos
    private String name = null;
    private Float pvp = null;

    // Constructor
    public Smiggles() {
        this.name = "Smiggles";
        this.pvp = 50.0f;
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
