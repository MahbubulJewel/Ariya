package practice;

public class CarInterfaceImplementation implements CarInterface {

    public void setDoors() {
        System.out.println("Number of doors = 4");
    }

    public void setEngine() {
        System.out.println("Engine is set!!");
    }

    public void showMpg() {
        System.out.println("MPG = 42");
    }

    public static void main(String[] args) {
        CarInterfaceImplementation cii = new CarInterfaceImplementation();
        cii.setDoors();
        cii.setEngine();
        cii.showMpg();

    }
}
