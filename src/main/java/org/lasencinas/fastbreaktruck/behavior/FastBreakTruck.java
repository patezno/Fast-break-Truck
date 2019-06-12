package org.lasencinas.fastbreaktruck.behavior;

import org.lasencinas.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.drinks.TurbulentJuice;
import org.lasencinas.fastbreaktruck.food.Eyeholes;

public class FastBreakTruck extends Desayuno {

    public FastBreakTruck() {
    }

    public static Desayuno prepararEyeHoles() {
        Eyeholes eyeholes = new Eyeholes();
        TurbulentJuice turbulentJuice = new TurbulentJuice();
        return new Desayuno(eyeholes, turbulentJuice);
    }
}
