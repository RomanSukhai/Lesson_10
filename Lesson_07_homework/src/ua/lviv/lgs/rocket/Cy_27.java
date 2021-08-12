package ua.lviv.lgs.rocket;

public class Cy_27 extends Plane implements CanPlaneTexnologiStelsable , CanPlaneTurboFastable,NuclearStrikeable{

    private int maxSpeed ;
    private String colorPlane;


    public Cy_27(double lenth, double width, double low, int maxSpeed, String colorPlane) {
        super(lenth, width, low);
        this.maxSpeed = maxSpeed;
        this.colorPlane = colorPlane;
    }

    public void texnologiStels() {
        int[] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 60) +20);
            System.out.println("Invisible regime: "+array[i]+" minute");
        }
    }

    public void turbofast() {
        int[] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +maxSpeed);
            System.out.println("Turbofast: "+array[i]+" km/hour");
        }
    }

    public void NuclearStrike() {
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 10) +1);
            System.out.println("Nuclear bomb: "+array[i]+" think");
        }
    }

    public void moveUp() {
        int [] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +1);
            System.out.println("Рух вверх: "+array[i]+" км");
        }
    }

    public void moveDown() {
        int [] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +1);
            System.out.println("Рух вниз: "+array[i]+" км");
        }
    }


    public void moveLeft() {
        int [] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +1);
            System.out.println("Рух вліво: "+array[i]+" км");
        }
    }

    public void moveRight() {
        int [] array = new int[1];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +1);
            System.out.println("Рух вправо: "+array[i]+" км");
        }
    }

    public String toString() {
        return "Cy_27 " +
                " Максимальна швидкість: ( " + maxSpeed +" )"+
                " Колір літака:  ( " + colorPlane +" ) \n\n"
                + super.toString();

    }
}
