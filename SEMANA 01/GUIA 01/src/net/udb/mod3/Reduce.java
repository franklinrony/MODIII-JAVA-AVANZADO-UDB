package net.udb.mod3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Reduce {

	public Reduce() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> lst=List.of("Bienvenido ","al ","curso 3");
		Stream<String> stSaludo=lst.stream();
		Optional<String> resultado=stSaludo.reduce(String::concat);
		if(resultado.isPresent()) {
			System.out.println(resultado.get());
		}
	}

}
