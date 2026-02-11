public class RepositorioSoloLectura implements Repositorio {
    @Override
    public void guardar(String datos) {
        // Lanzamos una excepción porque NO podemos cumplir el contrato de la interfaz
        throw new UnsupportedOperationException("Error: No se permite escribir en este repositorio.");
    }

    @Override
    public String buscar(int id) {
        return "Datos de solo lectura (Configuración)";
    }
}