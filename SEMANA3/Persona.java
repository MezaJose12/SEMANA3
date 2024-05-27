import java.util.Scanner;
public class Persona{
    public static void main(String[] args) {
        Usuario objeto1 = new Usuario();
        Scanner leer = new Scanner(System.in);
        String nombre1,nombre2;
        String apellido;
        String idPersona;
        System.out.println("Ingrese su primer nombre:");
        nombre1=leer.next();
        System.out.println("Ingrese su segundo nombre:");
        nombre2=leer.next();
        System.out.println("Ingrese el apellido:");
        apellido=leer.next();
        System.out.println("Ingrese el idPersona:");
        idPersona=leer.next();
        objeto1.setNombre1(nombre1);
        objeto1.setNombre2(nombre2);
        objeto1.setApellido(apellido);
        System.out.println("Datos ingresados:"+objeto1.getNombre1());
        System.out.println("Datos ingresados:"+objeto1.getNombre2());
    }
}