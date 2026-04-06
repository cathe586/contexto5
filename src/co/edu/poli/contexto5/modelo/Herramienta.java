package co.edu.poli.contexto5.modelo;

/**
 * Representa una herramienta utilizada en el sistema con sus especificaciones técnicas.
 * @author cathe586
 */
public class Herramienta {
    private double tamano;
    private String tipo;
    private String uso;
    private String nombre;
    private String correo;
    private String id;
    private String fecha;
    private String marca;
    private String serial;
    private String color;

    /**
     * Constructor para inicializar una herramienta con todos sus atributos.
     */
    public Herramienta(double tamano, String tipo, String uso, String nombre, String correo,
                        String id, String fecha, String marca, String serial, String color) {
        this.tamano = tamano;
        this.tipo = tipo;
        this.uso = uso;
        this.nombre = nombre;
        this.correo = correo;
        this.id = id;
        this.fecha = fecha;
        this.marca = marca;
        this.serial = serial;
        this.color = color;
    }

    /** @return Tamaño de la herramienta */
    public double getTamano() { return tamano; }
    /** @param tamano Nuevo tamaño a asignar */
    public void setTamano(double tamano) { this.tamano = tamano; }

    /** @return Tipo de herramienta */
    public String getTipo() { return tipo; }
    /** @param tipo Nuevo tipo a asignar */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /** @return Uso destinado de la herramienta */
    public String getUso() { return uso; }
    /** @param uso Nuevo uso a asignar */
    public void setUso(String uso) { this.uso = uso; }

    /** @return Nombre de la herramienta */
    public String getNombre() { return nombre; }
    /** @param nombre Nuevo nombre a asignar */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Correo de contacto o registro */
    public String getCorreo() { return correo; }
    /** @param correo Nuevo correo a asignar */
    public void setCorreo(String correo) { this.correo = correo; }

    /** @return ID único de la herramienta */
    public String getId() { return id; }
    /** @param id Nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return Fecha de registro o adquisición */
    public String getFecha() { return fecha; }
    /** @param fecha Nueva fecha a asignar */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /** @return Marca de la herramienta */
    public String getMarca() { return marca; }
    /** @param marca Nueva marca a asignar */
    public void setMarca(String marca) { this.marca = marca; }

    /** @return Número de serial único */
    public String getSerial() { return serial; }
    /** @param serial Nuevo serial a asignar */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return Color de la herramienta */
    public String getColor() { return color; }
    /** @param color Nuevo color a asignar */
    public void setColor(String color) { this.color = color; }

    /**
     * Retorna una representación en texto del objeto Herramienta.
     */
    @Override
    public String toString() {
        return "Herramienta{" +
                "tamano=" + tamano +
                ", tipo='" + tipo + '\'' +
                ", uso='" + uso + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", id='" + id + '\'' +
                ", fecha='" + fecha + '\'' +
                ", marca='" + marca + '\'' +
                ", serial='" + serial + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}