package net.udb.mod3;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class OperacionesReduccion {

	public OperacionesReduccion() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> lst=new ArrayList<Empleado>();
		lst.add(new Empleado(1,"CArlos",2200.00));
		lst.add(new Empleado(2,"Maria",1200.00));
		lst.add(new Empleado(3,"Rosa",2800.00));
		lst.add(new Empleado(4,"Rita",3200.00));
		lst.add(new Empleado(5,"Francisco",2200.00));
		
		Double suma=lst.stream().mapToDouble(e->e.getSalario()).sum();
		int numeroEmpleados=(int) lst.stream().map(e->e.getNombre().contains("s")).count();
		OptionalDouble minimo=lst.stream().mapToDouble(e->e.getSalario()).min();
		OptionalDouble maximo=lst.stream().filter(e->e.getNombre().contains("s")).mapToDouble(e->e.getSalario()).max();
		OptionalDouble promedio=lst.stream().mapToDouble(e->e.getSalario()).average();
		
		System.out.println("Total a pagar planilla "+suma);
		System.out.println("Numero de empleados "+numeroEmpleados);
		if(minimo.isPresent())  System.out.println("Numero minimo es "+minimo.getAsDouble());
		if(promedio.isPresent())  System.out.println("Promedio pagado  "+promedio.getAsDouble());
		if(maximo.isPresent())  System.out.println("Maximo pagado  "+maximo.getAsDouble());

	}

}
