package co.edu.poli.contexto5.servicios;

import co.edu.poli.contexto5.modelo.Personal;

public interface OperacionCRUD {

    String crear(Personal p);

    Personal leer(String id);

    String actualizar(String id, Personal p);

    String eliminar(String id);
}