
public class Pelis {
	//Atributos
	String nombre;
	String director;
	String genero;
	int a�o;
	String Protagonista;
	int horas;
	
	// Contructor vacio
	
	public Pelis() {
	}
	
	// Contructor con todos los parametros
	public Pelis(String nombre, String director, String genero, int a�o, String protagonista, int horas) {
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.a�o = a�o;
		Protagonista = protagonista;
		this.horas = horas;
	}

	 //Metodo toString
	@Override
	public String toString() {
		return "Pelis [nombre=" + nombre + ", director=" + director + ", genero=" + genero + ", a�o=" + a�o
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
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
