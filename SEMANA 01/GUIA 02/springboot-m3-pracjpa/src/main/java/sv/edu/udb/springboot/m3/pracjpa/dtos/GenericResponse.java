package sv.edu.udb.springboot.m3.pracjpa.dtos;

public class GenericResponse {

	private int id;
	private String message;
	public GenericResponse() {
	// TODO Auto-generated constructor stub
	}
	public GenericResponse(int id, String message) {
	super();
	this.id = id;
	this.message = message;
	}
	public int getId() {
	return id;
	}
	public void setId(int id) {
	this.id = id;
	}
	public String getMessage() {
	return message;
	}
	public void setMessage(String message) {
	this.message = message;
	}

}
