package net.udb.mod3;

public class Empleado {
private Integer id;
private String nombre;
private Double salario;

	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	

	public Empleado(Integer id, String nombre, Double salario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.salario = salario;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	public Double salarioNeto() {
		return this.salario -=salario*0.10;
	}
	 @Override
	    public String toString() {
	        return "Empleado{" +
	                "id=" + id +
	                ", nombre='" + nombre + '\'' +
	                ", salario=" + salario +
	                '}';
	    }
}
