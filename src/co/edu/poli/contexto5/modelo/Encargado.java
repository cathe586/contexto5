package co.edu.poli.contexto5.modelo;

/**
 * Representa a un encargado con su información personal, académica y laboral.
 * @author cathe586
 */
public class Encargado {
    private String nombre;
    private String edad;
    private String estudios;
    private String satelite; // Satelite
    private String familia;
    private String trabajadores;
    private String fechaHabil;
    private String cargo;
    private String correo;
    private String molecular;
    private String nacionalidad;
    private String empresa; // Empresa
    private String id;
    private String presentacion;

    /**
     * Constructor para inicializar todos los atributos del encargado.
     */
    public Encargado(String nombre, String edad, String estudios, String satelite,
                    String familia, String trabajadores, String fechaHabil, String cargo,
                    String correo, String molecular, String nacionalidad, String empresa,
                    String id, String presentacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.estudios = estudios;
        this.satelite = satelite;
        this.familia = familia;
        this.trabajadores = trabajadores;
        this.fechaHabil = fechaHabil;
        this.cargo = cargo;
        this.correo = correo;
        this.molecular = molecular;
        this.nacionalidad = nacionalidad;
        this.empresa = empresa;
        this.id = id;
        this.presentacion = presentacion;
    }

    /** @return Nombre del encargado */
    public String getNombre() { return nombre; }
    /** @param nombre Nuevo nombre a asignar */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Edad del encargado */
    public String getEdad() { return edad; }
    /** @param edad Nueva edad a asignar */
    public void setEdad(String edad) { this.edad = edad; }

    /** @return Nivel de estudios */
    public String getEstudios() { return estudios; }
    /** @param estudios Nuevos estudios a asignar */
    public void setEstudios(String estudios) { this.estudios = estudios; }

    /** @return Información de satélite */
    public String getSatelite() { return satelite; }
    /** @param satelite Nuevo satélite a asignar */
    public void setSatelite(String satelite) { this.satelite = satelite; }

    /** @return Información de familia */
    public String getFamilia() { return familia; }
    /** @param familia Nueva información familiar */
    public void setFamilia(String familia) { this.familia = familia; }

    /** @return Información de trabajadores a cargo */
    public String getTrabajadores() { return trabajadores; }
    /** @param trabajadores Nuevos trabajadores a asignar */
    public void setTrabajadores(String trabajadores) { this.trabajadores = trabajadores; }

    /** @return Fecha hábil de disponibilidad */
    public String getFechaHabil() { return fechaHabil; }
    /** @param fechaHabil Nueva fecha hábil */
    public void setFechaHabil(String fechaHabil) { this.fechaHabil = fechaHabil; }

    /** @return Cargo del encargado */
    public String getCargo() { return cargo; }
    /** @param cargo Nuevo cargo a asignar */
    public void setCargo(String cargo) { this.cargo = cargo; }

    /** @return Correo electrónico */
    public String getCorreo() { return correo; }
    /** @param correo Nuevo correo a asignar */
    public void setCorreo(String correo) { this.correo = correo; }

    /** @return Información molecular */
    public String getMolecular() { return molecular; }
    /** @param molecular Nueva información molecular */
    public void setMolecular(String molecular) { this.molecular = molecular; }

    /** @return Nacionalidad */
    public String getNacionalidad() { return nacionalidad; }
    /** @param nacionalidad Nueva nacionalidad */
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    /** @return Empresa asociada */
    public String getEmpresa() { return empresa; }
    /** @param empresa Nueva empresa a asignar */
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    /** @return ID único del encargado */
    public String getId() { return id; }
    /** @param id Nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /** @return Texto de presentación */
    public String getPresentacion() { return presentacion; }
    /** @param presentacion Nueva presentación */
    public void setPresentacion(String presentacion) { this.presentacion = presentacion; }

    /**
     * Retorna una representación en texto del objeto Encargado.
     */
    @Override
    public String toString() {
        return "Encargado{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", estudios='" + estudios + '\'' +
                ", satelite='" + satelite + '\'' +
                ", familia='" + familia + '\'' +
                ", trabajadores='" + trabajadores + '\'' +
                ", fechaHabil='" + fechaHabil + '\'' +
                ", cargo='" + cargo + '\'' +
                ", correo='" + correo + '\'' +
                ", molecular='" + molecular + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", empresa='" + empresa + '\'' +
                ", id='" + id + '\'' +
                ", presentacion='" + presentacion + '\'' +
                '}';
    }
}