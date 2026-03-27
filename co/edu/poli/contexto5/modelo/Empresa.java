package co.edu.poli.contexto5.modelo;

public class Empresa {
    private Personal personal;
    private int anioCreacion;
    private String encargado; // Encargado
    private String producto;
    private final String correo;//no se cambia
    private String sede;
    private String nombreEmpresa;
    private String fecha;
    private String servicio;

    public Empresa(Personal personal, int anioCreacion, String encargado, String producto,
                    String correo, String sede, String nombreEmpresa, String fecha, String servicio) {
        this.personal = personal;
        this.anioCreacion = anioCreacion;
        this.encargado = encargado;
        this.producto = producto;
        this.correo = correo;
        this.sede = sede;
        this.nombreEmpresa = nombreEmpresa;
        this.fecha = fecha;
        this.servicio = servicio;
    }

    public Personal getPersonal() { return personal; }
    public void setPersonal(Personal personal) { this.personal = personal; }

    public int getAnioCreacion() { return anioCreacion; }
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public String getProducto() { return producto; }
    public void setProducto(String producto) { this.producto = producto; }

    public String getCorreo() { return correo; }
    

    public String getSede() { return sede; }
    public void setSede(String sede) { this.sede = sede; }

    public String getNombreEmpresa() { return nombreEmpresa; }
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getServicio() { return servicio; }
    public void setServicio(String servicio) { this.servicio = servicio; }

    public int calcularAnioEmpresa(String aniosActual) {
        return Integer.parseInt(aniosActual) - anioCreacion;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "personal=" + personal +
                ", anioCreacion=" + anioCreacion +
                ", encargado='" + encargado + '\'' +
                ", producto='" + producto + '\'' +
                ", correo='" + correo + '\'' +
                ", sede='" + sede + '\'' +
                ", nombreEmpresa='" + nombreEmpresa + '\'' +
                ", fecha='" + fecha + '\'' +
                ", servicio='" + servicio + '\'' +
                '}';
    }
}
