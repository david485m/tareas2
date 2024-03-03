package clases1;

import conversiones.Temperatura;
import empleados.Empleado;

public class funcion {
    public static void main(String[] args) {
        
        double fahrenheit = 32;
        
        double celsius = Temperatura.fahrenheitACelsius(fahrenheit);
        
        System.out.println(fahrenheit + " grados Fahrenheit son " + celsius + " grados Celsius.");

        celsius = 0;
        
        fahrenheit = Temperatura.celsiusAFahrenheit(celsius);
        
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");

          Empleado[] empleados = {empleado1, empleado2, empleado3};
        
        Empleado empleado1 = new Empleado("david", "tello", 2000);
        
        Empleado empleado2 = new Empleado("jose", "muñoz", 2500);
        
        Empleado empleado3 = new Empleado("andrea", "perez", 3000);

      

        double totalNomina = Empleado.calcularTotalNomina(empleados);
        
        System.out.println("El total de la nómina es: " + totalNomina);
    }
}
