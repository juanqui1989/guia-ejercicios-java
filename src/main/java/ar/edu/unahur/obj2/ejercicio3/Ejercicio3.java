package ar.edu.unahur.obj2.ejercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio3 {
  ArrayList<Double> temperaturas = new ArrayList<>();

  public void cargarArray(int cantidadValores) {
    System.out.println("Ingrese " + cantidadValores + "valores");
    Scanner input = new Scanner(System.in);

    for (int i = 0; i < cantidadValores; i++)
      temperaturas.add(input.nextDouble());
  }

  public void imprimirTemperaturas() {
    Double maxTemp = Collections.max(this.temperaturas);
    Double minTemp = Collections.min(this.temperaturas);
    for (int i = 0; i < temperaturas.size(); i++) {
      if (temperaturas.get(i) == maxTemp )
        System.out.println( i + getAsteriscos(temperaturas.get(i)) + " max ");
      else if (temperaturas.get(i) == minTemp)
        System.out.println(i + getAsteriscos(temperaturas.get(i)) + "min");
      else
        System.out.println(i + getAsteriscos(temperaturas.get(i)));
    }
    System.out.println("media:" + getMedia() );
  }

  public String getAsteriscos(Double cantidad) {
    String asteriscos ="";
    int cantidad1 = cantidad.intValue();
    for (int i = 0; i <= cantidad1; i++){
      asteriscos += "*";
    }
    return asteriscos;
  }

  public Double getMedia() {
    double sum = temperaturas.stream().mapToDouble(a->a).average().orElse(0.0);
    return sum;

  }



}
