package aulaVectoresAvanzados;

import java.util.Arrays;

public class Aula {

	private Alumno alumnos[];
	private int contador;
	
	public Aula() {
		
		alumnos = new Alumno[5];
	}
	
	public void addAlumno(Alumno alumnaco) {
		if (contador < 5) {
			alumnos[contador] = alumnaco;
			contador++;
		}
	}

	@Override
	public String toString() {
		return "AULA => \nAlumnos" + Arrays.toString(alumnos);
	}
	
	
	
}
