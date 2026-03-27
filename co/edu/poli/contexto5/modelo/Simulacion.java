package co.edu.poli.contexto5.modelo;

public class Simulacion {
    private String instructor;
    private String nombre;
    private String centro;
    private String empresa; // Empresa
    private String construccion;
    private String estudiantes;
    private String lugar;
    private String patrocinador;
    private String id;

    public Simulacion(String instructor, String nombre, String centro, String empresa,
                        String construccion, String estudiantes, String lugar,
                        String patrocinador, String id) {
        this.instructor = instructor;
        this.nombre = nombre;
        this.centro = centro;
        this.empresa = empresa;
        this.construccion = construccion;
        this.estudiantes = estudiantes;
        this.lugar = lugar;
        this.patrocinador = patrocinador;
        this.id = id;
    }

    public String getInstructor() { return instructor; }
    public void setInstructor(String instructor) { this.instructor = instructor; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCentro() { return centro; }
    public void setCentro(String centro) { this.centro = centro; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getConstruccion() { return construccion; }
    public void setConstruccion(String construccion) { this.construccion = construccion; }

    public String getEstudiantes() { return estudiantes; }
    public void setEstudiantes(String estudiantes) { this.estudiantes = estudiantes; }

    public String getLugar() { return lugar; }
    public void setLugar(String lugar) { this.lugar = lugar; }

    public String getPatrocinador() { return patrocinador; }
    public void setPatrocinador(String patrocinador) { this.patrocinador = patrocinador; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    @Override
    public String toString() {
        return "Simulacion{" +
                "instructor='" + instructor + '\'' +
                ", nombre='" + nombre + '\'' +
                ", centro='" + centro + '\'' +
                ", empresa='" + empresa + '\'' +
                ", construccion='" + construccion + '\'' +
                ", estudiantes='" + estudiantes + '\'' +
                ", lugar='" + lugar + '\'' +
                ", patrocinador='" + patrocinador + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
