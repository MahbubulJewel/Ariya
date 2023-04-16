package practice;

public class MyClass {
    int a;
    int b;
    int c;
    int d;
    int e;

    public MyClass(){
        a = 10;
        b = 17;
        c = 20;
        d = 25;
        e = 30;
    }


    public static void main(String[] args){

        MyClass myObj = new MyClass();
        /*
        myObj.a = 10;
        myObj.b = 15;
        myObj.c = 20;
        myObj.d = 25;
        myObj.e = 30;
 */
        System.out.println("a = " + myObj.a);
        System.out.println("b = " + myObj.b);
        System.out.println("c = " + myObj.c);
        System.out.println("d = " + myObj.d);
        System.out.println("e = " + myObj.e);


    }

}
