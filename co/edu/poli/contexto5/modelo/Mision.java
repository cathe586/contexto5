package co.edu.poli.contexto5.modelo;

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

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getFechaInicio() { return fechaInicio; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }

    public String getRegistro() { return registro; }
    public void setRegistro(String registro) { this.registro = registro; }

    public String getSatelite() { return satelite; }
    public void setSatelite(String satelite) { this.satelite = satelite; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public String getFechaFin() { return fechaFin; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getMuestras() { return muestras; }
    public void setMuestras(String muestras) { this.muestras = muestras; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getSimulacion() { return simulacion; }
    public void setSimulacion(String simulacion) { this.simulacion = simulacion; }

    public String calcularDuracionMision() {
        return "Duración de misión: desde " + fechaInicio + " hasta " + fechaFin;
    }

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

