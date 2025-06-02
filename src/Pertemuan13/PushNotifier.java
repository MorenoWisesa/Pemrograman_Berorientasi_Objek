package Pertemuan13;

public class PushNotifier extends BaseNotifier {
    public PushNotifier(String recipient) {
        super(recipient);
    }

    @Override
    public void send(String message) {
        logNotification(message);
        System.out.println("Sending PUSH notification to " + recipient + ": " + message);
    }
}
