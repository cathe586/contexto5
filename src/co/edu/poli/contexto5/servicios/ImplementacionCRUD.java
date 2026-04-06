package co.edu.poli.contexto5.servicios;

import co.edu.poli.contexto5.modelo.Personal;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


/**
 * Clase que implementa tanto las operaciones CRUD en memoria como la
 * persistencia en archivos (Serialización).
 * @author cathe586
 */
public class ImplementacionCRUD implements OperacionCRUD, OperacionArchivo {

    private Personal[] lista = new Personal[2];

    // --- TU CÓDIGO ORIGINAL (CRUD) ---

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

    // --- IMPLEMENTACIÓN DE OPERACIONARCHIVO (NUEVO) ---

    @Override
    public String serializar(Personal[] personal, String path, String name) {
        try {
            FileOutputStream archivo = new FileOutputStream(path + name);
            ObjectOutputStream salida = new ObjectOutputStream(archivo);
            salida.writeObject(personal);
            salida.close();
            archivo.close();
            return "Archivo guardado exitosamente";
        } catch (IOException e) {
            return "Error al serializar: " + e.getMessage();
        }
    }

    @Override
    public Personal[] deserializar(String path, String name) {
        Personal[] personalRecuperado = null;
        try {
            FileInputStream archivo = new FileInputStream(path + name);
            ObjectInputStream entrada = new ObjectInputStream(archivo);
            personalRecuperado = (Personal[]) entrada.readObject();
            this.lista = personalRecuperado; // Sincroniza el arreglo interno con el archivo
            entrada.close();
            archivo.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al deserializar: " + e.getMessage());
        }
        return personalRecuperado;
    }

    /**
     * Método adicional para obtener el arreglo desde la Vista (Principal).
     * @return El arreglo de Personal de tamaño 2.
     */
    public Personal[] getLista() {
        return lista;
    }
}