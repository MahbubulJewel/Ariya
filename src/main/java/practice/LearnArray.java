package practice;

import java.util.Arrays;

public class LearnArray {
    public void StringArray() {

        String list1 = "Florida";
        String list2 = "California";
        String list3 = "Texas";
        String list4 = "New York";

        System.out.println(list2);

        String[] myList = {"Florida", "California", "Texas", "New York"};
        System.out.println(myList[1]);

        for (int i = 0; i < myList.length; i++) {
            System.out.println("State name is:" + myList[i]);
        }
    }
    public void sortArray() {
        String[] states = {"Florida", "California", "Georgia", "Texas"};

        Arrays.sort(states);
        System.out.println(Arrays.toString(states));

    }
}

