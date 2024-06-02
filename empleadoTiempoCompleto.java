public class empleadoTiempoCompleto extends empleado {
    private double salarioanual;

    public empleadoTiempoCompleto(String Nombre, String numeroidentificación, double salarioanual) {
        super(Nombre, numeroidentificación);
        this.salarioanual = salarioanual;
    }

    @Override
    public double calcularsalario() {
        return salarioanual / 12; // salario mensual.
    }
}