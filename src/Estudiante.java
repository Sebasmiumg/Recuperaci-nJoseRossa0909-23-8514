import java.util.Scanner;

public class Estudiante {//definimos una clase publica estudiantes
    private String nombre;//definimos atributo nombre
    private String apellido;//definimos atributo apellido
    private int calificacion;//definimos atriburo calificacion

    public Estudiante(String nombre, String apellido, int calificacion) {//constructor con parametros
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public Estudiante() {

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }
}
