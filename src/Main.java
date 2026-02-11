public class Main {
    public static void main(String[] args) {
        Repositorio repo = new RepositorioSoloLectura();

        System.out.println("Buscando: " + repo.buscar(1));

        // ¡Aquí tronará el programa!
        // Un cliente espera que 'guardar' funcione porque la interfaz lo prometió.
        repo.guardar("Datos importantes");
    }
}