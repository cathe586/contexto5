package co.edu.poli.contexto5.modelo;

public final class Ingeniero extends Personal {// no herencia
    private String especializacion;

    public Ingeniero(String persona, String estudios, String cargo, double estatura, int edad,
            String empresa, String identificacion, String hora, String lugar,
            String cargo2, String nombre, String fechaNacimiento, double peso,
            String almacenamiento, String numeroCel, String correo, String fecha,
            String especializacion) {
        super(persona, estudios, cargo, estatura, edad, empresa, identificacion, hora, lugar,
                cargo2, nombre, fechaNacimiento, peso, almacenamiento, numeroCel, correo, fecha);
        this.especializacion = especializacion;
    }

    public String getEspecializacion() {
        return especializacion;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public String calcularEdad(String aniosActual) {
        return "Edad calculada para anio actual: " + aniosActual;
    }

    @Override
    public String obtenerRol() {
        return "Rol: Ingeniero Especialista en " + especializacion + " - Nombre: " + getNombre();
    }

    @Override
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobreescritura - Ingeniero] Tiempo de ingenieria desde "
                + fechaInicio + " hora: " + horaInicio + " | Esp: " + especializacion;
    }

    @Override
    public String toString() {
        return "Ingeniero{" +
                super.toString() +
                ", especializacion='" + especializacion + '\'' +
                '}';
    }

    @Override
    public int numero(int i) {
        return i * 6;
    }
    @Override
    public String realizarMantenimientoAbstracto(String fechaInicio) {
    return "Ingeniero realiza mantenimiento en " + fechaInicio;
}
}
