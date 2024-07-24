/**
 * @author w.jumaa
 * @projectName EurekaJo
 * @classDescription
 */

package services;

import helper_classes.reading_helper.PropertiesHelpers;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.List;
import java.util.Properties;

public class EmailServices {
    public static void sendEmail(String emailBody) {
        // Sender's email address and password
        String senderEmail = PropertiesHelpers.getValue("senderEmail");
        String senderPassword = PropertiesHelpers.getValue("senderEmailPassword");
        List<String> recipientEmails = PropertiesHelpers.getListFromProperty("recipientEmailList");
        // Recipient's email address
        if (!(recipientEmails == null)) {
            // Set the host and properties for the mail session
            String host = "smtp.gmail.com";
            Properties properties = new Properties();
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
            properties.put("mail.smtp.auth", "true");
            properties.put("mail.smtp.starttls.enable", "true");
            properties.put("mail.smtp.host", host);
            properties.put("mail.smtp.port", "587");
//            properties.put("mail.debug", "true");
            // Create a Session instance
            javax.mail.Session session = Session.getDefaultInstance(properties, null);
            try {
                // Create a MimeMessage object
                MimeMessage message = new MimeMessage(session);
                // Set the sender and recipient addresses
                message.setFrom(new InternetAddress(senderEmail));
                //send email for 1 email only
                //send email to more than email
                for (String recipientEmail1 : recipientEmails) {
                    message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail1));
                }
                // Set the email subject and text
                message.setSubject(PropertiesHelpers.getValue("EmailSubject"));
                message.setText(emailBody);

                // Send the email
                Transport.send(message, senderEmail, senderPassword);
                System.out.println("Email sent successfully.");

            } catch (MessagingException e) {
                e.printStackTrace();
            }
        }
    }

}