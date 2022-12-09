
public class Empleado {

	private String nombre;   //declara variables a utilizar localmente
	private double Sueldo;
	private int tipoempl ;
	private double comision;
	private int Id;
	
	
	
	public Empleado(int Id, String nombre, float Sueldo, int tipoempl, double comision) {
		this.nombre = nombre;
		this.setSueldo(Sueldo);
		this.setTipoempl(tipoempl);
		this.setId(Id);
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

	public int getTipoempl() {
		return tipoempl;
	}

	public void setTipoempl(int tipoempl) {
		this.tipoempl = tipoempl;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}
	
	public int getId () {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}
	
}
