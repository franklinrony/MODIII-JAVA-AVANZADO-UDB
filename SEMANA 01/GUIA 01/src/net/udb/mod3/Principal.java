package net.udb.mod3;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}
	
	public void imprimirEmpleado(Empleado e) {
		System.out.println(e.getNombre());
	}
	
	public interface Calcular() {
		int suma(int a,int b);
		int resta(int a,int b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcular calc=(a,b)->{
			return (a+b);};
		}
	}

}
