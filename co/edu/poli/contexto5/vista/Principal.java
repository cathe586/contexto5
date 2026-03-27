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
import co.edu.poli.contexto5.modelo.Supervisor;
import co.edu.poli.contexto5.servicios.ImplementacionOperacionCRUD;
import co.edu.poli.contexto5.servicios.Punto;

public class Principal {

        public static void main(String[] args) {

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

        System.out.println("   PUNTO 3 - SOBRECARGA DE METODOS (Personal)");

        
        Personal personal = new Ingeniero("Natural", "Ingenieria", "Tecnico", 1.75, 30,
                "EMP001", "123456", "08:00", "Bogota", "Tecnico Senior",
                "Carlos Lopez", "1994-05-10", 70.5, "Disco A", "3001234567",
                "carlos@email.com", "2024-01-15", "General");

        System.out.println(personal.calcularTiempoTrabajo("2020-01-01"));
        System.out.println(personal.calcularTiempoTrabajo("08:00", "2020-01-01"));
        System.out.println(personal.calcularTiempoTrabajo("08:00", "2020-01-01", "Turno regular"));

        System.out.println();
        System.out.println(personal.realizarMantenimiento("2024-01-15"));
        System.out.println(personal.realizarMantenimiento("2024-01-15", "Carlos Lopez"));
        System.out.println(personal.realizarMantenimiento("2024-01-15", "Carlos Lopez", "Preventivo"));
        System.out.println();

        System.out.println("   PUNTO 3 - SOBREESCRITURA DE METODOS");

        Ingeniero ingeniero = new Ingeniero("Natural", "Maestria", "Ingeniero", 1.80, 35,
                "EMP001", "654321", "09:00", "Medellin", "Ingeniero Senior",
                "Ana Torres", "1989-03-22", 65.0, "Disco B", "3109876543",
                "ana@email.com", "2024-01-15", "Telecomunicaciones");

        Supervisor supervisor = new Supervisor("Natural", "Especializacion", "Supervisor", 1.70, 40,
                "EMP001", "789012", "07:00", "Cali", "Supervisor General",
                "Luis Gomez", "1984-07-18", 80.0, "Disco C", "3157654321",
                "luis@email.com", "2024-01-15");

        Ingeniero ingeniero2 = new Ingeniero("natural", "tecnico", "ingeniero", 1.65, 30, "ELTC78",
                "321654", "11:00", "Barranquilla", "ingeniero junior", "andres castro",
                "1993-10-05", 98.0, "disco n", "3005551234", "andres@email.com", "2024-01-15",
                "mecanica");

        
        Personal p1 = new Ingeniero("Natural", "Tecnico", "Operario", 1.68, 25,
                "EMP001", "111", "06:00", "Bogota", "Operario",
                "Pedro Ramirez", "1999-01-01", 68.0, "Disco D", "3001111111",
                "pedro@email.com", "2024-01-15", "General");

        Personal p2 = new Supervisor("Natural", "Profesional", "Analista", 1.72, 28,
                "EMP001", "222", "07:00", "Bogota", "Analista",
                "Sofia Castro", "1996-05-20", 55.0, "Disco E", "3002222222",
                "sofia@email.com", "2024-01-15");





        Personal[] equipo = { personal, ingeniero, supervisor, ingeniero2 };

        System.out.println("--- obtenerRol() ---");
        for (Personal p : equipo) {
                System.out.println(p.obtenerRol());
        }

        System.out.println("--- calcularTiempoTrabajo ---");
        for (Personal p : equipo) {
                System.out.println(p.calcularTiempoTrabajo("08:00", "2022-03-01"));
        }

        System.out.println("Total Personal: " + Personal.getTotalPersonal());

ImplementacionOperacionCRUD crud = new ImplementacionOperacionCRUD();


System.out.println("\n--- CREATE ---");
System.out.println(crud.crear(p1));
System.out.println(crud.crear(p2));

System.out.println("\n--- READ ---");
System.out.println(crud.leer("111"));
System.out.println(crud.leer("222"));

System.out.println("\n--- UPDATE ---");
System.out.println(crud.actualizar("111", supervisor));
System.out.println(crud.leer("111"));



System.out.println("\n--- ABSTRACTO ---");
for (String id : new String[]{"111", "222"}) {
Personal p = crud.leer(id);
        if (p != null) {
        System.out.println(p.realizarMantenimientoAbstracto("2026"));
}
}

System.out.println("\n--- DELETE ---");
System.out.println(crud.eliminar("222"));
System.out.println(crud.leer("222"));
}
}





