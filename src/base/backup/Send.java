package base.backup;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Send { /// ISTO SOMENTE FUNCIONA COM JDK 8

    private String remitente = "ticoper19@gmail.com";  //Para la dirección nomcuenta@gmail.com
    private String clave = "arctoolZ1990";
    String archivo = "ruta/al/archivo.xlsx";

    //Address destino = cabralzay@gmail.com;
    public void enviaMail(String destinatario, String asunto, String cuerpo) {

//        Properties props = System.getProperties();
//        props.put("mail.smtp.host", "smtp.gmail.com");  //El servidor SMTP de Google
//        props.put("mail.smtp.user", remitente);
//        props.put("mail.smtp.clave", clave);    //La clave de la cuenta
//        props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
//        props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
//        props.put("mail.smtp.port", "587"); //El puerto SMTP seguro de Google

        Properties propiedad = new Properties();
        propiedad.setProperty("mail.smtp.host", "smtp.gmail.com");
        propiedad.setProperty("mail.smtp.starttls.enable", "true");
        propiedad.setProperty("mail.smtp.port", "587");
        propiedad.setProperty("mail.smtp.auth", "true");

//        Session session = Session.getDefaultInstance(props);
//        MimeMessage message = new MimeMessage(session);
        Session sesion = Session.getDefaultInstance(propiedad);
        MimeMessage mail = new MimeMessage(sesion);

        try {

//            message.setFrom(new InternetAddress(remitente));
//            //message.addRecipient(Message.RecipientType.TO, destinatario);   //Se podrían añadir varios de la misma manera
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
//            message.setSubject(asunto);
//            message.setText(cuerpo);
//            Transport transport = session.getTransport("smtp");
//            transport.connect("smtp.gmail.com", remitente, "");
//            transport.sendMessage(message, message.getAllRecipients());
//            transport.close();



            mail.setFrom(new InternetAddress (remitente));
            mail.addRecipient(Message.RecipientType.TO, new InternetAddress(destinatario));
            mail.setSubject(asunto);
            mail.setText(cuerpo);
            
            
            Transport transporte = sesion.getTransport("smtp");
            transporte.connect(remitente,clave);
            transporte.sendMessage(mail, mail.getRecipients(Message.RecipientType.TO));
            transporte.close();
            
           // JOptionPane.showMessageDialog(null, "Correo enviado");

            System.out.println("Correio enviado com suceso");
        } catch (MessagingException me) {
            me.printStackTrace();   //Si se produce un error
        }

    }

    public void pruebaEnvio() {
        String destinatario = "cabralzay@gmail.com"; //A quien le quieres escribir.
        String asunto = "CORREIO PRUEBA DE Java 1";
        String cuerpo = "Esta es una prueba de correo...";

        enviaMail(destinatario, asunto, cuerpo);
    }

}
