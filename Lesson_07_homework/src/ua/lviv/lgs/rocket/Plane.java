package ua.lviv.lgs.rocket;
public abstract class Plane  {

   private double lenth;
   private double width;
   private double low;

    public Plane(double lenth, double width, double low) {
        this.lenth = lenth;
        this.width = width;
        this.low = low;
    }

    int[] array = new int[1];
    void onIngine(){
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 60) +20);
            System.out.println("Час до запуску: "+array[i]+" хв");
        }
    }
    void takeOff(){
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 1000) +1);
            System.out.println("Кілометраж літака на паливі: "+array[i]+" km");
        }
    }
    void landing(){
        System.out.println("The plane is landing");
    }

    public String toString() {
        return "Plane:" +
                " Довжина: ( " + lenth +" ) \n" +
                " Ширина: ( " + width +" ) \n"+
                " Вага: ( " + low +" )"+" кг \n"
                ;
    }
}
