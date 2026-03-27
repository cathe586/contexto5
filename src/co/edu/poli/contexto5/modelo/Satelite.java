package co.edu.poli.contexto5.modelo;

public class Satelite {
    private String serial;
    private String nombre;
    private String tipo;
    private String ubicacion;
    private String fecha;
    private double tamano;
    private double peso;
    private String mantenimiento; // Mantenimiento
    private String empresa; // Empresa
    private String capacidad;
    private String combustible; // Combustible

    public Satelite(String serial, String nombre, String tipo, String ubicacion, String fecha,
                    double tamano, double peso, String mantenimiento, String empresa,
                    String capacidad, String combustible) {
        this.serial = serial;
        this.nombre = nombre;
        this.tipo = tipo;
        this.ubicacion = ubicacion;
        this.fecha = fecha;
        this.tamano = tamano;
        this.peso = peso;
        this.mantenimiento = mantenimiento;
        this.empresa = empresa;
        this.capacidad = capacidad;
        this.combustible = combustible;
    }

    public String getSerial() { return serial; }
    public void setSerial(String serial) { this.serial = serial; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getTamano() { return tamano; }
    public void setTamano(double tamano) { this.tamano = tamano; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getMantenimiento() { return mantenimiento; }
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getCapacidad() { return capacidad; }
    public void setCapacidad(String capacidad) { this.capacidad = capacidad; }

    public String getCombustible() { return combustible; }
    public void setCombustible(String combustible) { this.combustible = combustible; }

    public int calcularTiempoOrbita(String fechaActual) {
        return Integer.parseInt(fechaActual) - Integer.parseInt(fecha);
    }

    public String calcularCombustible(String combustible, String mision) {
        return "Combustible calculado: " + combustible + " para misión: " + mision;
    }

    @Override
    public String toString() {
        return "Satelite{" +
                "serial='" + serial + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", tamano=" + tamano +
                ", peso=" + peso +
                ", mantenimiento='" + mantenimiento + '\'' +
                ", empresa='" + empresa + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", combustible='" + combustible + '\'' +
                '}';
    }
}
