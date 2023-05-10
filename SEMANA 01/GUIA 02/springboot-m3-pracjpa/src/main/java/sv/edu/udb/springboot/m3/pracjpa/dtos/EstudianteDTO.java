package sv.edu.udb.springboot.m3.pracjpa.dtos;

public class EstudianteDTO {

	private Integer codigo;
	private String nombre;
	private String apellido;
	private Double cum;
	private Double cuotaMensual;
	public EstudianteDTO() {
	// TODO Auto-generated constructor stub
	}
	public Integer getCodigo() {
	return codigo;
	}
	public void setCodigo(Integer codigo) {
	this.codigo = codigo;
	}
	public String getNombre() {
	return nombre;
	}
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	public String getApellido() {
	return apellido;
	}
	public void setApellido(String apellido) {
	this.apellido = apellido;
	}
	public Double getCum() {
		return cum;
		}
		public void setCum(Double cum) {
		this.cum = cum;
		}
		public Double getCuotaMensual() {
		return cuotaMensual;
		}
		public void setCuotaMensual(Double cuotaMensual) {
		this.cuotaMensual = cuotaMensual;
		}

}
