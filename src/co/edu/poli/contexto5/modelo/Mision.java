package co.edu.poli.contexto5.modelo;

/**
 * Representa una misión del sistema, incluyendo su cronograma y responsables.
 * @author cathe586
 */
public class Mision {
    private String tipo;
    private String fechaInicio;
    private String registro;
    private String satelite; // Satelite
    private String encargado; // Encargado
    private String fechaFin;
    private String lugar;
    private String muestras;
    private String id;
    private String simulacion; // Simulacion

    /**
     * Constructor para inicializar una Mision con todos sus atributos detallados.
     */
    public Mision(String tipo, String fechaInicio, String registro, String satelite,
                    String encargado, String fechaFin, String lugar, String muestras,
                    String id, String simulacion) {
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.registro = registro;
        this.satelite = satelite;
        this.encargado = encargado;
        this.fechaFin = fechaFin;
        this.lugar = lugar;
        this.muestras = muestras;
        this.id = id;
        this.simulacion = simulacion;
    }

    /** @return El tipo de misión */
    public String getTipo() { return tipo; }
    /** @param tipo El nuevo tipo a asignar */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /** @return La fecha de inicio de la misión */
    public String getFechaInicio() { return fechaInicio; }
    /** @param fechaInicio La nueva fecha de inicio */
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    /** @return El registro de la misión */
    public String getRegistro() { return registro; }
    /** @param registro El nuevo registro a asignar */
    public void setRegistro(String registro) { this.registro = registro; }

    /** @return El satélite asociado */
    public String getSatelite() { return satelite; }
    /** @param satelite El nuevo satélite a asignar */
    public void setSatelite(String satelite) { this.satelite = satelite; }

    /** @return El encargado de la misión */
    public String getEncargado() { return encargado; }
    /** @param encargado El nuevo encargado a asignar */
    public void setEncargado(String encargado) { this.encargado = encargado; }

    /** @return La fecha de finalización de la misión */
    public String getFechaFin() { return fechaFin; }
    /** @param fechaFin La nueva fecha de fin */
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }

    /** @return El lugar de la misión */
    public String getLugar() { return lugar; }
    /** @param lugar El nuevo lugar a asignar */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /** @return Las muestras recolectadas */
    public String getMuestras() { return muestras; }
    /** @param muestras Las nuevas muestras a asignar */
    public void setMuestras(String muestras) { this.muestras = muestras; }

    /** @return El ID único de la misión */
    public String getId() { return id; }
    /** @param id El nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return La simulación asociada */
    public String getSimulacion() { return simulacion; }
    /** @param simulacion La nueva simulación a asignar */
    public void setSimulacion(String simulacion) { this.simulacion = simulacion; }

    /**
     * Calcula y retorna un mensaje con la duración estimada de la misión.
     * @return Cadena que indica el rango de fechas de la misión.
     */
    public String calcularDuracionMision() {
        return "Duración de misión: desde " + fechaInicio + " hasta " + fechaFin;
    }

    /**
     * Retorna una representación en texto del objeto Mision.
     */
    @Override
    public String toString() {
        return "Mision{" +
                "tipo='" + tipo + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", registro='" + registro + '\'' +
                ", satelite='" + satelite + '\'' +
                ", encargado='" + encargado + '\'' +
                ", fechaFin='" + fechaFin + '\'' +
                ", lugar='" + lugar + '\'' +
                ", muestras='" + muestras + '\'' +
                ", id='" + id + '\'' +
                ", simulacion='" + simulacion + '\'' +
                '}';
    }
}