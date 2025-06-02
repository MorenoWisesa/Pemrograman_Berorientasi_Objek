package Pertemuan13;

public abstract class BaseNotifier implements Notifier {
    protected String recipient;

    public BaseNotifier(String recipient) {
        this.recipient = recipient;
    }

    public void logNotification(String message) {
        System.out.println("Log: Sending to " + recipient + " -> " + message);
    }

    public abstract void send(String message);
}

