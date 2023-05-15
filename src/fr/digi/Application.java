package fr.digi;

public class Application {

    int number;
    public static void main(String[] args) {

        int nombre;
        nombre = 5;

        nombre = nombre + 1;

        byte b = 125;
        var c = b + 5;
        System.out.println("le nombre est "+ nombre);
    }

    private void maMethode() {

        int number = 10;
        System.out.println(number);
        System.out.println(this.number);
    }
}
