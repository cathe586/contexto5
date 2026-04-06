package co.edu.poli.contexto5.modelo;

/**
 * Representa a un Supervisor en el sistema, encargado de la gestión de equipos y mantenimiento.
 * Esta clase extiende de la clase base Personal.
 * @author cathe586
 */
public class Supervisor extends Personal {

    /**
     * Constructor para inicializar un Supervisor con todos los atributos heredados de Personal.
     */
    public Supervisor(String persona, String estudios, String cargo, double estatura, int edad,
                    String empresa, String identificacion, String hora, String lugar,
                    String cargo2, String nombre, String fechaNacimiento, double peso,
                    String almacenamiento, String numeroCel, String correo, String fecha) {
        super(persona, estudios, cargo, estatura, edad, empresa, identificacion, hora, lugar,
            cargo2, nombre, fechaNacimiento, peso, almacenamiento, numeroCel, correo, fecha);
    }

    /**
     * Retorna el rol específico del supervisor junto con su nombre.
     * @return Cadena que identifica al supervisor y su responsabilidad.
     */
    @Override
    public String obtenerRol() {
        return "Rol: Supervisor a cargo de equipos - Nombre: " + getNombre();
    }

    /**
     * Calcula y registra el tiempo de supervisión activa.
     * @param horaInicio Hora en la que inicia la supervisión.
     * @param fechaInicio Fecha en la que inicia la supervisión.
     * @return Detalle de la supervisión activa con fecha y hora.
     */
    @Override
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobreescritura - Supervisor] Supervision activa desde "
                + fechaInicio + " hora: " + horaInicio;
    }

    /**
     * Retorna la representación en texto del Supervisor, incluyendo la información de Personal.
     */
    @Override
    public String toString() {
        return "Supervisor{" + super.toString() + '}';
    }

    /**
     * Realiza un cálculo numérico específico para el rol de supervisor (multiplicación por 10).
     * @param i Valor base.
     * @return Resultado del cálculo.
     */
    @Override
    public int numero (int i){
        return i*10;
    }

    /**
     * Implementa el mantenimiento programado desde la perspectiva de supervisión.
     * @param fechaInicio Fecha de inicio del mantenimiento.
     * @return Descripción de la acción de mantenimiento realizada.
     */
    @Override
    public String realizarMantenimientoAbstracto(String fechaInicio) {
        return "Ingeniero realiza mantenimiento en " + fechaInicio;
    }
}