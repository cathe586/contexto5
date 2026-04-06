package co.edu.poli.contexto5.modelo;

import java.io.Serializable;

/**
 * Clase abstracta que define los atributos y comportamientos base para todo el personal.
 * Gestiona información personal, profesional y estadísticas globales de la nómina.
 * @author cathe586
 */
public abstract class Personal implements Serializable {

    private static int totalPersonal = 0;

    private String persona;
    private String estudios;
    private String cargo;
    private double estatura;
    private int edad;
    private String empresa;
    private String identificacion; // no se cambia
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

    /**
     * Constructor que inicializa los datos del personal e incrementa el contador global.
     */
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

    /** @return Cantidad total de objetos Personal creados */
    public static int getTotalPersonal() { return totalPersonal; }
    /** @param total Nuevo valor para el contador global */
    public static void setTotalPersonal(int total) { totalPersonal = total; }

    /** * Establece los estudios. Este método no puede ser sobreescrito.
     * @param estudios Nivel de estudios alcanzado.
     */
    public final void setEstudios(String estudios) { this.estudios = estudios; }

    /** @return Cargo actual */
    public String getCargo() { return cargo; }
    /** @param cargo Nuevo cargo a asignar */
    public void setCargo(String cargo) { this.cargo = cargo; }

    /** @return Estatura en metros */
    public double getEstatura() { return estatura; }
    /** @param estatura Nueva estatura a asignar */
    public void setEstatura(double estatura) { this.estatura = estatura; }

    /** @return Edad del personal */
    public int getEdad() { return edad; }
    /** @param edad Nueva edad a asignar */
    public void setEdad(int edad) { this.edad = edad; }

    /** @return Empresa a la que pertenece */
    public String getEmpresa() { return empresa; }
    /** @param empresa Nueva empresa a asignar */
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    /** @return Documento de identificación */
    public String getIdentificacion() { return identificacion; }
    /** @param identificacion Nuevo ID a asignar */
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    /** @return Hora de registro */
    public String getHora() { return hora; }
    /** @param hora Nueva hora a asignar */
    public void setHora(String hora) { this.hora = hora; }

    /** @return Lugar de trabajo */
    public String getLugar() { return lugar; }
    /** @param lugar Nuevo lugar a asignar */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /** @return Segundo cargo o descripción adicional */
    public String getCargo2() { return cargo2; }
    /** @param cargo2 Nuevo cargo2 a asignar */
    public void setCargo2(String cargo2) { this.cargo2 = cargo2; }

    /** @return Nombre completo */
    public String getNombre() { return nombre; }
    /** @param nombre Nuevo nombre a asignar */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return Fecha de nacimiento */
    public String getFechaNacimiento() { return fechaNacimiento; }
    /** @param fechaNacimiento Nueva fecha de nacimiento */
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    /** @return Peso en kilogramos */
    public double getPeso() { return peso; }
    /** @param peso Nuevo peso a asignar */
    public void setPeso(double peso) { this.peso = peso; }

    /** @return Información de almacenamiento asignada */
    public String getAlmacenamiento() { return almacenamiento; }
    /** @param almacenamiento Nueva info de almacenamiento */
    public void setAlmacenamiento(String almacenamiento) { this.almacenamiento = almacenamiento; }

    /** @return Número de celular */
    public String getNumeroCel() { return numeroCel; }
    /** @param numeroCel Nuevo número de celular */
    public void setNumeroCel(String numeroCel) { this.numeroCel = numeroCel; }

    /** @return Correo institucional */
    public String getCorreo() { return correo; }
    /** @param correo Nuevo correo a asignar */
    public void setCorreo(String correo) { this.correo = correo; }

    /** @return Fecha de ingreso o registro */
    public String getFecha() { return fecha; }
    /** @param fecha Nueva fecha a asignar */
    public void setFecha(String fecha) { this.fecha = fecha; }

    /**
     * Calcula el tiempo trabajado (Versión 1: solo fecha).
     * @param fechaInicio Fecha de inicio.
     */
    public String calcularTiempoTrabajo(String fechaInicio) {
        return "[Sobrecarga v1] Tiempo trabajado desde: " + fechaInicio;
    }

    /**
     * Calcula el tiempo trabajado (Versión 2: fecha y hora).
     * @param horaInicio Hora de inicio.
     * @param fechaInicio Fecha de inicio.
     */
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobrecarga v2] Tiempo trabajado desde " + fechaInicio + " a las " + horaInicio;
    }

    /**
     * Calcula el tiempo trabajado (Versión 3: fecha, hora y descripción).
     * @param horaInicio Hora de inicio.
     * @param fechaInicio Fecha de inicio.
     * @param descripcion Detalle adicional.
     */
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio, String descripcion) {
        return "[Sobrecarga v3] Tiempo trabajado desde " + fechaInicio
                + " a las " + horaInicio + " - Descripcion: " + descripcion;
    }

    /**
     * Inicia un mantenimiento (Versión 1: solo fecha).
     * @param fechaInicio Fecha de inicio.
     */
    public String realizarMantenimiento(String fechaInicio) {
        return "[Sobrecarga v1] Mantenimiento iniciado el: " + fechaInicio;
    }

    /**
     * Inicia un mantenimiento (Versión 2: fecha y técnico).
     * @param fechaInicio Fecha de inicio.
     * @param tecnico Nombre del técnico.
     */
    public String realizarMantenimiento(String fechaInicio, String tecnico) {
        return "[Sobrecarga v2] Mantenimiento realizado por " + tecnico + " desde " + fechaInicio;
    }

    /**
     * Método abstracto para realizar mantenimiento que debe ser implementado por las subclases.
     * @param fechaInicio Fecha programada.
     */
    public abstract String realizarMantenimientoAbstracto(String fechaInicio);

    /**
     * Inicia un mantenimiento (Versión 3: fecha, técnico y tipo).
     * @param fechaInicio Fecha de inicio.
     * @param tecnico Nombre del técnico.
     * @param tipo Tipo de mantenimiento.
     */
    public String realizarMantenimiento(String fechaInicio, String tecnico, String tipo){
        return "[Sobrecarga v3] Mantenimiento tipo '" + tipo + "' realizado por "
                + tecnico + " desde " + fechaInicio;
    }

    /**
     * Retorna el tiempo que el personal lleva bajo un cargo específico.
     * @param anios Cantidad de años.
     * @param identificacion ID del personal.
     */
    public String calcularTiempoBajoCargo(String anios, String identificacion) {
        return "Tiempo bajo cargo: " + anios + " anios - ID: " + identificacion;
    }

    /** @return Descripción del rol general */
    public String obtenerRol() {
        return "Rol: Personal General - Nombre: " + nombre;
    }

    /**
     * Retorna una representación en texto del objeto Personal.
     */
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

    /**
     * Realiza un cálculo matemático simple.
     * @param i Valor entero.
     * @return i multiplicado por 7.
     */
    public int numero(int i) {
        return i * 7;
    }
}