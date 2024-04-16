package lez1;

public class Lez1 {
    public static void main(String[] args) {
        esempioLampadina();
    }

    private static void esempioLampadina() {
        var lampadina = new Lampadina();
        System.out.println(lampadina);

        lampadina.collega();
        System.out.println(lampadina);

        lampadina.scollega();
        System.out.println(lampadina);
    }
}
