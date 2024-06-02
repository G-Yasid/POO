import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        empleado[] empleados = new empleado[3];
        empleados[0] = new empleadoTiempoCompleto( "Marta", "2342",  10750.34);
        empleados[1] = new empleadoMedioTiempo("Ruth", "5678", 55, 30);
        empleados[2] = new empleadoTiempoCompleto("yasid", "91011", 4560.34);
    }

    for (empleado Empleado : Empleados) {
        System.out.println("Nombre: " + empleado.getNombre() + "\nSalario mensual: $" + empleado.calcularsalario());
        System.out.println("¿Deseas realizar un aumento de salario? (s/n):");
        char opcion = input.nextLine().charAt(0);
        if (opcion == 's') {
            System.out.println("Ingrese el porcentaje de aumento: ");
            double porcentaje = input.nextDouble();
            input.nextLine();
            System.out.println("El salario total de " + empleado.getNombre() + " es de " + empleado.aumentarSalario(porcentaje) + "\n");
        }
    }
}