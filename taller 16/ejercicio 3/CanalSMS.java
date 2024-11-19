public class CanalSMS implements CanalEnvio { // Clase CanalSMS que implementa CanalEnvio
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { // Implementación del método enviarMensaje para SMS
        System.out.println("Enviando SMS a " + destinatario + " con el mensaje: " + mensaje);
    }
}
