package net.udb.mod3;

import java.util.List;
import java.util.stream.Stream;

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>lst=List.of("Bienvenido ","al","curso 3");
		Stream<String> cadStream=lst.stream();
		cadStream.forEach(s->System.out.println(s));
	}

}
