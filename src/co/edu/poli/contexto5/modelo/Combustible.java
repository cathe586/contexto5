package co.edu.poli.contexto5.modelo;

/**
 * Representa la entidad Combustible con sus propiedades y estado.
 * @author cathe586
 */
public class Combustible {
    private String marca;
    private String tipo;
    private String color;
    private String cantidad;
    private boolean esExportado;
    private String localizacion;
    private String contentura;
    private String id;

    /**
     * Constructor con todos los atributos de la clase Combustible.
     */
    public Combustible(String marca, String tipo, String color, String cantidad,
                        boolean esExportado, String localizacion, String contentura, String id) {
        this.marca = marca;
        this.tipo = tipo;
        this.color = color;
        this.cantidad = cantidad;
        this.esExportado = esExportado;
        this.localizacion = localizacion;
        this.contentura = contentura;
        this.id = id;
    }

    /** @return La marca del combustible */
    public String getMarca() { return marca; }
    /** @param marca La nueva marca a asignar */
    public void setMarca(String marca) { this.marca = marca; }

    /** @return El tipo de combustible */
    public String getTipo() { return tipo; }
    /** @param tipo El nuevo tipo a asignar */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /** @return El color del combustible */
    public String getColor() { return color; }
    /** @param color El nuevo color a asignar */
    public void setColor(String color) { this.color = color; }

    /** @return La cantidad almacenada */
    public String getCantidad() { return cantidad; }
    /** @param cantidad La nueva cantidad a asignar */
    public void setCantidad(String cantidad) { this.cantidad = cantidad; }

    /** @return true si es exportado, false de lo contrario */
    public boolean isEsExportado() { return esExportado; }
    /** @param esExportado Estado de exportación a asignar */
    public void setEsExportado(boolean esExportado) { this.esExportado = esExportado; }

    /** @return La localización del combustible */
    public String getLocalizacion() { return localizacion; }
    /** @param localizacion La nueva localización a asignar */
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }

    /** @return La contentura del combustible */
    public String getContentura() { return contentura; }
    /** @param contentura La nueva contentura a asignar */
    public void setContentura(String contentura) { this.contentura = contentura; }

    /** @return El ID único del registro */
    public String getId() { return id; }
    /** @param id El nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /**
     * Valida el estado de llenado del tanque.
     * @param tanque Identificador del tanque.
     * @param lleno Estado de llenado en formato String.
     * @return El valor booleano de la cadena 'lleno'.
     */
    public boolean llenarTanque(String tanque, String lleno) {
        return Boolean.parseBoolean(lleno);
    }

    /**
     * Retorna una representación en texto del objeto Combustible.
     */
    @Override
    public String toString() {
        return "Combustible{" +
                "marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", cantidad='" + cantidad + '\'' +
                ", esExportado=" + esExportado +
                ", localizacion='" + localizacion + '\'' +
                ", contentura='" + contentura + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}