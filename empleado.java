public abstract class empleado {
    private String Nombre;
    private String numeroidentificación;

    public empleado(String Nombre, String numeroidentificación) {
        this.Nombre = Nombre;
        this.numeroidentificación = numeroidentificación;
    }

    public static String getNombre() {
        return Nombre;
    }

    public String getnumeroidentificación() {
        return numeroidentificación;
    }

    public abstract double calcularsalario();

    public static double aumentarSalario(double porcentaje) {
        return calcularsalario() * (porcentaje / 100) + calcularsalario();
    }
}