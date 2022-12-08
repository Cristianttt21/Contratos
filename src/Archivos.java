import java.io.*;

public class Archivos {

	public void escribir (String almacenar) {
		
		try {
			FileWriter archivo = new FileWriter ("salarios.txt", true);
			try(BufferedWriter datos = new BufferedWriter (archivo)){
				datos.write(almacenar);
				datos.close();
			}
			archivo.close();
		}
		catch (Exception Ex) {
			System.out.println("Error");
		}
		
		System.out.println("Error en archivo 1");
		
	}
	
}