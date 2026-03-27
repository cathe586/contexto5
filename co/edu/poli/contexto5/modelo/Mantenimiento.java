package co.edu.poli.contexto5.modelo;

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

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public String getSatelite() { return satelite; }
    public void setSatelite(String satelite) { this.satelite = satelite; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getUso() { return uso; }
    public void setUso(String uso) { this.uso = uso; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMantenimiento() { return mantenimiento; }
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    public String getHerramienta() { return herramienta; }
    public void setHerramienta(String herramienta) { this.herramienta = herramienta; }

    public String fechaInicioMantenimiento(String fechaActual) {
        return "Mantenimiento iniciado el: " + fechaActual;
    }

    public String horaInicioMantenimiento(String horaActual) {
        return "Hora de inicio del mantenimiento: " + horaActual;
    }

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
