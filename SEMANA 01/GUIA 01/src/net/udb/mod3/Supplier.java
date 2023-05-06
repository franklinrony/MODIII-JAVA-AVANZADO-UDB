package net.udb.mod3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Supplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream.generate(Empleado::new)
	    .limit(5)
	    .peek(e -> {
	        e.setNombre("carlos");
	        e.setSalario(2300.09);
	    })
	    .collect(Collectors.toList())
	    .forEach(System.out::println);


}
}
