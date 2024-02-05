package aulaVectoresAvanzados;

import java.util.Arrays;

public class Alumno {

	private String nombre;
	private String apellidos;
	private int telefono;
	private Asignatura asignatura[];
	private int contador;

	public Alumno(String nombre, String apellidos, int telefono) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.contador = 0;
		asignatura = new Asignatura[4];
		asignatura[0] = new Asignatura("PROG");
		asignatura[1] = new Asignatura("BBDD");
		asignatura[2] = new Asignatura("FOL");
		asignatura[3] = new Asignatura("ENTORNOS");


	}
	
	

	public void addAsignatura(Asignatura calificaciones) {

		if (contador < 5) {
			asignatura[contador] = calificaciones;
			contador++;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public Asignatura[] getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(Asignatura[] asignatura) {
		this.asignatura = asignatura;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}

	@Override
	public String toString() {
		return "\n NOMBRE = " + nombre + ", APELLIDOS = " + apellidos + ", TELÉFONO = " + telefono
				+ "|| [ASIGNATURAS]" + Arrays.toString(asignatura);
	}

}
