package org.lasencinas.fastbreaktruck.behavior;

import org.lasencinas.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.drinks.FleebJuice;
import org.lasencinas.fastbreaktruck.drinks.TurbulentJuice;
import org.lasencinas.fastbreaktruck.food.Eyeholes;
import org.lasencinas.fastbreaktruck.food.Smiggles;
import org.lasencinas.fastbreaktruck.toys.Plumbus;

public class FastBreakTruck extends Desayuno {

    // Constructor
    public FastBreakTruck() {
    }

    // Metodos
    public static Desayuno prepararEyeHoles() {
        Eyeholes eyeholes = new Eyeholes();
        TurbulentJuice turbulentJuice = new TurbulentJuice();
        return new Desayuno(eyeholes, turbulentJuice);
    }

    public static Desayuno prepararSmiggles() {
        Smiggles smiggles = new Smiggles();
        FleebJuice fleebJuice = new FleebJuice();
        return new Desayuno(smiggles, fleebJuice);
    }

    public static void incluirJuguete(Desayuno eyeDes) {
        eyeDes.setPlumbus(new Plumbus());
    }
}
