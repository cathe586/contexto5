package co.edu.poli.contexto5.vista;

import co.edu.poli.contexto5.modelo.Abc;
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

                Personal personal = new Personal("Natural", "Ingenieria", "Tecnico", 1.75, 30,
                                "EMP001", "123456", "08:00", "Bogota", "Tecnico Senior",
                                "Carlos Lopez", "1994-05-10", 70.5, "Disco A", "3001234567",
                                "carlos@email.com", "2024-01-15");

                // Sobrecarga v1 - 1 argumento
                System.out.println(personal.calcularTiempoTrabajo("2020-01-01"));
                // Sobrecarga v2 - 2 argumentos
                System.out.println(personal.calcularTiempoTrabajo("08:00", "2020-01-01"));
                // Sobrecarga v3 - 3 argumentos
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

                Personal[] equipo = { personal, ingeniero, supervisor, ingeniero2 };
                System.out.println("--- obtenerRol() sobreescrito en cada subclase ---");
                for (Personal p : equipo) {
                        System.out.println(p.obtenerRol());
                }
                System.out.println();

                System.out.println("--- calcularTiempoTrabajo(hora, fecha) sobreescrito ---");
                for (Personal p : equipo) {
                        System.out.println(p.calcularTiempoTrabajo("08:00", "2022-03-01"));
                }
                System.out.println();

                System.out.println("   PUNTO 4 - ATRIBUTO ESTATICO totalPersonal");

                System.out.println("Total de objetos Personal creados hasta ahora: "
                                + Personal.getTotalPersonal());
                System.out.println();

                Personal p1 = new Personal("Natural", "Tecnico", "Operario", 1.68, 25,
                                "EMP001", "111", "06:00", "Bogota", "Operario",
                                "Pedro Ramirez", "1999-01-01", 68.0, "Disco D", "3001111111",
                                "pedro@email.com", "2024-01-15");

                Personal p2 = new Personal("Natural", "Profesional", "Analista", 1.72, 28,
                                "EMP001", "222", "07:00", "Bogota", "Analista",
                                "Sofia Castro", "1996-05-20", 55.0, "Disco E", "3002222222",
                                "sofia@email.com", "2024-01-15");

                System.out.println("totalPersonal visto desde Personal (clase):  " + Personal.getTotalPersonal());
                System.out.println("totalPersonal visto desde p1 (objeto):       " + Personal.getTotalPersonal());
                System.out.println("totalPersonal visto desde p2 (objeto):       " + Personal.getTotalPersonal());
                System.out.println("totalPersonal visto desde ingeniero:         " + Personal.getTotalPersonal());
                System.out.println("totalPersonal visto desde supervisor:        " + Personal.getTotalPersonal());
                System.out.println();

                System.out.println("--- Modificando totalPersonal a 99 ---");
                Personal.setTotalPersonal(99);
                System.out.println("personal.getTotalPersonal():   " + Personal.getTotalPersonal());
                System.out.println("ingeniero.getTotalPersonal():  " + Personal.getTotalPersonal());
                System.out.println("supervisor.getTotalPersonal(): " + Personal.getTotalPersonal());
                System.out.println("p1.getTotalPersonal():         " + Personal.getTotalPersonal());
                System.out.println("p2.getTotalPersonal():         " + Personal.getTotalPersonal());
                System.out.println("-> Todos los objetos reflejan el mismo valor: " + Personal.getTotalPersonal());
                System.out.println();

                System.out.println();

                // taller 6

                Personal[] Arreglo = new Personal[5];
                Arreglo[0] = p1;
                Arreglo[1] = p2;
                Arreglo[2] = ingeniero2;
                Arreglo[3] = ingeniero;
                Arreglo[4] = supervisor;
                for (Personal p : Arreglo) {
                        if(p != null){
                        System.out.println(p.toString());
                        }

                }

                System.out.println(Abc.operacion(4));
                System.out.println(Abc.operacion(0));
                System.out.println(Abc.operacion(7));

                System.out.println(Abc.operacion2(ingeniero2));
                System.out.println(Abc.operacion2(p1));
                System.out.println(Abc.operacion2(supervisor));

        }

}