package co.edu.poli.contexto5.modelo;

/**
 * Representa una estación de monitoreo o logística en el sistema.
 * @author cathe586
 */
public class Estacion {
    private String serial;
    private String lugar;
    private String empresa; // Empresa
    private String satelite; // Satelite
    private String nombre;
    private String correo;
    private String id;
    private String encargado; // Encargado

    /**
     * Constructor para inicializar una instancia de Estacion con todos sus atributos.
     */
    public Estacion(String serial, String lugar, String empresa, String satelite,
                    String nombre, String correo, String id, String encargado) {
        this.serial = serial;
        this.lugar = lugar;
        this.empresa = empresa;
        this.satelite = satelite;
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.encargado = encargado;
    }

    /** @return Serial de la estación */
    public String getSerial() { return serial; }
    /** @param serial Nuevo serial a asignar */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return Ubicación o lugar de la estación */
    public String getLugar() { return lugar; }
    /** @param lugar Nuevo lugar a asignar */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /** @return Nombre de la empresa asociada */
    public String getEmpresa() { return empresa; }
    /** @param empresa Nueva empresa a asignar */
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    /** @return Identificador del satélite asociado */
    public String getSatelite() { return satelite; }
    /** @param satelite Nuevo satélite a asignar */
    public void setSatelite(String satelite) { this.satelite = satelite; }

    /** @return Nombre de la estación */
    public String getNombre() { return nombre; }
    /** @param nombre Nuevo nombre a asignar */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Correo de contacto de la estación */
    public String getCorreo() { return correo; }
    /** @param correo Nuevo correo a asignar */
    public void setCorreo(String correo) { this.correo = correo; }

    /** @return ID único de la estación */
    public String getId() { return id; }
    /** @param id Nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return Nombre del encargado de la estación */
    public String getEncargado() { return encargado; }
    /** @param encargado Nuevo encargado a asignar */
    public void setEncargado(String encargado) { this.encargado = encargado; }

    /**
     * Calcula la llegada semanal basada en el satélite y serial.
     * @param satelite Identificador del satélite.
     * @param serial Serial de la estación.
     * @return Valor numérico de la operación (por defecto 0.0).
     */
    public double llegadaSemanalSatelite(String satelite, String serial) {
        return 0.0; // Implementación según lógica de negocio
    }

    /**
     * Retorna una representación en texto del objeto Estacion.
     */
    @Override
    public String toString() {
        return "Estacion{" +
                "serial='" + serial + '\'' +
                ", lugar='" + lugar + '\'' +
                ", empresa='" + empresa + '\'' +
                ", satelite='" + satelite + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", id='" + id + '\'' +
                ", encargado='" + encargado + '\'' +
                '}';
    }
}