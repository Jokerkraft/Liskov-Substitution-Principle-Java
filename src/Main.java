public class Main {
    public static void main(String[] args) {

        Notificacion noti1 = new EmailNotificacion("Factura disponible");
        noti1.enviar();
        noti1.adjuntarArchivo("factura.pdf");

        System.out.println();

        // Aquí ocurre el problema
        Notificacion noti2 = new SMSNotificacion("Código de verificación");
        noti2.enviar();

        // Esto rompe el programa
        noti2.adjuntarArchivo("archivo.txt");
    }
}
