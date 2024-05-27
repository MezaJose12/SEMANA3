import java.util.Scanner;

public class Codigo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer nombre: ");
        String primerNombre = scanner.nextLine();
        
        System.out.print("Ingrese el segundo nombre: ");
        String segundoNombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        String usuario = generarUsuario(primerNombre, segundoNombre, apellido);

        System.out.println("El nombre de usuario generado es: " + usuario);
        
        scanner.close();
    }

    public static String generarUsuario(String primerNombre, String segundoNombre, String apellido) {
        
        String inicialPrimerNombre = primerNombre.substring(0, 1).toLowerCase();
        String inicialSegundoNombre = segundoNombre.substring(0, 1).toLowerCase();
        String apellidoMinuscula = apellido.toLowerCase();

        return inicialPrimerNombre + inicialSegundoNombre + apellidoMinuscula;
    }
}