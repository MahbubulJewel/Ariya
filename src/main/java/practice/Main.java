package practice;

public class Main {

    public static void main(String[] args){

        MethodParameterExamples mepObject = new MethodParameterExamples();
        int numbers = mepObject.AddNumbers(20,50);
        System.out.println(numbers);

        Variables varObj = new Variables();
        varObj.intVariables();
        varObj.floatVariables();
        varObj.stringVariables();
        varObj.booleanVariables();
    }

}
