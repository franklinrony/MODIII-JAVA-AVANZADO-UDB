package net.udb.mod3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Ejemplo1 {

	public Ejemplo1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> lst=new ArrayList<>();
		lst.add(new Empleado(1,"CArlos",2200.00));
		lst.add(new Empleado(2,"Maria",1200.00));
		lst.add(new Empleado(3,"Rosa",2800.00));
		lst.add(new Empleado(5,"Francisco",2200.00));
		System.out.println("Ejemplo 01");
		Stream<Empleado> miStream=lst.stream();
		miStream.forEach((Empleado e)->System.out.println(e.getNombre()));

	}

}
