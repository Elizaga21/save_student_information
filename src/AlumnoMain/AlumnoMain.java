package AlumnoMain;

import java.util.Scanner;

public class AlumnoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre, ciclo;
        int curso, NIA;

        System.out.print("Introduce los datos del Alumno 1: " );
        System.out.print("\nNombre:");
        nombre = sc.nextLine();
        System.out.print("Ciclo:");
        ciclo = sc.nextLine();
        System.out.print("Curso:");
        curso = sc.nextInt();
        System.out.print("NIA:");
        NIA = sc.nextInt();

        Alumno A1 = new Alumno(nombre,ciclo, curso, NIA);

        System.out.print("Introduce los datos del Alumno 2: " );
        System.out.print("\nNombre:");
        nombre = sc.next();
        System.out.print("Ciclo:");
        ciclo = sc.next();
        System.out.print("Curso:");
        curso = sc.nextInt();
        System.out.print("NIA:");
        NIA = sc.nextInt();

         Alumno A2 = new Alumno(nombre, ciclo, curso, NIA);

         System.out.println("Alumno 1: " + "   Nombre:" + A1.getnombre() + " NIA:" + A1.getNIA() +
                 " Ciclo:" + A1.getciclo() + " Curso:" + A1.getcurso());

         System.out.println("Alumno 2: " + "   Nombre:" + A2.getnombre() + " NIA:" + A2.getNIA() +
                 " Ciclo:" + A2.getciclo() + " Curso:" + A1.getcurso());



    }
}
