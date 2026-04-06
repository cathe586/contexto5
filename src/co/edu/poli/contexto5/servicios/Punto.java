package co.edu.poli.contexto5.servicios;

/**
 * Representa un punto de control o ubicación geográfica dentro del sistema, 
 * vinculado a un encargado y una fecha de creación.
 * @author cathe586
 */
public class Punto {
    private String ubicacion;
    private String id;
    private String encargado; // Encargado
    private String aniocreacion;

    /**
     * Constructor para inicializar un Punto con su ubicación, identificación, 
     * encargado y año de creación.
     */
    public Punto(String ubicacion, String id, String encargado, String aniocreacion) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.encargado = encargado;
        this.aniocreacion = aniocreacion;
    }

    /** @return La ubicación geográfica del punto */
    public String getUbicacion() { return ubicacion; }
    /** @param ubicacion La nueva ubicación a asignar */
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    /** @return El ID único del punto */
    public String getId() { return id; }
    /** @param id El nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return El nombre o referencia del encargado */
    public String getEncargado() { return encargado; }
    /** @param encargado El nuevo encargado a asignar */
    public void setEncargado(String encargado) { this.encargado = encargado; }

    /** @return El año en que se creó el punto */
    public String getAniocreacion() { return aniocreacion; }
    /** @param aniocreacion El nuevo año de creación a asignar */
    public void setAniocreacion(String aniocreacion) { this.aniocreacion = aniocreacion; }

    /**
     * Retorna un mensaje con la edad calculada del punto basándose en el año proporcionado.
     * @param anioscreacion Año de referencia para el cálculo.
     * @return Mensaje informativo con la edad calculada.
     */
    public String calcularEdadDePunto(String anioscreacion) {
        return "Edad calculada desde: " + anioscreacion;
    }

    /**
     * Retorna una representación en texto del objeto Punto.
     */
    @Override
    public String toString() {
        return "Punto{" +
                "ubicacion='" + ubicacion + '\'' +
                ", id='" + id + '\'' +
                ", encargado='" + encargado + '\'' +
                ", aniocreacion='" + aniocreacion + '\'' +
                '}';
    }
}
