import java.time.LocalDate;

public class Main {



        public static void main(String[] args) {
                Empleado empleado1= new Empleado("1067599979","pedro elias","gerente","pelias@uqvirtual.edu.co","3145077280", LocalDate.now());
                Empresa empresa = new Empresa("juan valdez");
                empresa.agregarEmpleado(empleado1);
                empresa.eliminarEmpleado("1067599979");

        }

}