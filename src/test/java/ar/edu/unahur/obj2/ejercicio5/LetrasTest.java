package ar.edu.unahur.obj2.ejercicio5;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LetrasTest {
  Letras l;
  @BeforeTest
  public void setUp() {
    l = new Letras();
  }

  @Test
  public void testContarLetras() {
    Assert.assertEquals(l.contarLetras("aaa"), new int[]{3,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0});
  }
}