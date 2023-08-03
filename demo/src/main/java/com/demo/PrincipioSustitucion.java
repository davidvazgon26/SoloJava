package com.demo;

public class PrincipioSustitucion {

    interface Acelerable {
        void acelerar();
    }

    static class Vehiculo implements Acelerable {
        @Override
        public void acelerar() {
            System.out.println("Acelerando vehículo genérico...");
        }
    }

    static class Coche extends Vehiculo {
        @Override
        public void acelerar() {
            System.out.println("Acelerando coche...");
        }

        void encenderRadio() {
            System.out.println("Radio encendido en el coche...");
        }
    }

    public static void main(String[] args) {
        // Crear una instancia de Vehiculo y asignarla a una referencia de tipo
        // Acelerable
        Acelerable miVehiculo = new Vehiculo();
        miVehiculo.acelerar(); // Salida: "Acelerando vehículo genérico..."

        // Crear una instancia de Coche y asignarla a la misma referencia de tipo
        // Acelerable
        miVehiculo = new Coche();
        miVehiculo.acelerar(); // Salida: "Acelerando coche..."

        // El objeto referenciado por miVehiculo es un Coche, pero no podemos llamar a
        // encenderRadio()
        // ya que la referencia es de tipo Acelerable, que no tiene ese método
        // miVehiculo.encenderRadio(); // Esto dará un error de compilación

        // Sin embargo, si cambiamos la referencia a un tipo Coche, ahora podemos llamar
        // a encenderRadio()
        if (miVehiculo instanceof Coche) {
            Coche miCoche = (Coche) miVehiculo;
            miCoche.encenderRadio(); // Salida: "Radio encendido en el coche..."
        }
    }

}
