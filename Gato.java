public class Gato extends Animal implements Vacunable, Asegurable {
    private boolean esEsterilizado;
    private int vacunasAplicadas;
    private String numeroPoliza;

    public Gato(String nombre, int edad, boolean esEsterilizado, String dueno) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
        this.vacunasAplicadas = 0;
        this.numeroPoliza = "POL-GATO-" + nombre.toUpperCase();
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
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
        if (esEsterilizado) {
            return 120000;
        } else {
            return 200000;
        }
    }

    @Override
    public String obtenerNumeroPoliza() {
        return numeroPoliza;
    }
}