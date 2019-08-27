package ar.edu.unahur.obj2.colecciones.ticket;

import java.util.ArrayList;
import java.util.List;

public class LineaTicket {
  private List<Ticket> lineas = new ArrayList<>();

  public void addTicket(Ticket ticket) {
    lineas.add(ticket);
  }

  public double getTotal() {
    double total = lineas.stream()
            .mapToDouble(ticket -> ticket.getValorTotal())
            .sum();
    return total;
  }




}
