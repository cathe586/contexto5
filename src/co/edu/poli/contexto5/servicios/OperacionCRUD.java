package co.edu.poli.contexto5.servicios;

import co.edu.poli.contexto5.modelo.Personal;

/**
 * Interfaz que define las operaciones básicas de CRUD (Create, Read, Update, Delete)
 * para la gestión de objetos de tipo Personal.
 * @author cathe586
 */
public interface OperacionCRUD {

    /**
     * Registra un nuevo objeto Personal en el sistema.
     * @param p El objeto Personal que se desea almacenar.
     * @return Un mensaje indicando el resultado de la operación (éxito o error).
     */
    String crear(Personal p);

    /**
     * Busca y retorna un objeto Personal basado en su identificador único.
     * @param id El documento de identificación del personal a buscar.
     * @return El objeto Personal encontrado, o null si no existe.
     */
    Personal leer(String id);

    /**
     * Reemplaza la información de un registro existente con los datos de un nuevo objeto.
     * @param id La identificación del registro que se desea modificar.
     * @param p El nuevo objeto Personal con la información actualizada.
     * @return Un mensaje indicando si la actualización fue exitosa o si el registro no existe.
     */
    String actualizar(String id, Personal p);

    /**
     * Elimina un registro de Personal del sistema según su identificación.
     * @param id El identificador único del personal que se desea remover.
     * @return Un mensaje indicando si la eliminación fue exitosa o si el registro no existe.
     */
    String eliminar(String id);
}