import java.util.Scanner;

public class MainEjercicioUno {
    public static void main() {

        Scanner scanner = new Scanner(System.in);
            int num1,num2,opcion,resultado;
            System.out.print("Por favor, ingresa el numero 1: ");
            num1 = scanner.nextInt();
            System.out.print("Por favor, ingresa el numero 2: ");
            num2 = scanner.nextInt();
            System.out.print("""
                            Que operacion desea realizar:\s
                            1.Suma
                            2.Resta
                            3.Multiplicar
                            4.Dividir
                        """);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("El resultado de " + num1+" + "+num2+" es "+resultado);
                    break;
                case 2:
                    resultado = num1 - num2;
                    System.out.println("El resultado de " + num1+" - "+num2+" es "+resultado);
                    break;
                case 3:
                    resultado = num1 * num2;
                    System.out.println("El resultado de " + num1+" * "+num2+" es "+resultado);
                    break;
                case 4:
                    resultado = num1 / num2;
                    System.out.println("El resultado de " + num1+" / "+num2+" es "+resultado);
                    break;
                default:
                    System.out.println("OPERACION INVALIDA");
            }
        }
}

