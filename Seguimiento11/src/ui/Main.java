package ui;
import java.util.Scanner;

import model.Curso;
import model.Estudiante;


public class Main {

	private Scanner sc;
	private Curso curso;

	public Main() {

		sc = new Scanner(System.in);
		curso = new Curso("Curso Apo 2",0);

	}

	public static void main(String[] args) {

		Main main = new Main();


		System.out.println("\n CURSO APO 2");

		int option = 0;

		do{

			main.menu();

		} while(option != 0);
	}


	public void menu() {

		int option = 0;

		System.out.println("\n___Main Menu___\n\n"
				+ " Select an option \n \n"
				+ "1) Add Estudent \n"
				+ "2) Add Estudent In Order \n"
				+ "3) Print Student list \n"
				+ "4) Remove Estudent \n"
				+ "0) Exit aplication \n"
				);

		option = sc.nextInt();
		sc.nextLine();

		do{

			switch(option) {

			default:

				System.out.println("Invalid option");
				menu();
				break;

			case 1:
				addStudent(option);
				menu();
				break;

			case 2:
				addStudent(option);
				menu();
				break;

			case 3:
				System.out.println(curso.pintarEstudiante());
				menu();
				break;
				
			case 4:
				borrarElemento();
				menu();
				break;

			case 0:
				System.out.println("\n END OF PROGRAM \n");
				System.exit(0);
				break;

			}
		} while (option != 0);

	}

	public void addStudent(int n) {


		System.out.print("Input student name: ");
		String nombre = sc.nextLine();
		System.out.print("Input student code: ");
		String codigo = sc.nextLine();

		Estudiante estudiante = new Estudiante(codigo, nombre);



		if(n == 1) {

			System.out.print(curso.addEstudiante(estudiante));
			System.out.println("Cantidad total de estudiantes: " + curso.getTotalEstudiantes() + "\n");

		} else {

			System.out.print(curso.addEstudianteOrdenamiento(estudiante));
			System.out.println("Cantidad total de estudiantes: " + curso.getTotalEstudiantes() + "\n");
		}


	}

	
	public void borrarElemento() {
		
		
		
		System.out.println("Ingrese el nombre del estudiante que quiera eliminar");
		String nombre = sc.nextLine();
		
	
		System.out.println("\n Cantidad de estudiantes eliminados: " + curso.eliminarEstudiante(nombre) + "\n");
	}
	

}


