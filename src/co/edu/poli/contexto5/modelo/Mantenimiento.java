package co.edu.poli.contexto5.modelo;

/**
 * Gestiona la información relativa a las tareas de mantenimiento del sistema.
 * @author cathe586
 */
public class Mantenimiento {
    private String fecha;
    private String tipo;
    private String encargado; // Encargado
    private String satelite; // Satelite
    private String hora;
    private String uso;
    private String ubicacion;
    private String id;
    private String mantenimiento; // self-reference
    private String herramienta; // Herramienta

    /**
     * Constructor para inicializar un registro de mantenimiento con todos sus detalles.
     */
    public Mantenimiento(String fecha, String tipo, String encargado, String satelite,
                        String hora, String uso, String ubicacion, String id,
                        String mantenimiento, String herramienta) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.encargado = encargado;
        this.satelite = satelite;
        this.hora = hora;
        this.uso = uso;
        this.ubicacion = ubicacion;
        this.id = id;
        this.mantenimiento = mantenimiento;
        this.herramienta = herramienta;
    }

    /** @return Fecha programada del mantenimiento */
    public String getFecha() { return fecha; }
    /** @param fecha Nueva fecha a asignar */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /** @return Tipo de mantenimiento realizado */
    public String getTipo() { return tipo; }
    /** @param tipo Nuevo tipo a asignar */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /** @return Nombre del encargado responsable */
    public String getEncargado() { return encargado; }
    /** @param encargado Nuevo encargado a asignar */
    public void setEncargado(String encargado) { this.encargado = encargado; }

    /** @return Satélite asociado al mantenimiento */
    public String getSatelite() { return satelite; }
    /** @param satelite Nuevo satélite a asignar */
    public void setSatelite(String satelite) { this.satelite = satelite; }

    /** @return Hora programada o de registro */
    public String getHora() { return hora; }
    /** @param hora Nueva hora a asignar */
    public void setHora(String hora) { this.hora = hora; }

    /** @return Uso o destino del mantenimiento */
    public String getUso() { return uso; }
    /** @param uso Nuevo uso a asignar */
    public void setUso(String uso) { this.uso = uso; }

    /** @return Ubicación física del mantenimiento */
    public String getUbicacion() { return ubicacion; }
    /** @param ubicacion Nueva ubicación a asignar */
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    /** @return ID único del registro */
    public String getId() { return id; }
    /** @param id Nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return Referencia interna de mantenimiento */
    public String getMantenimiento() { return mantenimiento; }
    /** @param mantenimiento Nueva referencia a asignar */
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    /** @return Herramienta utilizada */
    public String getHerramienta() { return herramienta; }
    /** @param herramienta Nueva herramienta a asignar */
    public void setHerramienta(String herramienta) { this.herramienta = herramienta; }

    /**
     * Registra el inicio del mantenimiento con la fecha actual.
     * @param fechaActual Fecha en que inicia el proceso.
     * @return Mensaje de confirmación de inicio.
     */
    public String fechaInicioMantenimiento(String fechaActual) {
        return "Mantenimiento iniciado el: " + fechaActual;
    }

    /**
     * Registra la hora exacta de inicio del mantenimiento.
     * @param horaActual Hora en que inicia el proceso.
     * @return Mensaje informativo con la hora de inicio.
     */
    public String horaInicioMantenimiento(String horaActual) {
        return "Hora de inicio del mantenimiento: " + horaActual;
    }

    /**
     * Retorna una representación en texto del objeto Mantenimiento.
     */
    @Override
    public String toString() {
        return "Mantenimiento{" +
                "fecha='" + fecha + '\'' +
                ", tipo='" + tipo + '\'' +
                ", encargado='" + encargado + '\'' +
                ", satelite='" + satelite + '\'' +
                ", hora='" + hora + '\'' +
                ", uso='" + uso + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", id='" + id + '\'' +
                ", mantenimiento='" + mantenimiento + '\'' +
                ", herramienta='" + herramienta + '\'' +
                '}';
    }
}