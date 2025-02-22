import java.util.ArrayList;
import java.util.Scanner;
    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Guarderia guarderia = new Guarderia("Mi Guardería", "123456789");
            guarderia.setListEstudiantes(new ArrayList<>());

            int opcion;
            do {
                System.out.println("----- Menú de Guardería -----");
                System.out.println("1. Agregar Estudiante");
                System.out.println("2. Eliminar Estudiante");
                System.out.println("3. Actualizar Estudiante");
                System.out.println("4. Listar Estudiantes");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                scanner.nextLine();

                switch (opcion) {
                    case 1:
                        // Agregar Estudiante
                        guarderia.agregarEstudiante(new Estudiante("Juan Pérez", "masculino", 15, "123456",
                                "Ninguna", "María Pérez", "3123456789"));
                        break;

                    case 2:
                        // Eliminar Estudiante
                        guarderia.eliminarEstudiante(new Estudiante("Juan Pérez", "masculino", 15, "123456",
                                "Ninguna", "María Pérez", "3123456789"));
                        break;

                    case 3:
                        // Actualizar Estudiante
                        guarderia.actualizarEstudiante(new Estudiante("Juan Pérez", "masculino", 15, "123456",
                                "Ninguna", "María Pérez", "3123456789"));
                        break;

                    case 4:
                        // Listar Estudiantes
                        guarderia.listarEstudiantes();
                        break;

                    case 5:
                        System.out.println("Saliendo del programa...");
                        break;

                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } while (opcion != 5);

            scanner.close();
        }
    }