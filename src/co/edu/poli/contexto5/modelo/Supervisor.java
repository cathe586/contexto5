package co.edu.poli.contexto5.modelo;

public class Supervisor extends Personal {

    public Supervisor(String persona, String estudios, String cargo, double estatura, int edad,
                      String empresa, String identificacion, String hora, String lugar,
                      String cargo2, String nombre, String fechaNacimiento, double peso,
                      String almacenamiento, String numeroCel, String correo, String fecha) {
        super(persona, estudios, cargo, estatura, edad, empresa, identificacion, hora, lugar,
              cargo2, nombre, fechaNacimiento, peso, almacenamiento, numeroCel, correo, fecha);
    }

    @Override
    public String obtenerRol() {
        return "Rol: Supervisor a cargo de equipos - Nombre: " + getNombre();
    }

    @Override
    public String calcularTiempoTrabajo(String horaInicio, String fechaInicio) {
        return "[Sobreescritura - Supervisor] Supervision activa desde "
                + fechaInicio + " hora: " + horaInicio;
    }

    @Override
    public String toString() {
        return "Supervisor{" + super.toString() + '}';
    }
    public int numero (int i){
        return i*10;
    }
}
