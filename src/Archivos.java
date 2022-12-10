import java.io.*;
import java.util.*;

public class Archivos {

public void escribir (List<Empleado> empleado) {
		
		try {
			FileWriter archivo = new FileWriter ("salarios.txt", true);
			try(BufferedWriter datos = new BufferedWriter (archivo)){
				for (int i = 0; i < empleado.size(); i++) {
					datos.write ("Empleado: " + empleado.get(i).getNombre() + " \n\t--- "
							+ " Tipo de empleado: "	+ empleado.get(i).getTipoempl() + " \n\t--- "
							+ " Salario $ : " + String.format("%.2f", empleado.get(i).getSueldo()) + " \n\t--- "
							+ " Descuento por Pension: $" + (empleado.get(i).getSueldo() * 0.04) + " \n\t--- "
							+ " Descuento por Salud: $" + (empleado.get(i).getSueldo() * 0.04) + " \n\t--- "
							+ " Comisiones Obtenidas: $"  + "\t" + String.format("%.2f", empleado.get(i).getComision()) + " \n\t--- "
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
		 BufferedReader leer = null;
		  try {
		   String texto;
		   leer = new BufferedReader(new FileReader("salarios.txt"));
		while ((texto = leer.readLine()) != null) {

		    System.out.println(texto);
		   }

		  } catch (IOException e) {
			  System.out.println("Archivo no encontrado, debe crear primero el archivo");
		  } finally {

		   try {
		    if (leer != null)
		    	leer.close();
		   } catch (IOException ex) {
		    ex.printStackTrace();
		   }
		  }
		 }
		
	}
