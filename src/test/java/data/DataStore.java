package data;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataStore {

    @DataProvider(name = "RealAprRates")
    public Object[][] storeRealAprRates(){
        return new Object[][]{
                {"200000", "15000", "3", "3.130%"},
        };
    }

    @Test(dataProvider = "MultipleColumnValues")
    public void run(String name, String state, int zipCode){
        System.out.println("Name is: " + name);
        System.out.println("State is: " + state);
        System.out.println("Zip Code is: " + zipCode);
    }
}
