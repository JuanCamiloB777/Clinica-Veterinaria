public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String dueno;

    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public abstract double calcularCostoConsulta();

    public void imprimirFicha() {
        System.out.println("Ficha del animal");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Dueño: " + dueno);
        System.out.println("Costo de consulta: $" + calcularCostoConsulta());
    }
}