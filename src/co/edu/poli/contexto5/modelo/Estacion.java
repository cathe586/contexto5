package co.edu.poli.contexto5.modelo;

public class Estacion {
    private String serial;
    private String lugar;
    private String empresa; // Empresa
    private String satelite; // Satelite
    private String nombre;
    private String correo;
    private String id;
    private String encargado; // Encargado

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

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getSatelite() { return satelite; }
    public void setSatelite(String satelite) { this.satelite = satelite; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public double llegadaSemanalSatelite(String satelite, String serial) {
        return 0.0; // Implementación según lógica de negocio
    }

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
