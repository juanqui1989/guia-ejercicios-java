package ar.edu.unahur.obj2.colecciones.empresaEmpleados;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class EmpresasApp {
  private HashMap<Integer,Empresa> empresas = new HashMap<Integer, Empresa>();
  private Scanner input = new Scanner(System.in);

  public void menu() {
    int option;

    do{

    System.out.println("1. Crear nueva empresa.");
    System.out.println("2. Añadir empleado a empresa existente.");
    System.out.println("3. Listado de empresas");
    System.out.println("4. Listado detallado de empresas y empleados");
    System.out.println("5. Salir.");
      System.out.println();
    option = input.nextInt();

      switch (option) {
        case 1:
          System.out.println("ingresar nombre de la nueva empresa");
          String nombre = input.next();
          System.out.println("ingresar fecha de fundacion");
          String fechaFundacion = input.next();
          this.crearEmpresa(nombre,fechaFundacion);
          break;

        case 2:
          String nombreEmpleado;
          String apellido;
          String fechaNac;
          String fechaContrato;
          System.out.println("ingrese datos del empleado:");
          System.out.println("nombre");
          nombre = input.next();
          System.out.println("apellido");
          apellido = input.next();
          System.out.println("fechaNac");
          fechaNac = input.next();
          System.out.println("fecha contrato");
          fechaContrato = input.next();

          System.out.println("ingrese el id de la empresa a la que desea agregar el empleado");
          int id = input.nextInt();

          Empleado empleado = new Empleado(nombre,apellido,fechaNac,fechaContrato);
          this.addEmpleadoA(id, empleado);
          break;

        case 3:
          this.imprimirEmpresas();
          break;

        case 4:
          this.imprimirEmpresasYEmpleados();
          break;


        default:
          System.out.println("ingrese una opcion valida");



      }
    }
    while (option != 5);
  }

  public void crearEmpresa(String nombre, String anioFundacion) {
    Empresa empresa = new Empresa(nombre,anioFundacion);
    empresas.put(empresa.getId(),empresa);
  }

  public void addEmpleadoA(int id, Empleado empleado) {
    Empresa empresa;
    if (empresas.containsKey(id)) {
      empresa = empresas.get(id);
      empresas.get(empresa.getId()).setEmpleado(empleado);
    }
  }

  public void imprimirEmpresas() {
    empresas.forEach((i,e) -> {
      System.out.println(e);;
    });
  }

  public void imprimirEmpresasYEmpleados() {
    empresas.forEach((i,e) -> {
      System.out.println(e);
      e.imprimirEmpleados();

    });
  }

  public static void main(String[] args) {
    EmpresasApp app = new EmpresasApp();

    app.menu();
  }








}
