package co.edu.poli.contexto5.modelo;

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

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getEdad() { return edad; }
    public void setEdad(String edad) { this.edad = edad; }

    public String getEstudios() { return estudios; }
    public void setEstudios(String estudios) { this.estudios = estudios; }

    public String getSatelite() { return satelite; }
    public void setSatelite(String satelite) { this.satelite = satelite; }

    public String getFamilia() { return familia; }
    public void setFamilia(String familia) { this.familia = familia; }

    public String getTrabajadores() { return trabajadores; }
    public void setTrabajadores(String trabajadores) { this.trabajadores = trabajadores; }

    public String getFechaHabil() { return fechaHabil; }
    public void setFechaHabil(String fechaHabil) { this.fechaHabil = fechaHabil; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getMolecular() { return molecular; }
    public void setMolecular(String molecular) { this.molecular = molecular; }

    public String getNacionalidad() { return nacionalidad; }
    public void setNacionalidad(String nacionalidad) { this.nacionalidad = nacionalidad; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getPresentacion() { return presentacion; }
    public void setPresentacion(String presentacion) { this.presentacion = presentacion; }

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
