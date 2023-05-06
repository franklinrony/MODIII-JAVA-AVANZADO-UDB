package net.udb.mod3;

public class Principal {

	public void imprimirEmpleado(Empleado e) {
		System.out.println(e.getNombre());
	}

	public interface Calcular {
		int suma(int a, int b);
	}

	public static void main(String[] args) {
		 Calcular calc = (a, b) -> a + b;
	     System.out.println(calc.suma(10, 20));
	}
}
