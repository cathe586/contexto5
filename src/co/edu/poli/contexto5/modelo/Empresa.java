package co.edu.poli.contexto5.modelo;

/**
 * Representa la entidad Empresa y gestiona su información general y personal asociado.
 * @author cathe586
 */
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

    /**
     * Constructor para inicializar todos los atributos de la Empresa.
     */
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

    /** @return El personal asociado a la empresa */
    public Personal getPersonal() { return personal; }
    /** @param personal El nuevo personal a asignar */
    public void setPersonal(Personal personal) { this.personal = personal; }

    /** @return El año de creación de la empresa */
    public int getAnioCreacion() { return anioCreacion; }
    /** @param anioCreacion El nuevo año de creación */
    public void setAnioCreacion(int anioCreacion) { this.anioCreacion = anioCreacion; }

    /** @return El nombre del encargado */
    public String getEncargado() { return encargado; }
    /** @param encargado El nuevo encargado a asignar */
    public void setEncargado(String encargado) { this.encargado = encargado; }

    /** @return El producto principal de la empresa */
    public String getProducto() { return producto; }
    /** @param producto El nuevo producto a asignar */
    public void setProducto(String producto) { this.producto = producto; }

    /** @return El correo electrónico (final) de la empresa */
    public String getCorreo() { return correo; }
    
    /** @return La sede de la empresa */
    public String getSede() { return sede; }
    /** @param sede La nueva sede a asignar */
    public void setSede(String sede) { this.sede = sede; }

    /** @return El nombre de la empresa */
    public String getNombreEmpresa() { return nombreEmpresa; }
    /** @param nombreEmpresa El nuevo nombre a asignar */
    public void setNombreEmpresa(String nombreEmpresa) { this.nombreEmpresa = nombreEmpresa; }

    /** @return La fecha de registro o referencia */
    public String getFecha() { return fecha; }
    /** @param fecha La nueva fecha a asignar */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /** @return El servicio que presta la empresa */
    public String getServicio() { return servicio; }
    /** @param servicio El nuevo servicio a asignar */
    public void setServicio(String servicio) { this.servicio = servicio; }

    /**
     * Calcula la antigüedad de la empresa basándose en el año actual.
     * @param aniosActual El año actual en formato String.
     * @return La diferencia entre el año actual y el de creación.
     */
    public int calcularAnioEmpresa(String aniosActual) {
        return Integer.parseInt(aniosActual) - anioCreacion;
    }

    /**
     * Retorna una cadena con toda la información de la Empresa.
     */
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