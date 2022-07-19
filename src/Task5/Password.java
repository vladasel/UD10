package Task5;

public class Password {
	private int longitud;
	private String contrasena;

	public Password() {
		this.longitud = 8;
		this.contrasena = "";
	}

	public Password(int longitud) {
		this.longitud = longitud;
		this.contrasena = generarPassword(longitud);
	}

	// falta por hacer
	public static String generarPassword(int longitud) {
		String psswd = "";
		return psswd;
	}

	// falta por hacer
	public boolean esFuerte() {
		return true;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

}
