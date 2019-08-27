package ar.edu.unahur.obj2.colecciones.empresaEmpleados;

import java.util.Objects;

public class Empleado {
  private String nombre;
  private String apellido;
  private String fechaNacimiento;
  private String fechaContrato;
  private int id;

  public Empleado(String nombre, String apellido, String fechaNacimiento, String fechaContrato) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.fechaNacimiento = fechaNacimiento;
    this.fechaContrato = fechaContrato;
  }

  @Override
  public String toString() {
    return "Empleado{" +
            "nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", fechaNacimiento='" + fechaNacimiento + '\'' +
            ", fechaContrato='" + fechaContrato + '\'' +
            ", id=" + id +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Empleado empleado = (Empleado) o;
    return id == empleado.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }



  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getFechaContrato() {
    return fechaContrato;
  }
}
