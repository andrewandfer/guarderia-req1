import java.util.LinkedList;

public class Empresa {

    private String nombre;
    private LinkedList<Empleado> empleados;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(LinkedList<Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public String toString() {
        return "El nombre de la empresa es: " + nombre;
    }

    public boolean verificarEmpleado(String identificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                return true;
            }
        }
        return false;
    }

    // Agregar un nuevo empleado
    public void agregarEmpleado(Empleado empleado) {
        if (!verificarEmpleado(empleado.getIdentificacion())) {
            empleados.add(empleado);
        } else {
            System.out.println("El empleado ya existe.");
        }
    }

    // Obtener la lista de empleados
    public void listarEmpleados() {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }

    // Modificar un empleado existente
    public void actualizarEmpleado(String identificacion, Empleado nuevoEmpleado) {
        for (int i = 0; i < empleados.size(); i++) {
            Empleado empleado = empleados.get(i);
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleados.set(i, nuevoEmpleado);
                System.out.println("Empleado actualizado.");
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    // Eliminar: Eliminar un empleado
    public void eliminarEmpleado(String identificacion) {
        for (Empleado empleado : empleados) {
            if (empleado.getIdentificacion().equals(identificacion)) {
                empleados.remove(empleado);
                System.out.println("Empleado eliminado.");
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }
}