package ar.edu.unahur.obj2.ejercicio1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Ejercicio1Test {
    Ejercicio1 ej1;
    @BeforeTest
    public void setUp() {
        ej1 = new Ejercicio1();
    }

    @Test
    public void testImprimirInversamente() {
        Assert.assertEquals(ej1.getInverso(new int[]{1,2,3}), new int[] {3,2,1});
    }
}