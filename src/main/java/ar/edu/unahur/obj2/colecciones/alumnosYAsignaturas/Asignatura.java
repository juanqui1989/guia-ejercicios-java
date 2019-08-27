package ar.edu.unahur.obj2.colecciones.alumnosYAsignaturas;

import java.util.HashSet;
import java.util.Set;

public class Asignatura {
  private String nombre;
  private int horasSemanales;
  private Set<Alumno> alumnosMatriculados = new HashSet<>();

  public Asignatura(String nombre, int horasSemanales) {
    this.nombre = nombre;
    this.horasSemanales = horasSemanales;
  }

  public String getNombre() {
    return nombre;
  }

  public int getHorasSemanales() {
    return horasSemanales;
  }

  public void matricularAlumno(Alumno alumno) {
    if (!alumnosMatriculados.contains(alumno)) {
      alumnosMatriculados.add(alumno);
    }
  }

  public Set<Alumno> getAlumnosMatriculados() {
    return alumnosMatriculados;
  }
}
