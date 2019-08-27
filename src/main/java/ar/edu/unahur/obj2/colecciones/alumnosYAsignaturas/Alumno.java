package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Alumno {
  private String nombre;
  private String apellido;
  private String email;
  private Set<Asignatura> asignaturasInscriptas = new HashSet<>();

  public Alumno(String nombre, String apellido, String email) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getEmail() {
    return email;
  }

  public void matricularEnAsignatura(Asignatura asignatura) {
    if (!asignaturasInscriptas.contains(asignatura)) {
      asignaturasInscriptas.add(asignatura);
      asignatura.matricularAlumno(this);
    }
  }

  public void getAsignaturasYHoras() {
    asignaturasInscriptas.forEach(asignatura ->
            System.out.println(asignatura.getNombre() + asignatura.getHorasSemanales() + " horas"));
  }
}
