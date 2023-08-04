import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		// Declarar variables
		String nombre;
		String director;
		String genero;
		int año;
		String Protagonista;
		int horas = 0;

		// Reserva de espacio en memoria

		Pelis pelicula = null;

		// Scanner -- Libreria-- Es un conjunto de clases desarrollados por alguien mas
		// que necesita toda aplicacion para que funcione correctamente
		Scanner lectura = null;

		// Declarar la lista
		List<Pelis> listPeliculas = new ArrayList<Pelis>();

		int menuP, indice, subMenu;
		boolean continua;

		do {
			
			String entrada;
			do {
			
			System.out.println("1---Alta");
			System.out.println("2---Buscar por indice");
			System.out.println("3---Editar datos por indice");
			System.out.println("4---Eliminar por indice");
			System.out.println("5---Mostrar las peliculas");
			System.out.println("6---Contar cuantos registros tengo");
			System.out.println("7---Buscar por nombre");
			System.out.println("8---Eliminar por nombre");
			System.out.println("9---Borrar todos los registros");
			System.out.println("10---Salir");

			lectura = new Scanner(System.in);
			entrada= lectura.nextLine();
			}while(!validarNum(entrada));
			
				menuP = Integer.parseInt(entrada);
				
			switch (menuP) {
			case 1:

				System.out.println("Ingrese el nombre de la pelicula");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				System.out.println("Ingrese el director");
				lectura = new Scanner(System.in);
				director = lectura.nextLine();

				System.out.println("Ingrese el genero");
				lectura = new Scanner(System.in);
				genero = lectura.nextLine();

				System.out.println("Ingrese el año");
				lectura = new Scanner(System.in);
				año = lectura.nextInt();

				System.out.println("Ingrese el protagonista");
				lectura = new Scanner(System.in);
				Protagonista = lectura.nextLine();

				System.out.println("Ingrese las horas que dura");
				lectura = new Scanner(System.in);
				horas = lectura.nextInt();

				// Guardar
				pelicula = new Pelis(nombre, director, genero, año, Protagonista, horas);
				listPeliculas.add(pelicula);
				System.out.println("Se guardo correctamente la pelicula \n" + pelicula.getNombre());

				break;

			case 2:
				System.out.println("Indice de las peliculas y nombre ");
				for (int i = 0; i < listPeliculas.size(); i++) {
					System.out.printf("\n[%d]" + listPeliculas.get(i).getNombre(), i);
				}

				// Busqueda

				do {
					try {
						continua = false;
						System.out.println("\nIngrese el indice de la pelicula a buscar");
						lectura = new Scanner(System.in);
						indice = lectura.nextInt();
						pelicula = listPeliculas.get(indice);
						System.out.println(
								"Se encontro pelicula del director " + pelicula.getDirector() + "\n" + pelicula);
					} catch (InputMismatchException ex) {
						System.out.println("No se encontro la pelicula, verifique sus datos");
						lectura.next();
						continua = true;
					}

				} while (continua);

				break;

			case 3:

				System.out.println("Indice de las peliculas y nombre ");
				for (int i = 0; i < listPeliculas.size(); i++) {
					System.out.printf("\n[%d]" + listPeliculas.get(i).getNombre(), i);
				}
				// Busqueda
				System.out.println("\nIngrese el indice de la pelicula a editar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();
				pelicula = listPeliculas.get(indice);
				System.out
						.println("Se encontro la pelicula con el director " + pelicula.getDirector() + "\n" + pelicula);

				do {
					System.out.println("SUBMENU EDITAR DATOS DE LA PELICULA");
					System.out.println("1---Año");
					System.out.println("2--Genero");
					System.out.println("3---Menu principal");

					lectura = new Scanner(System.in);
					subMenu = lectura.nextInt();

					switch (subMenu) {
					case 1:
						System.out.println("Ingrese el nuevo año");
						lectura = new Scanner(System.in);
						año = lectura.nextInt();

						// Actualizar dato
						pelicula.setAño(año);
						listPeliculas.set(indice, pelicula);
						System.out.println("Se edito correctamente");
						break;
					case 2:
						System.out.println("Ingrese el nuevo director");
						lectura = new Scanner(System.in);
						genero = lectura.nextLine();

						// Actualizar dato
						pelicula.setGenero(genero);
						;
						listPeliculas.set(indice, pelicula);
						System.out.println("Se edito correctamente");
						break;
					case 3:
						break;

					}

				} while (subMenu < 3);

				break;

			case 4:
				System.out.println("Indice de la pelicula y nombre ");
				for (int i = 0; i < listPeliculas.size(); i++) {
					System.out.printf("\n[%d]" + listPeliculas.get(i).getNombre(), i);
				}

				// Busqueda
				System.out.println("\nIngrese el indice la pelicula a eliminar");
				lectura = new Scanner(System.in);
				indice = lectura.nextInt();

				// Eliminar
				pelicula = listPeliculas.get(indice);
				listPeliculas.remove(indice);
				System.out.println("Se elimino la pelicula " + pelicula.getNombre());
				break;

			case 5:
				System.out.println(listPeliculas);
				break;

			case 6:
				System.out.println("Tengo " + listPeliculas.size() + " peliculas");

				break;

			case 7:

				System.out.println("Indice de la palicula y nombre ");
				for (int i = 0; i < listPeliculas.size(); i++) {
					System.out.printf("\n[%d]" + listPeliculas.get(i).getNombre(), i);
				}

				// Busqueda
				System.out.println("\nIngrese el nombre de la pelicula a buscar");
				lectura = new Scanner(System.in);
				nombre = lectura.nextLine();

				int contInd = 0;
				for (Pelis nombreb : listPeliculas) {
					if (nombreb.getNombre().equals(nombre)) {
						pelicula = listPeliculas.get(contInd);
						System.out.println("Pelicula encontrada : " + pelicula);
					}
					contInd++;
				}
				break;

			case 8:

				try {
					System.out.println("Indice de la palicula y nombre ");
					for (int i = 0; i < listPeliculas.size(); i++) {
						System.out.printf("\n[%d]" + listPeliculas.get(i).getNombre(), i);
					}

					// Busqueda
					System.out.println("\nIngrese el nombre de la pelicula a borrar");
					lectura = new Scanner(System.in);
					nombre = lectura.nextLine();

					int contIndb = 0;
					for (Pelis prod : listPeliculas) {
						if (prod.getNombre().equals(nombre)) {
							pelicula = listPeliculas.get(contIndb);
							System.out.println("Se elimino la pelicula " + pelicula.getNombre());
							listPeliculas.remove(contIndb);
						}
						contIndb++;
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

				break;

			case 9:
				listPeliculas.clear();
				System.out.println("Peliculas borradas");
				break;

			}

		} while (menuP < 10);

	}

	public static boolean validarNum(String dato) {
try {
	int convertirDato = Integer.parseInt(dato); //Convertir dato-formato
	return true;
	
}catch (NumberFormatException ex) {
	System.out.println("Error, Ingrese un numero");
	return false;
	
}

	}

}
