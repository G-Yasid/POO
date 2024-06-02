public class empleadoMedioTiempo extends empleado {
    private double salarioPorhora;
    private int horasTrabajadasPorSemana;

    public empleadoMedioTiempo(String Nombre, String numeroidentificación, double salarioPorhora, int horasTrabajadasPorSemana) {
        super(Nombre, numeroidentificación);
        this.salarioPorhora = salarioPorhora;
        this.horasTrabajadasPorSemana = horasTrabajadasPorSemana;
    }

    @Override
    public double calcularsalario() {
        return salarioPorhora * horasTrabajadasPorSemana * 4; // salario mensual
    }
}