package practice;

public class MountainBike extends Bicycle{

    public int seatHeight;

    public void setHeight(int newValue){
        seatHeight = newValue;
    }

    public String toString() {
        return ("No of gears are " + gear + ", Speed is " + speed + ", Seat Height is " + seatHeight);
    }
}
