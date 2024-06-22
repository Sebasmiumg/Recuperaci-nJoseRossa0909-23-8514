import java.util.Scanner;

public class MenuDeEjercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            MainEjercicioUno examen = new MainEjercicioUno();
            GestionEstudiantes gestion = new GestionEstudiantes();
        // Menu
        System.out.println("""
                Selecciona un ejercicio:\s
                1. Calculadora
                2. Listar Estudiantes
               Ingresa el número de ej;ercicio que deseas ejecutar:""");

        // Leer la opción seleccionada por el usuario
        int opcion = scanner.nextInt();//declaramos variable entera opcion y le asignamos el valor que meta el usuario
        scanner.nextLine();//Limpiar buffer
        // Ejecutar el ejercicio seleccionado
        switch (opcion){
            case 1:
                examen.main();
                break;
            case 2:
                gestion.crearListEstudiantes();//llamamos los metodos de otra clase publica de esta manera
                gestion.listarEstudiantes();
    }
}
}


