package co.edu.poli.contexto5.modelo;

/**
 * Representa un entorno de simulación educativa o técnica, gestionando instructores,
 * estudiantes y patrocinadores asociados.
 * @author cathe586
 */
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

    /**
     * Constructor para inicializar una nueva Simulación con todos sus parámetros.
     */
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

    /** @return El nombre del instructor a cargo */
    public String getInstructor() { return instructor; }
    /** @param instructor El nuevo instructor a asignar */
    public void setInstructor(String instructor) { this.instructor = instructor; }

    /** @return El nombre de la simulación */
    public String getNombre() { return nombre; }
    /** @param nombre El nuevo nombre de la simulación */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /** @return El centro de formación o investigación */
    public String getCentro() { return centro; }
    /** @param centro El nuevo centro a asignar */
    public void setCentro(String centro) { this.centro = centro; }

    /** @return La empresa vinculada a la simulación */
    public String getEmpresa() { return empresa; }
    /** @param empresa La nueva empresa a asignar */
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    /** @return El estado o tipo de construcción de la simulación */
    public String getConstruccion() { return construccion; }
    /** @param construccion El nuevo estado de construcción */
    public void setConstruccion(String construccion) { this.construccion = construccion; }

    /** @return El listado o descripción de los estudiantes */
    public String getEstudiantes() { return estudiantes; }
    /** @param estudiantes Los nuevos estudiantes a asignar */
    public void setEstudiantes(String estudiantes) { this.estudiantes = estudiantes; }

    /** @return El lugar físico o virtual de la simulación */
    public String getLugar() { return lugar; }
    /** @param lugar El nuevo lugar a asignar */
    public void setLugar(String lugar) { this.lugar = lugar; }

    /** @return El patrocinador del proyecto */
    public String getPatrocinador() { return patrocinador; }
    /** @param patrocinador El nuevo patrocinador a asignar */
    public void setPatrocinador(String patrocinador) { this.patrocinador = patrocinador; }

    /** @return El ID único de la simulación */
    public String getId() { return id; }
    /** @param id El nuevo ID a asignar */
    public void setId(String id) { this.id = id; }

    /**
     * Retorna una representación en texto del objeto Simulacion.
     */
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