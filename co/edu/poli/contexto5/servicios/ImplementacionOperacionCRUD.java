package co.edu.poli.contexto5.servicios;

import co.edu.poli.contexto5.modelo.Personal;

public class ImplementacionOperacionCRUD implements OperacionCRUD {

    private Personal[] lista = new Personal[2];

    @Override
    public String crear(Personal p) {
        if (p == null) {
            return "Error: objeto vacío";
        }

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = p;
                return "Creado correctamente";
            }
        }

        return "Error: lista llena";
    }

    @Override
    public Personal leer(String id) {
        for (Personal p : lista) {
            if (p != null && p.getIdentificacion().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public String actualizar(String id, Personal nuevo) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getIdentificacion().equals(id)) {
                lista[i] = nuevo;
                return "Actualizado correctamente";
            }
        }
        return "No encontrado";
    }

    @Override
    public String eliminar(String id) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getIdentificacion().equals(id)) {
                lista[i] = null;
                return "Eliminado correctamente";
            }
        }
        return "No encontrado";
    }
}