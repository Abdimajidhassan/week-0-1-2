package week1;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class blooddoner {
    public static void main(String[] args) {
        System.out.println("what is your weight?");//need a user input
        double weight = doubleInput();//use double becouse its a numbers

        System.out.println("how old are you?");//user
        int age = intInput();//int due to it being low numbers

        if (weight >= 110 && age >= 17) {//need a if state ment for true or faulse
            System.out.println("you are elidable to be a blood doner");
        }else {
            System.out.println("you are not elidable to be a blood doner");
            if (weight <= 110) {
                System.out.println("you do not meet the requirements");
            }
            if (age < 17) {
                System.out.println("you are not old enough. you must be 17 or older");
            }
        }
    }


}
