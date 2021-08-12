package ua.lviv.lgs.rocket;

public class Main {
    public static void main(String[] args) {

        Cy_27 plane = new Cy_27(700,300,3000,678,"White");

        System.out.println(plane);
        System.out.println(" ");

        plane.onIngine();
        System.out.println(" ");
        plane.takeOff();
        System.out.println(" ");
        plane.moveDown();
        System.out.println(" ");
        plane.moveLeft();
        System.out.println(" ");
        plane.moveRight();
        System.out.println(" ");
        plane.moveUp();
        System.out.println(" ");

        plane.texnologiStels();
        System.out.println(" ");

        plane.NuclearStrike();
        System.out.println(" ");

        plane.turbofast();
        System.out.println(" ");

        plane.landing();
        System.out.println(" ");
    }
}
