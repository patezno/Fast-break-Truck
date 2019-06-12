package org.lasencinas.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.drinks.Bebida;
import org.lasencinas.fastbreaktruck.food.Cereal;

public class Desayuno {

    // Atributos
    private Cereal cereales = null;
    private Bebida bebida = null;

    // Constructores
    public Desayuno() {
    }

    public Desayuno(Cereal cereales, Bebida bebida) {
        this.cereales = cereales;
        this.bebida = bebida;
    }

    // Setters
    public void setCereales(Cereal cereales) {
        this.cereales = cereales;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    // Getters
    public Cereal getCereales() {
        return cereales;
    }

    public Bebida getBebida() {
        return bebida;
    }

    // Metodos
    public void mostrarItems() {
        System.out.println("\nItem: " + getCereales().nombre() +
                ", Empaquetado: " + getCereales().empaquetado().envoltorio() +
                ", Precio: " + getCereales().pvp().toString());
        System.out.println("Item: " + getBebida().nombre() +
                ", Empaquetado: " + getBebida().empaquetado().envoltorio() +
                ", Precio: " + getBebida().pvp().toString());
    }

    public String getCoste() {
        float costeTotal = this.getBebida().pvp() + this.getCereales().pvp();
        return Float.toString(costeTotal);
    }
}
