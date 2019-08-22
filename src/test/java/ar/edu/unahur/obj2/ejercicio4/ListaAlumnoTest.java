package ar.edu.unahur.obj2.ejercicio4;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ListaAlumnoTest {
  ListaAlumno l;

  @BeforeMethod
  public void setUp() {
    l = new ListaAlumno();
  }

//  @Test
//  public void testMostrarLosQueEmpiezanCon() {
//    Assert.assertEquals(l.mostrarLosQueEmpiezanCon(););
//  }
}