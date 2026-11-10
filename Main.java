public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro("Max", 4, "Carlos", "Labrador");
        Gato gato = new Gato("Michi", 3, true, "Ana");
        Ave ave = new Ave("Piolín", 2, 350.0, "Luis");

        Animal[] animales = {perro, gato, ave};

        for (Animal animal : animales) {
            animal.imprimirFicha();
            System.out.println();
        }

        perro.registrarVacuna("Rabia");
        perro.registrarVacuna("Parvovirus");
        gato.registrarVacuna("Triple felina");

        System.out.println("Vacunas de " + perro.nombre + ": "
                + perro.getVacunasAplicadas());
        System.out.println("Vacunas de " + gato.nombre + ": "
                + gato.getVacunasAplicadas());

        Clinica clinica = new Clinica("VetCare", "Av. Central 123");

        Asegurable[] asegurables = {perro, gato, clinica};

        for (Asegurable asegurable : asegurables) {
            System.out.println("Póliza: " + asegurable.obtenerNumeroPoliza());
            System.out.println("Prima anual: $"
                    + asegurable.calcularPrimaSeguro());
            System.out.println();
        }
    }
}