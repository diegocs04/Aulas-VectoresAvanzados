package aulaVectoresAvanzados;

public class StartAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Aula clase1 = new Aula();
		
		Alumno vilo = new Alumno("Vilo", "Putero", 643543454);
		Alumno diego = new Alumno("Diego", "Crack", 637583553);
		Alumno ach = new Alumno("Ach", "Kaka", 612542754);
		Alumno checa = new Alumno("Checa", "Lopez", 612542754);
		Alumno viti = new Alumno("Viti", "Poper", 612542754);

		
		Asignatura lengua = new Asignatura("Lengua");
		Asignatura mate = new Asignatura("Matemáticas");
		Asignatura bio = new Asignatura("Biología");
		Asignatura fisica = new Asignatura("Física");
		
		clase1.addAlumno(ach);
		clase1.addAlumno(diego);
		clase1.addAlumno(checa);
		clase1.addAlumno(vilo);
		clase1.addAlumno(viti);

		
		
		System.out.println(clase1);
	}

}
