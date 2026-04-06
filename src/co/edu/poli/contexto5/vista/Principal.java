package co.edu.poli.contexto5.vista;

import co.edu.poli.contexto5.modelo.Combustible;
import co.edu.poli.contexto5.modelo.Empresa;
import co.edu.poli.contexto5.modelo.Encargado;
import co.edu.poli.contexto5.modelo.Estacion;
import co.edu.poli.contexto5.modelo.Herramienta;
import co.edu.poli.contexto5.modelo.Ingeniero;
import co.edu.poli.contexto5.modelo.Mantenimiento;
import co.edu.poli.contexto5.modelo.Mision;
import co.edu.poli.contexto5.modelo.Personal;
import co.edu.poli.contexto5.modelo.Satelite;
import co.edu.poli.contexto5.modelo.Simulacion;
import co.edu.poli.contexto5.servicios.ImplementacionCRUD;
import co.edu.poli.contexto5.servicios.Punto;
import java.util.Scanner;

/**
 * Clase Principal que orquesta la ejecución del sistema de gestión espacial.
 * * Esta clase realiza una demostración inicial de la instanciación de objetos,
 * polimorfismo y sobrecarga, seguida de un menú interactivo para gestionar
 * personal mediante operaciones CRUD y persistencia en archivos.
 * * @author cathe586
 * @version 2.0
 */
