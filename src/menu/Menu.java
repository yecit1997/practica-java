package menu;

import java.util.Scanner;
import persona.CacturaInformacionPersona;
import persona.Persona;

public class Menu {

    // Creación de instancia de clases
    Scanner scanner = new Scanner(System.in);
    CacturaInformacionPersona capturarInfo = new CacturaInformacionPersona();
    Persona persona = null;  // Inicialmente, la instancia de Persona es null

    public void menu() {
        int opcion;
        boolean continuar;

        do {
            System.out.println("""
                    --------------------------------------------
                                BIENVENIDO AL SISTEMA
                    --------------------------------------------
                    
                    1. Ingresar datos de la persona
                    2. Ver los datos de la persona
                    
                    Elige una opción (1-2):
                    """);

            opcion = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea pendiente

            switch (opcion) {
                case 1:
                    persona = capturarInfo.capturarDatos();  // Capturar y almacenar los datos
                    break;
                case 2:
                    capturarInfo.mostrarDatosPersona(persona);  // Mostrar los datos usando el nuevo método
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }

            System.out.print("¿Deseas continuar? (sí = 1 / no = 0): ");
            continuar = scanner.nextInt() == 1;
            scanner.nextLine();  // Consumir la nueva línea pendiente
        } while (continuar);

        System.out.println("¡Hasta luego!");
        scanner.close();
    }
}
