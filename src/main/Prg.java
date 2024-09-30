package main;

public class Prg {

    public static void main(String[] args) {
        Prg prg = new Prg();
        int i = prg.fv();
    }

    private int fv() {
        System.out.println("Nem static fgv");
        return 1;
    }

}
