package Pertemuan13;

public class SMSNotifier extends BaseNotifier {
    public SMSNotifier(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        logNotification(message);
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}

