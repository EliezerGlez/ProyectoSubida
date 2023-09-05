import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el radio del círculo
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        // Calcular el área del círculo utilizando la fórmula A = PI * r^2
        double area = Math.PI * Math.pow(radio, 2);

        // Mostrar el resultado
        System.out.println("El área del círculo con radio " + radio + " es: " + area);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}


