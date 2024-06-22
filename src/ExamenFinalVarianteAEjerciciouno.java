public class ExamenFinalVarianteAEjerciciouno {
    public static void Calculadora() {
    }
    public void calculadora(int num1, int num2, char operador) {
        int resultado = 0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }
        System.out.println("Resultado: " + resultado);
    }

}
