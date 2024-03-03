package empleados;

public class Empleado {
    private static int Empleados1 = 0;
    private int identificador;
    private String nombre;
    private String apellidos;
    private double salario;

   
    
    public Empleado(String nombre, String apellidos, double salarioMensual) {
        this.identificador = ++Empleados1;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salarioMensual;
    
    
    }

    
    
    public static double calcularTotalNomina(Empleado[] empleados) {
        double totalNomina = 0;
        for (Empleado empleado : empleados) {
            totalNomina += empleado.salario;
        }
        return totalNomina;
    }
}
