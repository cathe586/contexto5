package co.edu.poli.contexto5.modelo;

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

    // Getters y Setters
    public String getIdTurno() { return idTurno; }
    public void setIdTurno(String idTurno) { this.idTurno = idTurno; }

    public String getFechaTurno() { return fechaTurno; }
    public void setFechaTurno(String fechaTurno) { this.fechaTurno = fechaTurno; }

    public String getHoraInicio() { return horaInicio; }
    public void setHoraInicio(String horaInicio) { this.horaInicio = horaInicio; }

    public String getHoraFin() { return horaFin; }
    public void setHoraFin(String horaFin) { this.horaFin = horaFin; }

    public String getTipoTurno() { return tipoTurno; }
    public void setTipoTurno(String tipoTurno) { this.tipoTurno = tipoTurno; }

    public String getIdPersonal() { return idPersonal; }
    public void setIdPersonal(String idPersonal) { this.idPersonal = idPersonal; }

    public String getNombrePersonal() { return nombrePersonal; }
    public void setNombrePersonal(String nombrePersonal) { this.nombrePersonal = nombrePersonal; }

    public String getIdSatelite() { return idSatelite; }
    public void setIdSatelite(String idSatelite) { this.idSatelite = idSatelite; }

    public String getIdEstacion() { return idEstacion; }
    public void setIdEstacion(String idEstacion) { this.idEstacion = idEstacion; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

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
