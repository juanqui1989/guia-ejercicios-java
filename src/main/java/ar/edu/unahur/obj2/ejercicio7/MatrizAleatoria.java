package ar.edu.unahur.obj2.ejercicio7;

import java.util.Random;
import java.util.Scanner;

public class MatrizAleatoria {
  int[][] m = new int[10][10];


  public void setM() {
    Random r = new Random();
    for (int row = 0; row < m.length; row++)
      for (int col = 0; col < m[row].length; col++)
        m[row][col] = r.nextInt(100);
  }
}
