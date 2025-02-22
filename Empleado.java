import java.time.LocalDate;

public class Empleado {

    private String identificacion;
    private String nombreCompleto;
    private String puesto;
    private String Correo;
    private String telefono;
    private LocalDate fechaContratacion;

    public Empleado(String identificacion, String nombreCompleto,String puesto,String Correo,String telefono,LocalDate fechaContratacion) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.Correo = Correo;
        this.telefono = telefono;
        this.fechaContratacion = fechaContratacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public LocalDate getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(LocalDate fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" + nombreCompleto +
                "identificacion='" + identificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", puesto='" + puesto + '\'' +
                ", Correo='" + Correo + '\'' +
                ", telefono='" + telefono + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                '}';
    }
}
