
package ec.edu.ec.trabajogrupalsj;

import java.util.Scanner;


public class TrabajoGrupalSJ {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

        double sumaCiclo = 0;
        int notas = 2;

        System.out.println("Ingrese el promedio de los 2 ciclos :");

        for (int i = 1; i <= notas; i++) {
            System.out.print("Nota " + i + " : ");
            double nota = scanner.nextDouble();

            if (nota < 0 || nota > 18) {
                System.out.println("Nota inválida. Intente de nuevo.");
                i--;
                continue;
            }

            sumaCiclo += nota;
        }
        double promedioCiclos = sumaCiclo / notas;

        System.out.printf("La suma total de los 2 ciclos: %.2f ", sumaCiclo);
        System.out.printf("El promedio de los 2 ciclos: %.2f ", promedioCiclos);

        if (promedioCiclos >= 18 && promedioCiclos <= 20) {
            System.out.println("Excelente, pasaste el semestre con honores ");
        } else if (promedioCiclos >= 14 && promedioCiclos < 17) {
            System.out.println("Aprobado, lo hiciste bien ");
        } else if (promedioCiclos >= 8 && promedioCiclos < 13) {
            System.out.println("Suspenso, vaya a seguir estudiando para las pruebas de recuperación ");
        } else {
            System.out.println("Reprobado, tienes que repetir esta materia como lo hizo el Anthony , Valencia , Jennifer ");
        }

        System.out.print("¿Deseas ingresar la nota del examen final para ver si apruebas? (si/no): ");
        char respuesta = scanner.next().charAt(0);

        if (respuesta == 's' && respuesta == 'S') {
            System.out.print("Ingrese la nota del examen final: ");
            double notaExamen = scanner.nextDouble();

            if (notaExamen < 0 && notaExamen > 9) {
                System.out.println("Nota inválida. Debe estar entre 0 y 10.");
            } else {
                double sumaFinal = promedioCiclos + notaExamen;
                System.out.println("La suma total incluyendo con el examen es: " + sumaFinal);

                if (sumaFinal >= 13) {
                    System.out.println("Felicidades! Has aprobado la materia con el examen.");
                } else {
                    System.out.println("Reprobado, tienes que repetir esta materia como lo hizo el Anthony y Valencia , Jennifer");
                }
            }
        }
    }
}
            
        