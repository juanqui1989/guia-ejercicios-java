package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AlumnoMatriculaApp {
  private Map<String,Alumno> alumnos = new HashMap<>();
  Scanner input = new Scanner(System.in);
  public void menu() {
    int op;
    do {
      System.out.println("1. " + "crear nuevo alumno");
      System.out.println("2. " + "crear nueva asignatura");
      System.out.println("3. " + "matricular alumno en asignatura");
      System.out.println("4. " + "listado de alumnos matriculados en una asignatura");
      System.out.println("5. " + "listado de asignaturas en las que esta matriculado un alumno y total de horas");
      System.out.println("6. " + "salir");
      op = input.nextInt();

      switch (op) {
        case 1:

      }

    }while (op != 6);

  }

  public Alumno crearAlumno( String nombre, String apellido, String email) {
    return  new Alumno(nombre, apellido, email);
  }
}
