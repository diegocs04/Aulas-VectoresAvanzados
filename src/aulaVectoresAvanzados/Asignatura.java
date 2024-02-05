package aulaVectoresAvanzados;

public class Asignatura {

	private String nombre;
	private int nota1;
	private int nota2;
	private int nota3;

	public Asignatura(String nombre) {
		this.nombre = nombre;
		nota1 = notaAleatoria();
		nota2 = notaAleatoria();
		nota3 = notaAleatoria();

	}
	
	public int notaAleatoria() {
		int nota = (int)(Math.random()*11);
		return nota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int asignatura, int nota1) {
		this.nota1=nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int asignatura,int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int asignatura, int nota3) {
		this.nota3 = nota3;
	}

	@Override
	public String toString() {
		return " => NOMBRE = " + nombre + ", NOTA PRIMER TRIM. = " + nota1 + ", NOTA SEGUNDO TRIM. = " 
				+ nota2 + ",NOTA TERCER TRIM.  = " + nota3;
	}
	
	

}
