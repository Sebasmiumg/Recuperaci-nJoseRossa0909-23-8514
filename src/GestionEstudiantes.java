import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionEstudiantes {
    public static List<Estudiante> listaEstudiantes=new ArrayList<>();//para crear un array que tenga nombre listaEstudiantes para usarlo en los metodos siguientes

    public static void crearListEstudiantes() {

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Ingrese el nombre del estudiante " + (i + 1) + ": ");
            String nombre = sc.nextLine();//pedimos cada uno de los atributos que nos pide el objeto

            System.out.println("Ingrese el apellido del estudiante " + (i + 1) + ": ");
            String apellido = sc.nextLine();

            System.out.println("Ingrese la calificacion entre el 1 al 10 del estudiante " + (i + 1) + ": ");
            int calificacion = Integer.parseInt(sc.nextLine());//consumir caracter de nueva linea

            Estudiante estudiante = new Estudiante(nombre, apellido, calificacion);//Creamos un objeto con los atributos dados con anterioridad
            listaEstudiantes.add(estudiante);//Los metemos en el array listaEstudiantes
        }
    }

    public static void listarEstudiantes() {
        System.out.println("Lista de estudiantes: ");
        for (Estudiante estudiante:listaEstudiantes) {//para acabar el ciclo no tiene que haber mas objetos en el array
            System.out.println("Nombre: "+estudiante.getNombre()+" "+"\n"+//Presentamos por pantalla todos los objetos del array
                    "Calificacion: "+estudiante.getCalificacion());
        }
    }
}
