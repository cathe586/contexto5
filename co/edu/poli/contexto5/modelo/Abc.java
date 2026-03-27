package co.edu.poli.contexto5.modelo;

public class Abc {
    public static Personal operacion(int per) {
        if (per == 0) {
            return new Ingeniero("natural", "profesional", "ingeniero", 1.95, 30, "ELTC78",
                    "3216754", "14:00", "Bogota", "ingeniero junior", "andres castro",
                    "1999-11-08", 108.0, "disco f", "3006531234", "andres@email.com", "2024-01-15",
                    "mecanica");

        } else if (per == 4) {
            return new Ingeniero("natural", "tecnico", "ingeniero", 1.65, 30, "ELTC78",
                    "321654", "11:00", "Barranquilla", "ingeniero junior", "andres castro",
                    "1993-10-05", 98.0, "disco n", "3005551234", "andres@email.com", "2024-01-15",
                    "mecanica");
        } else {
            return new Supervisor("Natural", "Especializacion", "Supervisor", 1.70, 40,
                    "EMP001", "789012", "07:00", "Cali", "Supervisor General",
                    "Luis Gomez", "1984-07-18", 80.0, "Disco C", "3157654321",
                    "luis@email.com", "2024-01-15");
        }

    }

    public static String operacion2(Personal obj) {
        if (obj.getClass().getSimpleName().equals("Personal")) {
            return "este es un objeto de clase Personal";
        } else if (obj.getClass().getSimpleName().equals("Ingeniero")) {
            return "este es un objeto de clase Ingeniero";
        } else {
            return "este es un objeto de clase Supervisor";
        }
    }
}