public class Principal {

/**
     * Punto de entrada de la aplicación.
     * @param args Argumentos de línea de comandos.
     */
public static void main(String[] args) {

        // --- BLOQUE DE INSTANCIACIÓN ORIGINAL ---
        
        Punto punto = new Punto("Bogota", "P001", "ENC001", "2020");
        System.out.println(">> Punto: " + punto);
        System.out.println("   " + punto.calcularEdadDePunto("2020"));
        System.out.println();

        Empresa empresa = new Empresa(null, 2010, "ENC001", "Satelites de comunicacion",
                "contacto@empresa.com", "Bogota", "SateliteCo S.A.S", "2024-01-15",
                "Monitoreo espacial");

        Encargado encargado = new Encargado("Maria Perez", "32", "Doctorado", "SAT001",
                "Perez", "25", "2024-01-15", "Directora", "maria@email.com",
                "M-2024", "Colombiana", "EMP001", "ENC001", "Experta en satelites");

        Combustible combustible = new Combustible("HydroFuel", "Hidrazina", "Transparente",
                "500L", true, "Deposito A", "Alta pureza", "COMB001");

        Satelite satelite = new Satelite("SAT-001", "Explorer I", "Comunicacion",
                "Orbita baja", "2022", 3.5, 450.0, "MANT001",
                "EMP001", "Alta", "COMB001");

        Herramienta herramienta = new Herramienta(25.5, "Llave de torsion", "Ajuste de pernos",
                "Llave T-200", "herramientas@empresa.com", "HER001",
                "2023-06-01", "TorqueMaster", "TM-2023-001", "Rojo");

        Mantenimiento mantenimiento = new Mantenimiento("2024-01-15", "Preventivo",
                "ENC001", "SAT-001", "10:00", "Alto", "Hangar 3",
                "MANT001", "MANT000", "HER001");

        Simulacion simulacion = new Simulacion("Ing. Rodriguez", "Simulacion Orbital",
                "Centro Espacial", "EMP001", "2023-11-01",
                "15", "Sala Virtual A", "NASA Colombia", "SIM001");

        Mision mision = new Mision("Exploracion", "2024-02-01", "REG-2024-01",
                "SAT-001", "ENC001", "2024-08-01", "Orbita polar",
                "50 muestras", "MIS001", "SIM001");

        Estacion estacion = new Estacion("EST-001", "Bogota D.C.", "EMP001",
                "SAT-001", "Estacion Central", "estacion@empresa.com",
                "EST001", "ENC001");

        System.out.println(">> Empresa:      " + empresa);
        System.out.println(">> Encargado:    " + encargado);
        System.out.println(">> Combustible:  " + combustible);
        System.out.println(">> Satelite:     " + satelite);
        System.out.println(">> Herramienta:  " + herramienta);
        System.out.println(">> Mantenimiento:" + mantenimiento);
        System.out.println(">> Simulacion:   " + simulacion);
        System.out.println(">> Mision:       " + mision);
        System.out.println(">> Estacion:     " + estacion);
        System.out.println();

        // --- DEMOSTRACIÓN DE SOBRECARGA Y POLIMORFISMO ---
        
        System.out.println("   PUNTO 3 - SOBRECARGA DE METODOS (Personal)");
        Personal personal = new Ingeniero("Natural", "Ingenieria", "Tecnico", 1.75, 30,
                "EMP001", "123456", "08:00", "Bogota", "Tecnico Senior",
                "Carlos Lopez", "1994-05-10", 70.5, "Disco A", "3001234567",
                "carlos@email.com", "2024-01-15", "General");

        System.out.println(personal.calcularTiempoTrabajo("2020-01-01"));
        System.out.println(personal.calcularTiempoTrabajo("08:00", "2020-01-01"));
        System.out.println(personal.calcularTiempoTrabajo("08:00", "2020-01-01", "Turno regular"));
        System.out.println();

        // --- MENÚ INTERACTIVO (CRUD + ARCHIVOS) ---
        
        ImplementacionCRUD crud = new ImplementacionCRUD();
        Scanner sc = new Scanner(System.in);
        String path = "./";
        String name = "persistencia_personal.dat";
        int opcion = 0;

        do {
            System.out.println("\n********** MENÚ DE OPERACIONES  **********");
        System.out.println("1. Crear Personal (Ingeniero)");
        System.out.println("2. Leer Personal (ID)");
        System.out.println("3. Actualizar Personal (ID)");
        System.out.println("4. Eliminar Personal (ID)");
        System.out.println("5. Listar Contenido Actual");
        System.out.println("6. Serializar (Guardar en Archivo)");
        System.out.println("7. Deserializar (Cargar de Archivo)");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opción: ");

        try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                case 1:
                        System.out.print("Nombre: "); String nom = sc.nextLine();
                        System.out.print("ID: "); String idC = sc.nextLine();
                        Ingeniero nuevoIng = new Ingeniero("Natural", "Ing", "Tec", 1.80, 28, 
                                "EMP01", idC, "07:00", "Bogota", "Ingeniero", 
                                nom, "1996-01-01", 75.0, "D1", "300", "mail@mail.com", "2024", "Sistemas");
                        System.out.println(crud.crear(nuevoIng));
                        break;

                case 2:
                        System.out.print("ID a buscar: "); String idL = sc.nextLine();
                        Personal pL = crud.leer(idL);
                        System.out.println(pL != null ? pL : "No encontrado.");
                        break;

                case 3:
                        System.out.print("ID a actualizar: "); String idA = sc.nextLine();
                        System.out.print("Nuevo Nombre: "); String nNom = sc.nextLine();
                        Personal pA = new Ingeniero("Natural", "Ing", "Tec", 1.80, 28, 
                                "EMP01", idA, "07:00", "Bogota", "Ingeniero", 
                                nNom, "1996-01-01", 75.0, "D1", "300", "mail@mail.com", "2024", "Sistemas");
                        System.out.println(crud.actualizar(idA, pA));
                        break;

                case 4:
                        System.out.print("ID a eliminar: "); String idE = sc.nextLine();
                        System.out.println(crud.eliminar(idE));
                        break;

                case 5:
                        System.out.println("--- Listado de Memoria ---");
                        for (Personal p : crud.getLista()) {
                        if (p != null) System.out.println(p.getNombre() + " [" + p.getIdentificacion() + "]");
                        else System.out.println("[Vacío]");
                        }
                        break;

                case 6:
                        System.out.println(crud.serializar(crud.getLista(), path, name));
                        break;

                case 7:
                        Personal[] recuperado = crud.deserializar(path, name);
                        if (recuperado != null) System.out.println("Datos cargados exitosamente.");
                        break;

                case 8:
                        System.out.println("Saliendo...");
                        break;

                        default:
                        System.out.println("Opción inválida.");
                }
        } catch (Exception e) {
                System.out.println("Error: Ingrese un número válido.");
        
        }
        } while (opcion != 8);

        sc.close();
}
}




