package ar.edu.unahur.obj2.colecciones.ticket;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TicketTest {
  LineaTicket lineaTicket;
  Ticket ticket;

  @BeforeTest
  public void setTicket() {
    ticket = new Ticket();
    ticket.addProducto(new Producto("harina",30,2));
    ticket.addProducto(new Producto("leche",30,2));
    ticket.setValorTotal();
  }

  @Test
  public void testGetValorTotal() {
    Assert.assertEquals(ticket.getValorTotal(),120.0);
  }
}