package kr.co.won.designpatternstudy._02_structural_patterns._10_facade._02_after;

import jakarta.mail.Message;
import jakarta.mail.MessagingException;
import jakarta.mail.Session;
import jakarta.mail.Transport;
import jakarta.mail.internet.InternetAddress;
import jakarta.mail.internet.MimeMessage;

import java.util.Properties;

public class EmailSender {
    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage message) {
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", emailSettings.getHost());

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage emailMessage = new MimeMessage(session);
            emailMessage.setFrom(new InternetAddress(message.getFrom()));
            emailMessage.addRecipient(Message.RecipientType.TO, new InternetAddress(message.getTo()));
            emailMessage.setSubject(message.getSubject());
            emailMessage.setText(message.getText());
            Transport.send(emailMessage);
        } catch (MessagingException exception) {
            exception.printStackTrace();
        }
    }
}
