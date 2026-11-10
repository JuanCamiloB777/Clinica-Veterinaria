public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private int vacunasAplicadas;
    private String numeroPoliza;

    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
        this.vacunasAplicadas = 0;
        this.numeroPoliza = "POL-PERRO-" + nombre.toUpperCase();
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000 + 3000 * edad;
    }

    @Override
    public void registrarVacuna(String nombre) {
        vacunasAplicadas++;
        System.out.println("Vacuna registrada: " + nombre);
    }

    @Override
    public int getVacunasAplicadas() {
        return vacunasAplicadas;
    }

    @Override
    public double calcularPrimaSeguro() {
        return 80000 * edad;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}