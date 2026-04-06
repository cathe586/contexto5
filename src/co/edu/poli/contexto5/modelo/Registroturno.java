package co.edu.poli.contexto5.modelo;

/**
 * Representa el registro de un turno de trabajo para el personal en una estación o satélite.
 * @author cathe586
 */
public class Registroturno {
    private String idTurno;
    private String fechaTurno;
    private String horaInicio;
    private String horaFin;
    private String tipoTurno;
    private String idPersonal;
    private String nombrePersonal;
    private String idSatelite;
    private String idEstacion;
    private String estado;
    private String observaciones;

    /**
     * Constructor para inicializar un nuevo registro de turno con todos sus detalles.
     */
    public Registroturno(String idTurno, String fechaTurno, String horaInicio, String horaFin,
                        String tipoTurno, String idPersonal, String nombrePersonal,
                        String idSatelite, String idEstacion, String estado, String observaciones) {
        this.idTurno       = idTurno;
        this.fechaTurno    = fechaTurno;
        this.horaInicio    = horaInicio;
        this.horaFin       = horaFin;
        this.tipoTurno     = tipoTurno;
        this.idPersonal    = idPersonal;
        this.nombrePersonal = nombrePersonal;
        this.idSatelite    = idSatelite;
        this.idEstacion    = idEstacion;
        this.estado        = estado;
        this.observaciones = observaciones;
    }

    /** @return ID único del turno */
    public String getIdTurno() { return idTurno; }
    /** @param idTurno Nuevo ID de turno */
    public void setIdTurno(String idTurno) { this.idTurno = idTurno; }

    /** @return Fecha en la que se realiza el turno */
    public String getFechaTurno() { return fechaTurno; }
    /** @param fechaTurno Nueva fecha de turno */
    public void setFechaTurno(String fechaTurno) { this.fechaTurno = fechaTurno; }

    /** @return Hora de inicio del turno */
    public String getHoraInicio() { return horaInicio; }
    /** @param horaInicio Nueva hora de inicio */
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

    /** @return Hora de finalización del turno */
    public String getHoraFin() { return horaFin; }
    /** @param horaFin Nueva hora de fin */
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }

    /** @return Tipo o categoría de turno */
    public String getTipoTurno() { return tipoTurno; }
    /** @param tipoTurno Nuevo tipo de turno */
    public void setTipoTurno(String tipoTurno) { this.tipoTurno = tipoTurno; }

    /** @return ID del personal asignado */
    public String getIdPersonal() { return idPersonal; }
    /** @param idPersonal Nuevo ID de personal */
    public void setIdPersonal(String idPersonal) { this.idPersonal = idPersonal; }

    /** @return Nombre del personal asignado */
    public String getNombrePersonal() { return nombrePersonal; }
    /** @param nombrePersonal Nuevo nombre de personal */
    public void setNombrePersonal(String nombrePersonal) { this.nombrePersonal = nombrePersonal; }

    /** @return ID del satélite asociado */
    public String getIdSatelite() { return idSatelite; }
    /** @param idSatelite Nuevo ID de satélite */
    public void setIdSatelite(String idSatelite) { this.idSatelite = idSatelite; }

    /** @return ID de la estación de trabajo */
    public String getIdEstacion() { return idEstacion; }
    /** @param idEstacion Nuevo ID de estación */
    public void setIdEstacion(String idEstacion) { this.idEstacion = idEstacion; }

    /** @return Estado actual del turno (ej. Activo, Finalizado) */
    public String getEstado() { return estado; }
    /** @param estado Nuevo estado del turno */
    public void setEstado(String estado) { this.estado = estado; }

    /** @return Observaciones adicionales del turno */
    public String getObservaciones() { return observaciones; }
    /** @param observaciones Nuevas observaciones */
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    /**
     * Retorna una representación en texto del objeto Registroturno.
     */
    @Override
    public String toString() {
        return "RegistroTurno{" +
                "idTurno='" + idTurno + '\'' +
                ", fechaTurno='" + fechaTurno + '\'' +
                ", horaInicio='" + horaInicio + '\'' +
                ", horaFin='" + horaFin + '\'' +
                ", tipoTurno='" + tipoTurno + '\'' +
                ", idPersonal='" + idPersonal + '\'' +
                ", nombrePersonal='" + nombrePersonal + '\'' +
                ", idSatelite='" + idSatelite + '\'' +
                ", idEstacion='" + idEstacion + '\'' +
                ", estado='" + estado + '\'' +
                ", observaciones='" + observaciones + '\'' +
                '}';
    }
}