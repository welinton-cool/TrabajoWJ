
package ec.edu.ec.trabajogrupalsj;


public class TrabajoGrupalSJ {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

        double primerParcial, segundoParcial, examenCalificacion = 0, total;

       
        do {
            System.out.print("Ingrese la nota del primer parcial (0 - 10): ");
            primerParcial = sc.nextDouble();
        } while (primerParcial < 0 || primerParcial > 10);

        do {
            System.out.print("Ingrese la nota del segundo parcial (0 - 10): ");
            segundoParcial = sc.nextDouble();
        } while (segundoParcial < 0 || segundoParcial > 10);

        total = primerParcial + segundoParcial;

        if (primerParcial >= 7 && segundoParcial >= 7 && total >= 14) {
            System.out.println(" ¡Felicidades! Aprobaste directamente con un total de " + total);
        } else {
            System.out.println(" ️ No alcanzaste los requisitos mínimos. Debes rendir el examen de calificación.");

            do {
                System.out.print("Ingrese la nota del examen de calificación (0 - 10): ");
                examenCalificacion = sc.nextDouble();
            } while (examenCalificacion < 0 || examenCalificacion > 10);

            total += examenCalificacion;

            // Asegurarse de que el total no pase de 20
            if (total > 20) {
                total = 20;
            }

            if (total >= 14) {
                System.out.println(" ¡Aprobaste con el examen de calificación! Total final: " + total);
            } else {
                System.out.println(" Reprobaste. Tu total final es: " + total);
            }
        }

        sc.close();
    }
}
    

 
    

