package Pertemuan13;

public class EmailNotifier extends BaseNotifier {
    public EmailNotifier(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        logNotification(message);
        System.out.println("Sending EMAIL to " + recipient + ": " + message);
    }
}
