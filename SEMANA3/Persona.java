import java.util.Scanner;
public class Persona{
    public static void main(String[] args) {
        Codigo objeto = new Codigo();
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
        objeto1.setIdPersona(idPersona);

        String usuario;
        usuario = generar(nombre1,nombre2,apellido);

        System.out.println("Datos generados:");
        System.out.println("Usuario:" +usuario);
        System.out.println("Idpersona:"+objeto1.getIdPersona());

    }

    private static String generar(String nombre1, String nombre2, String apellido) {

        String inicialNombre1 = nombre1.substring(0, 1).toLowerCase();
        String inicialNombre2 = nombre2.substring(0, 1).toLowerCase();
        String apellidoMinuscula = apellido.toLowerCase();

        return inicialNombre1 + inicialNombre2 + apellidoMinuscula;
    }
    
}