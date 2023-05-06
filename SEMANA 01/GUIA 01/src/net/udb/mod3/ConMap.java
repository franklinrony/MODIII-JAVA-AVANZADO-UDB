package net.udb.mod3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ConMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Empleado> lst = new ArrayList<Empleado>();
		lst.add(new Empleado(1, "CArlos", 2200.00));
		lst.add(new Empleado(2, "Maria", 1200.00));
		lst.add(new Empleado(3, "Rosa", 2800.00));
		lst.add(new Empleado(4, "Rita", 3200.00));
		lst.add(new Empleado(5, "Francisco", 2200.00));

		Stream<Empleado> streamEmpleado = lst.stream();
		streamEmpleado.map(e->e.salarioNeto()).forEach(System.out::println);
	}

}
