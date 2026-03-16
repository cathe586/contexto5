package co.edu.poli.contexto5.servicios;

public class Punto {
    private String ubicacion;
    private String id;
    private String encargado; // Encargado
    private String aniocreacion;

    public Punto(String ubicacion, String id, String encargado, String aniocreacion) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.encargado = encargado;
        this.aniocreacion = aniocreacion;
    }

    public String getUbicacion() { return ubicacion; }
    public void setUbicacion(String ubicacion) { this.ubicacion = ubicacion; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getEncargado() { return encargado; }
    public void setEncargado(String encargado) { this.encargado = encargado; }

    public String getAniocreacion() { return aniocreacion; }
    public void setAniocreacion(String aniocreacion) { this.aniocreacion = aniocreacion; }

    public String calcularEdadDePunto(String anioscreacion) {
        return "Edad calculada desde: " + anioscreacion;
    }

    @Override
    public String toString() {
        return "Punto{" +
                "ubicacion='" + ubicacion + '\'' +
                ", id='" + id + '\'' +
                ", encargado='" + encargado + '\'' +
                ", aniocreacion='" + aniocreacion + '\'' +
                '}';
    }
}
