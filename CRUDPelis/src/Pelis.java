
public class Pelis {
	//Atributos
	String nombre;
	String director;
	String genero;
	int año;
	String Protagonista;
	int horas;
	
	// Contructor vacio
	
	public Pelis() {
	}
	
	// Contructor con todos los parametros
	public Pelis(String nombre, String director, String genero, int año, String protagonista, int horas) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.año = año;
		Protagonista = protagonista;
		this.horas = horas;
	}

	 //Metodo toString
	@Override
	public String toString() {
		return "Pelis [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", año=" + año
				+ ", Protagonista=" + Protagonista + ", horas=" + horas + "]";
	}

	//Encapsulamiento
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public String getProtagonista() {
		return Protagonista;
	}

	public void setProtagonista(String protagonista) {
		Protagonista = protagonista;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}
	
	
	
	
	
	
	
	
	
}
