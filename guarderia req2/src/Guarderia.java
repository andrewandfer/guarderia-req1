import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

// Clase que representa una guardería
public class Guarderia {
    private String Nombre; // Nombre de la guardería
    private String Nit; // Número de identificación tributaria de la guardería
    private List<Estudiante> listaEstudiantes = new ArrayList<>(); // Lista de estudiantes en la guardería

    // Constructor vacío
    public Guarderia() {}

    // Constructor que inicializa el nombre y el NIT de la guardería
    public Guarderia(String nombre, String nit) {
        this.Nombre = nombre;
        this.Nit = nit;
    }

    // Método para obtener el nombre de la guardería
    public String getNombre() {
        return Nombre;
    }

    // Método para establecer el nombre de la guardería
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    // Método para obtener el NIT de la guardería
    public String getNit() {
        return Nit;
    }

    // Método para establecer el NIT de la guardería
    public void setNit(String nit) {
        Nit = nit;
    }

    // Método para agregar un nuevo estudiante a la lista
    public void agregarEstudiante(Estudiante nuevoEstudiante) {
        boolean idExistente = false; // Variable para verificar si el ID ya existe

        // Verifica si el ID del nuevo estudiante ya existe en la lista
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getId().equals(nuevoEstudiante.getId())) { // Se corrige el error de comparación
                idExistente = true;
                break;
            }
        }

        // Si el ID ya existe, muestra un mensaje de error
        if (idExistente) {
            JOptionPane.showMessageDialog(null, "Error: El ID del estudiante ya existe. Ingrese un ID único.");
        } else {
            // Si el ID es único, agrega el estudiante a la lista y muestra un mensaje de éxito
            listaEstudiantes.add(nuevoEstudiante);
            JOptionPane.showMessageDialog(null, "Estudiante agregado correctamente.");
        }
    }

    // Método para actualizar la información de un estudiante
    public void actualizarEstudiante(Estudiante estudiante) {
        boolean esActualizado = false; // Variable para verificar si se actualizó el estudiante
        // Busca el estudiante en la lista
        for (Estudiante estudiante1 : listaEstudiantes) {
            if (estudiante1.getId().equals(estudiante.getId())) { // Si se encuentra el estudiante
                // Actualiza la información del estudiante
                estudiante1.setNombre(estudiante.getNombre());
                estudiante1.setEdad(estudiante.getEdad());
                estudiante1.setGenero(estudiante.getGenero());
                estudiante1.setAlergias(estudiante.getAlergias());
                estudiante1.setNombreAcudiente(estudiante.getNombreAcudiente());
                estudiante1.setNumeroAcudiente(estudiante.getNumeroAcudiente());
                esActualizado = true; // Marca que se actualizó
                break; // Sale del bucle
            } else {
                esActualizado = false; // Si no se encuentra, se marca como no actualizado
            }
        }
    }

    // Método para buscar un estudiante por su ID
    public Estudiante buscarEstudiante(String Id) {
        Estudiante estudiantebus = null; // Inicializa el estudiante buscado como null
        // Busca el estudiante en la lista
        for (Estudiante estudiante1 : listaEstudiantes) {
            if (estudiante1.getId().equals(Id)) { // Si se encuentra el estudiante
                estudiantebus = estudiante1; // Asigna el estudiante encontrado
                break; // Sale del bucle
            }
        }
        return estudiantebus; // Retorna el estudiante encontrado o null si no se encontró
    }

    // Método para eliminar un estudiante de la lista
    public void eliminarEstudiante(Estudiante estudiante) {
        listaEstudiantes.remove(estudiante); // Elimina el estudiante de la lista
    }

    // Método para ver la lista de estudiantes
    public List<Estudiante> verEstudiantes() {
        return listaEstudiantes; // Retorna la lista de estudiantes
    }

    // Método para representar la guardería como una cadena
    @Override
    public String toString() {
        return "Guarderia{" +
                "Nombre='" + Nombre + '\'' +
                ", Nit='" + Nit + '\'' +
                '}'; // Retorna una representación en forma de cadena de la guardería
    }
}