public class CanalNotificacionPush implements CanalEnvio { // Clase CanalNotificacionPush que implementa CanalEnvio
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { // Implementación del método enviarMensaje para notificaciones push
        System.out.println("Enviando notificación push a " + destinatario + " con el mensaje: " + mensaje);
    }
}
