package practice;

public abstract class Car {

    double mpg;
    int numOfDoor;
    String bodyType;

    public void showMpg(){
        System.out.println("MPG = " + mpg);
    }

    public abstract void useElectricity();

}
