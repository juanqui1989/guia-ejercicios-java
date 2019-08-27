package ar.edu.unahur.obj2.colecciones.empresaEmpleados;

import java.util.HashSet;
import java.util.Objects;

public class Empresa {
  private String nombre;
  private String anioFundacion;
  private static int id = 0;
  private HashSet<Empleado> empleados = new HashSet<>();


  public Empresa(String nombre, String anioFundacion) {
    this.nombre = nombre;
    this.anioFundacion = anioFundacion;
    this.id = id;
    id++;
  }

  @Override
  public String toString() {
    return "Empresa{" +
            "id= " + id + '\'' +
            "nombre='" + nombre + '\'' +
            ", anioFundacion='" + anioFundacion + '\'' +
             +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Empresa empresa = (Empresa) o;
    return id == empresa.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  public int getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getAnioFundacion() {
    return anioFundacion;
  }

  public void setEmpleado(Empleado empleado) {
    if (!empleados.contains(empleado))
      empleados.add(empleado);
  }

  public void imprimirEmpleados() {
    empleados.forEach(empleado -> System.out.println(empleado));
  }





}
