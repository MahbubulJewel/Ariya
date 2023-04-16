package QATEK;

public class ReverseString {

    public static void main(String[] args){

        String originalStr = " The quick brown fox";
        String reverseStr = "";

        for (int i = 0; i < originalStr.length(); i++){
            reverseStr = originalStr.charAt(i) + reverseStr;
        }

        System.out.println("Reverse string: "+ reverseStr);
    }
}
