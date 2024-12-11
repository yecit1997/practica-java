package persona;

import java.util.Scanner;

public class CacturaInformacionPersona {

    Scanner scanner = new Scanner(System.in);

    public Persona capturarDatos() {
        System.out.print("Ingresa el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingresa el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingresa la edad: ");
        int edad = Integer.parseInt(scanner.nextLine()); // Hacemos un parceInt, para consumir la linea que queda cuando se captura un dato por consola

        // Instanciar y devolver la clase Persona con los parámetros capturados
        return new Persona(nombre, apellido, edad);
    }

    public void mostrarDatosPersona(Persona persona) {
        if (persona != null) {
            System.out.println("Datos de la persona:");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Apellido: " + persona.getApellido());
            System.out.println("Edad: " + persona.getEdad());
        } else {
            System.out.println("Primero ingresa los datos de la persona (opción 1).");
        }
    }
}
