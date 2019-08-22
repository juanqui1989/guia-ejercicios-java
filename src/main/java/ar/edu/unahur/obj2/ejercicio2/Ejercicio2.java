package ar.edu.unahur.obj2.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {


  public List<Integer> getMayoresA(int pivot, int[] list) {
    List<Integer> temp = new ArrayList<>();
    for (int i = 0; i < list.length; i++) {
      if (list[i] > pivot)
        temp.add(list[i]);

    }
    return temp;

  }
}
