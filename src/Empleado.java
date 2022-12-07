
public class Empleado {

	private String nombre;   //declara variables a utilizar localmente
	private double Sueldo;

	public Empleado(String nombre, float Sueldo) {
		this.nombre = nombre;
		this.setSueldo(Sueldo);
	}

	public String getNombre() {  //permite la captura del valor recibido en el llamado a la clase
		return nombre;
	}

	public void setNombre(String nombre) {  //almacena la informacion recibida en el arreglo
		this.nombre = nombre;
	}

	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(float sueldo) {
		Sueldo = sueldo;
	}
	
}
