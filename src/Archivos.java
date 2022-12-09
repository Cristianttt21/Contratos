import java.io.*;
import java.util.*;

public class Archivos {

public void escribir (List<Empleado> empleado) {
		
		try {
			FileWriter archivo = new FileWriter ("salarios.txt", true);
			try(BufferedWriter datos = new BufferedWriter (archivo)){
				for (int i = 0; i < empleado.size(); i++) {
					datos.write ("Empleado: " + empleado.get(i).getNombre() + " \n\t--- "
							+ " Tipo de empleado: $"	+ empleado.get(i).getTipoempl() + " \n--- "
							+ " Salario $ : " + String.format("%.2f", empleado.get(i).getSueldo()) + " \n\t--- "
							+ " Descuento por Pension: $" + (empleado.get(i).getSueldo() * 0.04) + " \n\t--- "
							+ " Descuento por Salud: $" + (empleado.get(i).getSueldo() * 0.04) + " \n--- "
							+ " Comisiones Obtenidas: $"  + "\t" + empleado.get(i).getComision() + " \n--- "
							+ " Salario Neto (con Novedades): $" + String.format("%.2f",
									(empleado.get(i).getSueldo() - empleado.get(i).getSueldo() * 0.08) + empleado.get(i).getComision() ) +"\n");
				}
				System.out.println("Su archivo salarios.txt se genero correctamente en: " + System.getProperty("user.dir") + "\\" );	
				datos.close();
			}
			archivo.close();
		}
		catch (Exception Ex) {
			System.out.println("Error");
		}
		
		
		
	}

	public void leer() {
		FileReader fr = null;
		BufferedReader br = null;
		
		System.out.println("lectura del archivo");
		try {
			fr = new FileReader ("salarios.txt");
			br = new BufferedReader (fr);
			
			//lectura
			String linea;
			while((linea = br.readLine()) != null);
			System.out.println(linea);
		} catch (Exception e) {
			System.out.println("Error");
		}
	}
	
}