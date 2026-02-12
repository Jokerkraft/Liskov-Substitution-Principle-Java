class SMSNotificacion extends Notificacion {

    public SMSNotificacion(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS: " + mensaje);
    }

    @Override
    public void adjuntarArchivo(String archivo) {
        throw new UnsupportedOperationException("SMS no soporta archivos");
    }
}