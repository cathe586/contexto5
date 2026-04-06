package co.edu.poli.contexto5.modelo;

/**
 * Representa a un Ingeniero en el sistema, especialización de la clase Personal.
 * Esta clase es final y no permite herencia adicional.
 * @author cathe586
 */
public final class Ingeniero extends Personal { // no herencia
    private String especializacion;

    /**
     * Constructor para inicializar un Ingeniero con todos los atributos de Personal y su especialización.
     */
    public Ingeniero(String persona, String estudios, String cargo, double estatura, int edad,
            String empresa, String identificacion, String hora, String lugar,
            String cargo2, String nombre, String fechaNacimiento, double peso,
            String almacenamiento, String numeroCel, String correo, String fecha,
            String especializacion) {
        super(persona, estudios, cargo, estatura, edad, empresa, identificacion, hora, lugar,
                cargo2, nombre, fechaNacimiento, peso, almacenamiento, numeroCel, correo, fecha);
        this.especializacion = especializacion;
    }

    /** @return La especialización del ingeniero */
    public String getEspecializacion() {
        return especializacion;
    }

    /** @param especializacion La nueva especialización a asignar */
    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    /**
     * Retorna un mensaje con la edad calculada basada en el año proporcionado.
     * @param aniosActual Año actual de referencia.
     * @return Mensaje informativo sobre la edad calculada.
     */
    public String calcularEdad(String aniosActual) {
        return "Edad calculada para anio actual: " + aniosActual;
    }

    /**
     * Retorna el rol específico y el nombre del ingeniero.
     * @return Cadena con el rol y especialización.
     */
    @Override
    public String obtenerRol() {
        return "Rol: Ingeniero Especialista en " + especializacion + " - Nombre: " + getNombre();
    }

    /**
     * Calcula el tiempo de trabajo específico para ingeniería.
     * @param horaInicio Hora de inicio de la jornada.
     * @param fechaInicio Fecha de inicio de la jornada.
     * @return Detalle del tiempo de ingeniería.
     */
    @Override
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobreescritura - Ingeniero] Tiempo de ingenieria desde "
                + fechaInicio + " hora: " + horaInicio + " | Esp: " + especializacion;
    }

    /**
     * Retorna la representación en texto del Ingeniero, incluyendo datos de Personal.
     */
    @Override
    public String toString() {
        return "Ingeniero{" +
                super.toString() +
                ", especializacion='" + especializacion + '\'' +
                '}';
    }

    /**
     * Realiza un cálculo numérico específico (multiplicación por 6).
     * @param i Valor base.
     * @return Resultado del cálculo.
     */
    @Override
    public int numero(int i) {
        return i * 6;
    }

    /**
     * Implementa el mantenimiento abstracto para el rol de ingeniero.
     * @param fechaInicio Fecha programada.
     * @return Descripción de la acción de mantenimiento.
     */
    @Override
    public String realizarMantenimientoAbstracto(String fechaInicio) {
        return "Ingeniero realiza mantenimiento en " + fechaInicio;
    }
}