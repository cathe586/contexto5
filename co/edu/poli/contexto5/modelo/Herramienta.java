package co.edu.poli.contexto5.modelo;



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

    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getUso() { return uso; }
    public void setUso(String uso) { this.uso = uso; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

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
