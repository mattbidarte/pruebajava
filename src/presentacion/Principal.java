package presentacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Principal {
	
	static void menu() {
		System.out.println("GIMNASIO\n"
				+ "1. Alta Socio\n"
				+ "2. Alta Clase\n"  
				+ "3. Alta Inscripción\n"
				+ "4. Borrar Inscripcion\n"
				+ "5. Info de Clase\n"
				+ "6. Socios de una Clase\n"
				+ "7. Salir\n"
				+ "8. OPCIÓN: ");	
		
	}
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		menu();
		int opcion = Integer.parseInt(entrada.nextLine()); // captura la entrada y la convierte a int
		while(opcion!=7) {
			switch (opcion) {
		  		case 1:
		  			//agregarSocio();
		  			break;
		  		case 2:
		  			//agregarClase();
		  			break;
		  		case 3:
		  			//agregarInscripcion();
		  			break;
		  		case 4:
		  			//borrarInscripcion();
		  			break;
		  		case 5:
		  			//infoClase();
		  			break;
		  		case 6:
		  			//infoSocios();
		  			break;
			}
			menu();
			if(entrada.hasNextLine()) {  //Ve si hay una linea disponible antes de leer con NextLine
				opcion = Integer.parseInt(entrada.nextLine());
			}
		}
		entrada.close();
	}

}
