package be.intecbrussel;

public class Exercice {

    public void ageDrinking() {
        int age = 2;

        if (age > 18) {
            System.out.println("You are aan adult");
        } else if (age > 3) {
            System.out.println("You are aan adult");
        } else {
            System.out.println("You are a baby");

        }

    }

    public void secondExercise() {
        int a = 4;
        int b = 5;
        int c = 3;
        if (a > b && a > c) {
            System.out.println("a");
        } else if (b > a && b > c) {
            System.out.println("b");
        } else {
            System.out.println("c");
        }
    }

    public void thirdExercise() {
        int a = 12;
        if (a > 0) {
            System.out.println("pozitief");
        } else if (a < 0) {
            System.out.println("negatief");
        } else {
            System.out.println("notr");
        }
    }

    public void forthExercise() {
        int a = 5;

        if (a == 1) {
            System.out.println("maandag");
        } else if (a == 2) {
            System.out.println("dinsdag");
        } else if (a == 3) {
            System.out.println("woensdag");
        } else if (a == 4) {
            System.out.println("donderdag");
        } else if (a == 5) {
            System.out.println("vrijdag");
        } else if (a == 6) {
            System.out.println("zaterdag");
        } else if (a == 7) {
            System.out.println("zondag");


        } else {
            System.out.println("je kan gewoon tussen 1 en 7  schriven");

        }
    }
}
