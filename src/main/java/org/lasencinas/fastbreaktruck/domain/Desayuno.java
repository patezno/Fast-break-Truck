package org.lasencinas.fastbreaktruck.domain;

import org.lasencinas.fastbreaktruck.drinks.Bebida;
import org.lasencinas.fastbreaktruck.food.Cereal;
import org.lasencinas.fastbreaktruck.toys.Plumbus;

public class Desayuno {

    // Atributos
    private Cereal cereales = null;
    private Bebida bebida = null;
    private Plumbus plumbus = null;

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

    public void setPlumbus(Plumbus plumbus) {
        this.plumbus = plumbus;
    }

    // Getters
    public Cereal getCereales() {
        return cereales;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public Plumbus getPlumbus() {
        return plumbus;
    }

    // Metodos
    public void mostrarItems() {
        System.out.println(mostrarCereales());
        System.out.println(mostrarBebida());
        if (plumbus != null) {
            System.out.println(mostrarJuguete());
        }
    }

    public String mostrarCereales() {
        return "\nItem: " + getCereales().nombre() +
                ", Empaquetado: " + getCereales().empaquetado().envoltorio() +
                ", Precio: " + getCereales().pvp().toString();
    }

    public String mostrarBebida() {
        return "Item: " + getBebida().nombre() +
                ", Empaquetado: " + getBebida().empaquetado().envoltorio() +
                ", Precio: " + getBebida().pvp().toString();
    }

    public String mostrarJuguete() {
        return "Item: " + getPlumbus().nombre() +
                ", Empaquetado: " + getPlumbus().empaquetado().envoltorio() +
                ", Precio: " + getPlumbus().pvp().toString();
    }

    public String getCoste() {
        float costePlumbus = 0.0f;
        if (getPlumbus() != null) {
            costePlumbus = getPlumbus().pvp();
        }
        float costeTotal = this.getBebida().pvp() + this.getCereales().pvp() + costePlumbus;
        return Float.toString(costeTotal);
    }
}
