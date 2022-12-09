import java.util.*;

//definimos la clase principal
public class CalculaSueldo {

//inicializamos la clase main
	public static void main(String[] args) {

		Archivos Arch; // Constructor de clase, se encarga de crear el objeto que apunta a la clase Bin que se encarga de validacion de los Binarios
		Arch = new Archivos();
		
		List<Empleado> empleado = new ArrayList<>();
		/*
		 * clase que permite almacenar datos en memoria de forma similar a los Arrays,
		 * con la ventaja de que el numero de elementos que almacena, lo hace de forma
		 * dinámica, es decir, que no es necesario declarar su tamaño como pasa con
		 * los Arrays.
		 */
		// Declaracion de variables
		String nomEmpl = "", nomCom = "";
		float Sueldo = 0, cantvent, porvent, cantventfin = 0, comision = 0;
		int Opcion = 0, contvent = 0, ventas = 1, posicion = 0, numempl = 1, posicion2 = 0, tipoempl=0;
		boolean salir = false;
		// inicializacion metodo escanner
		Scanner in = new Scanner(System.in); // Inicializamos scanner para leer numeros

		// Este while, permite mostrar el menu en un ciclo continuo hasta que la opcion
		// salir sea falsa la cual esta dentro del menu en la opcion 8
		while (!salir) {

			System.out.println(" \n\n **************************************** ");
			System.out.println(" ***************** MENU ***************** ");
			System.out.println(" **************************************** \n\n\tDigite la opcion deseada:");
			System.out.println(" \n");
			System.out.println(" 1. MODULO DE REGISTRO DE EMPLEADOS");
			System.out.println(" 2. VERIFICAR LA LISTA DE EMPLEADOS ");
			System.out.println(" 3. INTRODUCIR COMISIONES POR VENTA ");
			System.out.println(" 4. ARCHIVOS DE REPORTES SALARIALES ");
			System.out.println(" 5. GENERAR  DESPRENDIBLES DE PAGOS ");
			System.out.println(" 0. \tSALIR DE LA APLICACION ");
			System.out.println(" \n\n ");

			try { // permite capturar cuando el valor ingresado no corresponde al menu o a un
					// numero valido

				Opcion = in.nextInt();

				switch (Opcion) {

				case 1: {
					
					System.out.println("Ingrese el Nombre del empleado: " + numempl ++);
					nomEmpl = in.nextLine();
					nomEmpl = in.nextLine();
					System.out.println("Ingrese Salario empleado: ");
						Sueldo = in.nextFloat();
					do {
						System.out.println("Tipo empleado: asalariado ( 1 ) , por comision ( 2 )");
						tipoempl = in.nextInt();
					 }while ((tipoempl!=1) && (tipoempl != 2));
					empleado.add(new Empleado(numempl-1, nomEmpl, Sueldo, tipoempl, comision));
				}
					break;

				case 2: {
					System.out.println("La cantidad de empleados registrados es: " + empleado.size() + "\n\n");
					for (int i = 0; i < empleado.size(); i++) {
						if (tipoempl == 1) { 
							System.out.println("Empleado: " + empleado.get(i).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(i).getSueldo()) + " --- "+ "Empleado Asalariado"+ " --- ");
						}
						else {
							System.out.println("Empleado: " + empleado.get(i).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(i).getSueldo()) + " --- " + " Empleado Comisionado "+" --- " );
							
						}
						

					}
				}
					break;

					
				case 3: {
					System.out.println("La lista de emplados es:\n");
					for (int i = 0; i < empleado.size(); i++) {
						if(tipoempl == 1) {
						System.out.println("(" + empleado.get(i).getId() + ")" + "Empleado: " + empleado.get(i).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(i).getSueldo()) + " ---- "+ "Empleado Asalariado  " );
						} else if  (tipoempl == 2) {
							System.out.println("(" + empleado.get(i).getId() + ")" + "Empleado: " + empleado.get(i).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(i).getSueldo()) + " ---- "+ "Empleado Comisionado " );
						}  
						}
					
					
					System.out.println("\nSeleccione el numero del empleado que desea agregarle comision");
					posicion = in.nextInt();
					posicion2 = posicion - 1;
					System.out.println("Selecciono el empleado: \n");
					if(tipoempl ==1 ) {
					System.out.println(empleado.get(posicion2).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(posicion2).getSueldo()) + " ---- "+ "Tipo asalariado  "+ empleado.get(posicion2).getTipoempl() );
					}
					System.out.println("\nPor favor digite la cantidad de ventas");
					contvent = in.nextInt();
					while (contvent >0) {
						System.out.println("Por favor digite la cantidad de la venta " + ventas ++);
						cantvent = in.nextFloat();
						porvent = (float) (cantvent * 0.20);
						comision += porvent;
						contvent--;
					}
					System.out.println("La comision es de " + comision);
					empleado.get(posicion2).setComision(comision);
					for (int i = 0; i < empleado.size(); i++) {
						
						System.out.println("(" + empleado.get(i).getId() + ")" + "Empleado: " + empleado.get(i).getNombre() + "  --- " + " Salario $: " + String.format("%.2f", empleado.get(i).getSueldo()) + " ---- "+ "Empleado Comisionado   "+ empleado.get(i).getTipoempl() + "La comision ganada en ventas es: " + empleado.get(i).getComision());
					}
				}
				break;
				case 4: 
					break;
				
				case 5: {

					for (int i = 0; i < empleado.size(); i++) {

						if (Sueldo <= 5289934) {
							System.out.println("Empleado: " + empleado.get(i).getNombre() + " \n\t--- "
									+ " Salario $ : " + String.format("%.2f", empleado.get(i).getSueldo()) + " \n\t--- "
									+ " Descuento por Pension: $" + (empleado.get(i).getSueldo() * 0.04) + " \n\t--- "
									+ " Descuento por Salud: $" + (empleado.get(i).getSueldo() * 0.04) + " \n--- "
									+ " Salario Neto (con descuentos): $" + String.format("%.2f",
											(empleado.get(i).getSueldo() - empleado.get(i).getSueldo() * 0.08)));
						} else {
							System.out.println("Empleado: " + empleado.get(i).getNombre() + " \n\t--- "
									+ " Salario $ : " + String.format("%.2f", empleado.get(i).getSueldo()) + " \n\t--- "
									+ " Descuento por pension Pension: $" + (empleado.get(i).getSueldo() * 0.05)
									+ " \n\t--- " + " Descuento por Salud: $" + (empleado.get(i).getSueldo() * 0.05)
									+ " \n\t--- " + " Retefuente: "
									+ String.format("%.2f", (empleado.get(i).getSueldo() * 0.14)) + " \n--- "
									+ " Salario Neto (con descuentos): $"
									+ String.format("%.2f",
											(empleado.get(i).getSueldo() - empleado.get(i).getSueldo() * 0.1
													- (empleado.get(i).getSueldo() * 0.14))));

						}

					}
				}
					break;

				case 0: { // SALIR DE LA APLICACION
					salir = true;
					System.out.println(
							"Salida del programa\n\nGracias por usar esta aplicacion:\n\nCreadores:\nMateo Castro\nCristian Paez\nRodrigo Zuniga");
					in.close();
				}
					break;
				default:
					System.out.println("La opcion ingresada no es valida, intenta nuevamente");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("El valor introducido no es valido, Intente nuevamente");
				in.next();
			}
			in.ioException();
		}

	}

}
