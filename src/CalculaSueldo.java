import java.util.*;

//definimos la clase principal
public class CalculaSueldo {

//inicializamos la clase main
	public static void main(String[] args) {

		List<Empleado> empleado = new ArrayList<>();
		/*
		 * clase que permite almacenar datos en memoria de forma similar a los Arrays,
		 * con la ventaja de que el numero de elementos que almacena, lo hace de forma
		 * dinámica, es decir, que no es necesario declarar su tamaño como pasa con los
		 * Arrays.
		 */
		// Declaracion de variables
		String nomEmpl = "";
		float Sueldo = 0;
		int Opcion = 0, contnom = 1, contsuel = 1;
		boolean salir = false;
		boolean DeclSalario = false;
		// inicializacion metodo escanner
		Scanner in = new Scanner(System.in); // Inicializamos scanner para leer numeros

		// Este while, permite mostrar el menu en un ciclo continuo hasta que la opcion
		// salir sea falsa la cual esta dentro del menu en la opcion 8
		while (!salir) {

			System.out.println(" \n\n **************************************** ");
			System.out.println(" ***************** MENU ***************** ");
			System.out.println(" **************************************** \n\nDigite la opcion deseada:");
			System.out.println(" \n");
			System.out.println(" 1. REGISTRAR EMPLEADO");
			System.out.println(" 2. VERIFICAR LISTA DE EMPLEADOS ");
			System.out.println(" 3. DESPRENDIBLE DE PAGOS ");
			System.out.println(" 0. SALIR DE LA APLICACION ");
			System.out.println(" \n\n ");

			try { // permite capturar cuando el valor ingresado no corresponde al menu o a un
					// numero valido

				Opcion = in.nextInt();

				switch (Opcion) {

				case 1: {
				
					System.out.println("Por favor ingrese el Nombre del empleado: " + contnom++ );
					nomEmpl = in.nextLine();
					nomEmpl = in.nextLine();
					if (!DeclSalario) {
						System.out.println("Por favor ingrese el salario del empleado: " + contsuel++);
						Sueldo = in.nextFloat();
						DeclSalario = true;
						;
					} else {
						Sueldo = (float) (Sueldo * 0.10 + Sueldo);
					}

					empleado.add(new Empleado(nomEmpl, Sueldo));

					System.out.println(" ");
				}
					break;

				case 2:
				{
					System.out.println("La cantidad de empleados registrados es: "+ empleado.size() + "\n\n");
					for (int i = 0; i < empleado.size(); i++) {
						System.out.println(
								"Empleado: " + empleado.get(i).getNombre() + "  --- "  + " Salario $: " + String.format("%.2f",empleado.get(i).getSueldo()));

					}
				}
					break;

				case 3:
				{

					for (int i = 0; i < empleado.size(); i++) {
						
								
								if(Sueldo <= 5289934) {
									System.out.println("Empleado: " + empleado.get(i).getNombre() +" \n\t--- " + " Salario $ : " + String.format("%.2f",empleado.get(i).getSueldo())
									+" \n\t--- "+ " Descuento por Pension: $" + (empleado.get(i).getSueldo() * 0.04) +" \n\t--- "+" Descuento por Salud: $" +
								   (empleado.get(i).getSueldo() * 0.04) +" \n--- "+ " Salario Neto (con descuentos): $" + String.format("%.2f",( empleado.get(i).getSueldo()
								   - empleado.get(i).getSueldo() * 0.08)));
					}
								else {
									System.out.println("Empleado: " + empleado.get(i).getNombre() +" \n\t--- "+ " Salario $ : " + String.format("%.2f",empleado.get(i).getSueldo())
									+" \n\t--- " +" Descuento por pension Pension: $" + (empleado.get(i).getSueldo() * 0.05) +" \n\t--- "+" Descuento por Salud: $" +
								   (empleado.get(i).getSueldo() * 0.05) +" \n\t--- " +" Retefuente: " + String.format("%.2f",(empleado.get(i).getSueldo() * 0.14)) +" \n--- "+ " Salario Neto (con descuentos): $" + 
								   String.format("%.2f",( empleado.get(i).getSueldo() - empleado.get(i).getSueldo() * 0.1 - (empleado.get(i).getSueldo() * 0.14))) );
							
								}		 	
				
				}
				}
					break;

				case 0: { // SALIR DE LA APLICACION
					salir = true;
					System.out.println("Salida del programa\n\nGracias por usar esta aplicacion:\n\nCreadores:\nMateo Castro\nCristian Paez\nRodrigo Zuniga");
					in.close();
				}
					break;
				default:
					System.out.println("La opcion ingresada no es valida, intenta nuevamente");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes introducir una cantidad numerica referente al salario");
				in.next();
			}
			in.ioException();
		}

	}

}
