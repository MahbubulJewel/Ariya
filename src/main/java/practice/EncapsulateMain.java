package practice;

public class EncapsulateMain {
    public static void main(String[] args){

        EncapsulateExample obj = new EncapsulateExample();

        obj.setGeekName("Barack");
        obj.setGeekRoll(2);
        obj.setGeekAge(25);

        System.out.println("Name = " +obj.getGeekName());
        System.out.println("Roll = " +obj.getGeekRoll());
        System.out.println("Age = " +obj.getGeekAge());
    }
}
