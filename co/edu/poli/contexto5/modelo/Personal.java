package co.edu.poli.contexto5.modelo;

public abstract  class Personal {

    private static int totalPersonal = 0;

    private String persona;
    private String estudios;
    private String cargo;
    private double estatura;
    private int edad;
    private String empresa;
    private String identificacion;//no se cambia
    private String hora;
    private String lugar;
    private String cargo2;
    private String nombre;
    private String fechaNacimiento;
    private double peso;
    private String almacenamiento;
    private String numeroCel;
    private String correo;
    private String fecha;

    public Personal(String persona, String estudios, String cargo, double estatura, int edad,
                    String empresa, String identificacion, String hora, String lugar,
                    String cargo2, String nombre, String fechaNacimiento, double peso,
                    String almacenamiento, String numeroCel, String correo, String fecha) {
        this.persona = persona;
        this.estudios = estudios;
        this.cargo = cargo;
        this.estatura = estatura;
        this.edad = edad;
        this.empresa = empresa;
        this.identificacion = identificacion;
        this.hora = hora;
        this.lugar = lugar;
        this.cargo2 = cargo2;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.almacenamiento = almacenamiento;
        this.numeroCel = numeroCel;
        this.correo = correo;
        this.fecha = fecha;
    
        totalPersonal++;
    }

    public static int getTotalPersonal() { return totalPersonal; }
    public static void setTotalPersonal(int total) { totalPersonal = total; }

    // Getters y Setters
    public final void setEstudios(String estudios) { this.estudios = estudios; } //no sobre escritura

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getEstatura() { return estatura; }
    public void setEstatura(double estatura) { this.estatura = estatura; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getCargo2() { return cargo2; }
    public void setCargo2(String cargo2) { this.cargo2 = cargo2; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }

    public String getAlmacenamiento() { return almacenamiento; }
    public void setAlmacenamiento(String almacenamiento) { this.almacenamiento = almacenamiento; }

    public String getNumeroCel() { return numeroCel; }
    public void setNumeroCel(String numeroCel) { this.numeroCel = numeroCel; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }


    public String calcularTiempoTrabajo(String fechaInicio) {
        return "[Sobrecarga v1] Tiempo trabajado desde: " + fechaInicio;
    }

    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobrecarga v2] Tiempo trabajado desde " + fechaInicio + " a las " + horaInicio;
    }

    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio, String descripcion) {
        return "[Sobrecarga v3] Tiempo trabajado desde " + fechaInicio
                + " a las " + horaInicio + " - Descripcion: " + descripcion;
    }


    public String realizarMantenimiento(String fechaInicio) {
        return "[Sobrecarga v1] Mantenimiento iniciado el: " + fechaInicio;
    }

    public String realizarMantenimiento(String fechaInicio, String tecnico) {
        return "[Sobrecarga v2] Mantenimiento realizado por " + tecnico + " desde " + fechaInicio;
    }
    public abstract String realizarMantenimientoAbstracto(String fechaInicio);

    public  String realizarMantenimiento(String fechaInicio, String tecnico, String tipo){
        return "[Sobrecarga v3] Mantenimiento tipo '" + tipo + "' realizado por "
                + tecnico + " desde " + fechaInicio;
}

    public String calcularTiempoBajoCargo(String anios, String identificacion) {
        return "Tiempo bajo cargo: " + anios + " anios - ID: " + identificacion;
    }

    public String obtenerRol() {
        return "Rol: Personal General - Nombre: " + nombre;
    }

    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", estudios='" + estudios + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", edad=" + edad +
                ", empresa='" + empresa + '\'' +
                ", lugar='" + lugar + '\'' +
                ", correo='" + correo + '\'' +
                ", totalPersonal(static)=" + totalPersonal +
                '}';
    }

    public int numero(int i) {
        return i * 7;
    }

    }

