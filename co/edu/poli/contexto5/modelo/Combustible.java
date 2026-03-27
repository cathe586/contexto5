package co.edu.poli.contexto5.modelo;

public class Combustible {
    private String marca;
    private String tipo;
    private String color;
    private String cantidad;
    private boolean esExportado;
    private String localizacion;
    private String contentura;
    private String id;

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

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public String getCantidad() { return cantidad; }
    public void setCantidad(String cantidad) { this.cantidad = cantidad; }

    public boolean isEsExportado() { return esExportado; }
    public void setEsExportado(boolean esExportado) { this.esExportado = esExportado; }

    public String getLocalizacion() { return localizacion; }
    public void setLocalizacion(String localizacion) { this.localizacion = localizacion; }

    public String getContentura() { return contentura; }
    public void setContentura(String contentura) { this.contentura = contentura; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public boolean llenarTanque(String tanque, String lleno) {
        return Boolean.parseBoolean(lleno);
    }

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
