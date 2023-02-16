package kr.co.won.designpatternstudy._02_structural_patterns._10_facade._02_after;

/**
 * 가독성 및 여러개의 class 에서 사용을 할 때는 유연해지는 장점이 있다.
 */
public class Client {

    public static void main(String[] args) {
        EmailSettings emailSettings = new EmailSettings();
        emailSettings.setHost("127.0.0.1");
        EmailMessage message = new EmailMessage();
        EmailSender sender = new EmailSender(emailSettings);

        message.setFrom("doukhee");
        message.setTo("tester");
        message.setSubject("testing Message");
        message.setText("testing email message tester");
        sender.sendEmail(message);
    }
}
