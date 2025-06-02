package Pertemuan13;

public class NotificationSystem {
    public static void main(String[] args) {
        Notifier[] notifiers = new Notifier[] {
                new EmailNotifier("email@example.com"),
                new SMSNotifier("+628123456789"),
                new PushNotifier("user123")
        };

        for (Notifier notifier : notifiers) {
            notifier.send("Hello! This is your notification.");
        }
    }
}

