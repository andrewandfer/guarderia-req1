import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
//class main
public class Main {
    public static void main(String[] args) {
        Guarderia pedro = new Guarderia();
        int opcion;

        do {
            String menu = "1. Ingresar estudiante\n" +
                    "2. Buscar estudiante por ID\n" +
                    "3. Listar todos los estudiantes\n" +
                    "4. Actualizar estudiante\n" +
                    "5. Salir";

            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
//swich para elegir opcion
            switch (opcion) {
                case 1:
                    ingresarEstudiante(pedro);
                    break;
                case 2:
                    buscarEstudiante(pedro);
                    break;
                case 3:
                    listarEstudiantes(pedro);
                    break;
                case 4:
                    actualizarEstudiante(pedro);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 5);
    }

//metodo para ingresar estudiante
    public static void ingresarEstudiante(Guarderia miGuarderia) {
        try {
            String id = JOptionPane.showInputDialog("Ingrese ID del estudiante:");
            String nombre = JOptionPane.showInputDialog("Ingrese nombre del estudiante:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad del estudiante:"));
            String genero = JOptionPane.showInputDialog("Ingrese género del estudiante:");
            String alergias = JOptionPane.showInputDialog("Ingrese alergias (si no tiene, deje en blanco):");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente:");
            String numeroAcudiente = JOptionPane.showInputDialog("Ingrese teléfono del acudiente:");

//metodo para agregar
            miGuarderia.agregarEstudiante(new Estudiante(nombre, "m", 18, id, alergias, nombreAcudiente, numeroAcudiente));
            JOptionPane.showMessageDialog(null, "Estudiante ingresado.");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error. Intente de nuevo.");
        }
    }
//metodo para buscar
    public static void buscarEstudiante(Guarderia miGuarderia) {
        String id = JOptionPane.showInputDialog("Ingrese ID del estudiante a buscar:");
        Estudiante estudianteBuscdo = miGuarderia.buscarEstudiante(id);

        if(estudianteBuscdo != null) {
            JOptionPane.showMessageDialog(null, "Estudiante buscado exitosamente.");
            JOptionPane.showMessageDialog(null, estudianteBuscdo.toString());

        }else{
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }
//metodo para mostrar
    public static void listarEstudiantes(Guarderia miGuarderia) {
        if (miGuarderia.verEstudiantes().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay estudiantes registrados.");
        } else {
            StringBuilder lista = new StringBuilder("Lista de Estudiantes:\n");
            for (Estudiante est : miGuarderia.verEstudiantes()) {
                lista.append(est.toString());
            }
            JOptionPane.showMessageDialog(null, lista.toString());
        }
    }
//metodo ´para actualizar
    public static void actualizarEstudiante(Guarderia miGuarderia) {

        String id = JOptionPane.showInputDialog("Ingrese ID del estudiante a actualizar:");
        Estudiante estudianteBuscado = miGuarderia.buscarEstudiante(id);

        if(estudianteBuscado != null) {
            JOptionPane.showMessageDialog(null, "Estudiante encontrado exitosamente: \n" +
                    estudianteBuscado.toString() + "\n" +
                    "\n" +
                    "Por favor ingrese la opcion del dato que desea actualizar. \n" +
                    "1.Nombre\n" +
                    "2.Edad\n" +
                    "3.Alergias\n" +
                    "4.Nombre Acudiente\n" +
                    "5.Telefono Acudiente\n");
            int opcion2= Integer.parseInt(JOptionPane.showInputDialog("Opcion: "));

            switch (opcion2) {
                case 1:
                    String nombreNuevo = JOptionPane.showInputDialog("Ingrese el  nombre del estudiante:");
                    estudianteBuscado.setNombre(nombreNuevo);
                    miGuarderia.actualizarEstudiante(estudianteBuscado);
                    break;
                case 2:
                    int edadNueva = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la  edad"));
                    estudianteBuscado.setEdad(edadNueva);
                    miGuarderia.actualizarEstudiante(estudianteBuscado);
                    break;
                case 3:
                    String alergiasNuevas = JOptionPane.showInputDialog("Ingrese las alergias del estudiante:");
                    estudianteBuscado.setAlergias(alergiasNuevas);
                    miGuarderia.actualizarEstudiante(estudianteBuscado);
                    break;
                case 4:
                    String nombreAcudienteNuevo = JOptionPane.showInputDialog("Ingrese el nombre del acudiente:");
                    estudianteBuscado.setNombreAcudiente(nombreAcudienteNuevo);
                    miGuarderia.actualizarEstudiante(estudianteBuscado);
                    break;
                case 5:
                    String numeroAcudienteNuevo = JOptionPane.showInputDialog("Ingrese el numero del acudiente:");
                    estudianteBuscado.setNumeroAcudiente(numeroAcudienteNuevo);
                    miGuarderia.actualizarEstudiante(estudianteBuscado);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida. Intente de nuevo.");
            }

            JOptionPane.showMessageDialog(null, "Estudiante actualizado exitosamente.");
        }else{
            JOptionPane.showMessageDialog(null, "Estudiante no encontrado.");
        }
    }
}