package ar.edu.unahur.obj2.ejercicio6;

import java.util.Scanner;

public class Matriz {
  private int[][] m = new int[3][3];
  Scanner input = new Scanner(System.in);

  public void setMatriz() {
    for (int row = 0; row < m.length; row++)
      for (int col = 0; col < m[row].length; col++)
        m[row][col] = input.nextInt();
  }

  public void printMatriz(int[][] m) {
    for (int row = 0; row < m.length; row++)
      for (int col = 0; col < m[row].length; col++)
        System.out.print(m[row][col]);
    System.out.println();
  }

}
