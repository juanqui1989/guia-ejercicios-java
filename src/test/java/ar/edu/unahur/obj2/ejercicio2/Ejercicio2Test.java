package ar.edu.unahur.obj2.ejercicio2;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.*;

public class Ejercicio2Test {

    Ejercicio2 ej2;

    @BeforeTest
    void setUp() {
      ej2 = new Ejercicio2();
    }

    @Test
    void testGetMayoresA() {
      Assert.assertEquals(ej2.getMayoresA(5, new int[] {5,6,7,8,1,2,3}), new ArrayList<Integer>(List.of(6,7,8)));
    }
  }


