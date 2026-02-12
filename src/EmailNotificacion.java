class EmailNotificacion extends Notificacion {

    public EmailNotificacion(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando Email: " + mensaje);
    }

    @Override
    public void adjuntarArchivo(String archivo) {
        System.out.println("Adjuntando archivo al Email: " + archivo);
    }
}