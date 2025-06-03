package Pertemuan14.Tugas3;

public class TestCounter {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        new Counter();

        System.out.println("Total objek yang dibuat: " + Counter.getInstanceCount());
    }
}

