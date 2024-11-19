public class Prueba { // Clase de prueba para verificar el funcionamiento de los diferentes canales de envío de mensajes
    public static void main(String[] args) { // Método principal, punto de entrada de la aplicación
        CanalEnvio correo = new CanalCorreo(); // Crea una instancia de CanalCorreo
        CanalEnvio sms = new CanalSMS(); // Crea una instancia de CanalSMS
        CanalEnvio notificacionPush = new CanalNotificacionPush(); // Crea una instancia de CanalNotificacionPush

        correo.enviarMensaje("email@ejemplo.com", "Hola, este es un correo electrónico"); // Envia un correo electrónico
        sms.enviarMensaje("123456789", "Hola, este es un SMS"); // Envía un SMS
        notificacionPush.enviarMensaje("usuario123", "Hola, esta es una notificación push"); // Envía una notificación push
    }
}
