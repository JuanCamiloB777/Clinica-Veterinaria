public class Ave extends Animal {
    private double pesoGramos;

    public Ave(String nombre, int edad, double pesoGramos, String dueno) {
        super(nombre, edad, dueno);
        this.pesoGramos = pesoGramos;
    }

    @Override
    public double calcularCostoConsulta() {
        return 28000 + 100 * pesoGramos;
    }
}