package ar.edu.unahur.obj2.ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListaAlumno {
  private List<Alumno> alumnos = new ArrayList<>();

  public void setAlumnos(int cantidad) {
    Scanner input = new Scanner(System.in);
    for (int i = 0; i < cantidad; i++) {
      System.out.println("ingrese nombre y apellido");
      String nombre = input.next();
      String apellido = input.next();
      alumnos.add(new Alumno(nombre, apellido));
    }

  }

  public void mostrarLosQueEmpiezanCon(char letra) {
    List<Alumno> lista = alumnos.stream()
            .filter(alumno -> alumno.getNombre().charAt(0) == letra  )
            .collect(Collectors.toList());
    lista.forEach(a -> System.out.println(a.getNombre() + " " + a.getApellido()));

  }






}
