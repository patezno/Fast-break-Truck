package org.lasencinas;

import org.junit.Before;
import org.junit.Test;
import org.lasencinas.fastbreaktruck.behavior.FastBreakTruck;
import org.lasencinas.fastbreaktruck.domain.Desayuno;
import org.lasencinas.fastbreaktruck.drinks.Bebida;
import org.lasencinas.fastbreaktruck.drinks.FleebJuice;
import org.lasencinas.fastbreaktruck.drinks.TurbulentJuice;
import org.lasencinas.fastbreaktruck.food.Cereal;
import org.lasencinas.fastbreaktruck.food.Eyeholes;
import org.lasencinas.fastbreaktruck.food.Smiggles;
import org.lasencinas.fastbreaktruck.interfaces.Item;
import org.lasencinas.fastbreaktruck.interfaces.Packing;
import org.lasencinas.fastbreaktruck.packing.Caja;
import org.lasencinas.fastbreaktruck.packing.Tubo;
import org.lasencinas.fastbreaktruck.toys.Plumbus;

import static org.junit.Assert.*;


public class AppTest {

    private Cereal eyeholes = null;
    private Cereal smiggles = null;
    private Item plumbus = null;
    private Bebida fleebjuice = null;
    private Bebida turbulentJuice = null;
    private Packing caja = null;
    private Packing tubo = null;
    private Desayuno desayuno = null;

    @Before
    public void init() {
        eyeholes = new Eyeholes();
        smiggles = new Smiggles();
        plumbus = new Plumbus();
        fleebjuice = new FleebJuice();
        turbulentJuice = new TurbulentJuice();
        caja = new Caja();
        tubo = new Tubo();
        desayuno = new Desayuno(eyeholes, turbulentJuice);
    }

    @Test
    public void isEyeholeCreatedTest() {
        assertNotNull(eyeholes);
        assertEquals("Eyeholes", eyeholes.nombre());
        assertEquals(25.0f, eyeholes.pvp(), 0);
    }

    @Test
    public void isSmigglesCreatedTest() {
        assertNotNull(smiggles);
        assertEquals("Smiggles", smiggles.nombre());
        assertEquals(50.0f, smiggles.pvp(), 0);
    }

    @Test
    public void isPlumbusCreatedTest() {
        assertNotNull(plumbus);
        assertEquals("Plumbus", plumbus.nombre());
        assertEquals(100.0f, plumbus.pvp(), 0);
    }

    @Test
    public void isFleebJuiceCreatedTest() {
        assertNotNull(fleebjuice);
        assertEquals("Fleeb Juice", fleebjuice.nombre());
        assertEquals(35.0f, fleebjuice.pvp(), 0);
    }

    @Test
    public void isTurbulentJuiceCreatedTest() {
        assertNotNull(turbulentJuice);
        assertEquals("Turbulent juuuuuice", turbulentJuice.nombre());
        assertEquals(30.0f, turbulentJuice.pvp(), 0);
    }

    @Test
    public void isCajaCreatedTest() {
        assertNotNull(caja);
        assertEquals("Caja", caja.envoltorio());
    }

    @Test
    public void isTuboCreatedTest() {
        assertNotNull(tubo);
        assertEquals("Tubo", tubo.envoltorio());
    }

    @Test
    public void isDesayunoCreatedTest() {
        assertNotNull(desayuno);
        assertEquals(eyeholes.nombre(), desayuno.getCereales().nombre());
        assertEquals(eyeholes.pvp(), desayuno.getCereales().pvp());
    }

    @Test
    public void isPlumbusAddedTest() {
        FastBreakTruck.incluirJuguete(desayuno);
        assertNotNull(desayuno.getPlumbus());
    }

    @Test
    public void prepararEyeholesTest() {
        Desayuno newDesayuno = FastBreakTruck.prepararEyeHoles();
        assertNotNull(newDesayuno.getCereales());
        assertNotNull(newDesayuno.getBebida());
        assertNull(newDesayuno.getPlumbus());
    }

    @Test
    public void prepararSmiggles() {
        Desayuno newDesayuno = FastBreakTruck.prepararSmiggles();
        assertNotNull(newDesayuno.getCereales());
        assertNotNull(newDesayuno.getBebida());
        assertNull(newDesayuno.getPlumbus());
    }
}
