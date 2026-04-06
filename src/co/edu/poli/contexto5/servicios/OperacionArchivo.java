package co.edu.poli.contexto5.servicios;

import co.edu.poli.contexto5.modelo.Personal;

public interface OperacionArchivo {
    
    /**
     * Guarda el arreglo de personal en un archivo físico.
     */
    public String serializar(Personal[] personal, String path, String name);

    /**
     * Recupera el arreglo de personal desde un archivo físico.
     */
    public Personal[] deserializar(String path, String name);
}