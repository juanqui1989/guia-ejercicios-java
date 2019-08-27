package ar.edu.unahur.obj2.colecciones.ticket;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ticket {
  List<Producto> productos = new ArrayList<>();
  double valorTotal;

  final Scanner input = new Scanner(System.in);

  Ticket(){}

  Ticket(int cantidadProductos, LineaTicket linea) {
    this.cargarProductos(cantidadProductos);
    this.setValorTotal();
    linea.addTicket(this);

  }



  public void cargarProductos( int cantidadProductos) {

    String nombre;
    double precio ;
    int cantidad;

    for (int i = 0; i < cantidadProductos; i++) {
      System.out.println("ingrese nombre, precio y cantidad: ");
      nombre = input.next();
      precio = input.nextDouble();
      cantidad = input.nextInt();
      this.productos.add(i,new Producto(nombre,precio,cantidad));
    }
  }

  public void setValorTotal() {
     this.valorTotal = productos.stream()
             .mapToDouble(p -> p.getPrecio() * p.cantidad )
             .sum();
  }

  public void addProducto(Producto p) {
    this.productos.add(p);
  }

  public double getValorTotal() {
    return this.valorTotal;
  }
}
