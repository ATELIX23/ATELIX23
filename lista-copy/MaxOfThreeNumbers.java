
import java.util.Scanner;

public class MaxOfThreeNumbers {

    public static void main(String[] args) {
        // Crear un Scanner para leer entrada de usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar tres números al usuario
        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        // Llamar al método que encuentra el mayor número
        int maxNumber = findMax(num1, num2, num3);

        // Mostrar el resultado
        System.out.println("El número mayor es: " + maxNumber);

        // Cerrar el scanner
        scanner.close();
    }

    /**
     * Método auxiliar que devuelve el mayor de tres números.
     * 
     * @param a Primer número
     * @param b Segundo número
     * @param c Tercer número
     * @return El mayor de los tres números
     */
    private static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c)); // Uso de Math.max para simplificar
    }
}
