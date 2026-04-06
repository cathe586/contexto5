package co.edu.poli.contexto5.modelo;

/**
 * Representa un satélite dentro del sistema, incluyendo sus especificaciones técnicas y operativas.
 * @author cathe586
 */
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

    /**
     * Constructor para inicializar un Satélite con todos sus atributos.
     */
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

    /** @return Serial único del satélite */
    public String getSerial() { return serial; }
    /** @param serial Nuevo serial a asignar */
    public void setSerial(String serial) { this.serial = serial; }

    /** @return Nombre del satélite */
    public String getNombre() { return nombre; }
    /** @param nombre Nuevo nombre a asignar */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Tipo o categoría de satélite */
    public String getTipo() { return tipo; }
    /** @param tipo Nuevo tipo a asignar */
    public void setTipo(String tipo) { this.tipo = tipo; }

    /** @return Ubicación orbital o geográfica */
    public String getUbicacion() { return ubicacion; }
    /** @param ubicacion Nueva ubicación a asignar */
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    /** @return Fecha de lanzamiento o registro */
    public String getFecha() { return fecha; }
    /** @param fecha Nueva fecha a asignar */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /** @return Tamaño del satélite */
    public double getTamano() { return tamano; }
    /** @param tamano Nuevo tamaño a asignar */
    public void setTamano(double tamano) { this.tamano = tamano; }

    /** @return Peso del satélite */
    public double getPeso() { return peso; }
    /** @param peso Nuevo peso a asignar */
    public void setPeso(double peso) { this.peso = peso; }

    /** @return Información de mantenimiento */
    public String getMantenimiento() { return mantenimiento; }
    /** @param mantenimiento Nueva información de mantenimiento */
    public void setMantenimiento(String mantenimiento) { this.mantenimiento = mantenimiento; }

    /** @return Empresa propietaria o responsable */
    public String getEmpresa() { return empresa; }
    /** @param empresa Nueva empresa a asignar */
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    /** @return Capacidad operativa del satélite */
    public String getCapacidad() { return capacidad; }
    /** @param capacidad Nueva capacidad a asignar */
    public void setCapacidad(String capacidad) { this.capacidad = capacidad; }

    /** @return Tipo de combustible utilizado */
    public String getCombustible() { return combustible; }
    /** @param combustible Nuevo combustible a asignar */
    public void setCombustible(String combustible) { this.combustible = combustible; }

    /**
     * Calcula el tiempo que el satélite ha estado en órbita.
     * @param fechaActual Año o fecha actual para el cálculo.
     * @return Diferencia numérica entre la fecha actual y la de lanzamiento.
     */
    public int calcularTiempoOrbita(String fechaActual) {
        return Integer.parseInt(fechaActual) - Integer.parseInt(fecha);
    }

    /**
     * Realiza una estimación del combustible necesario para una misión.
     * @param combustible Tipo o cantidad de combustible.
     * @param mision Nombre o ID de la misión.
     * @return Mensaje informativo con el combustible calculado.
     */
    public String calcularCombustible(String combustible, String mision) {
        return "Combustible calculado: " + combustible + " para misión: " + mision;
    }

    /**
     * Retorna una representación en texto del objeto Satelite.
     */
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