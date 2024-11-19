public class CanalCorreo implements CanalEnvio { // Clase CanalCorreo que implementa CanalEnvio
    @Override
    public void enviarMensaje(String destinatario, String mensaje) { // Implementación del método enviarMensaje para correos
        System.out.println("Enviando correo a " + destinatario + " con el mensaje: " + mensaje);
    }
}
