package ar.edu.unahur.obj2.colecciones.ticket;

public class Producto {
  String nombre;
  double precio;
  int cantidad;

  public Producto(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidad() {
    return cantidad;
  }
}
