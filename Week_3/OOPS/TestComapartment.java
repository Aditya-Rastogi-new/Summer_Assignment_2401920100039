package OPPS_Questions_3;

import java.util.Random;

abstract class Compartment{
    public abstract String notice();
}
class FirstClass extends Compartment{
    public String notice(){
        return "First Class Compartment: Comfortable journey for premium passengers.";
    }
}
class Ladies extends Compartment{
    public String notice(){
        return "Ladies Compartment: Reserved for women passengers.";
    }
}
class General extends Compartment{
    public String notice(){
        return "General Compartment: Open for all passengers.";
    }
}
class Luggage extends Compartment{
    public String notice(){
        return "Luggage Compartment: For carrying goods and luggage.";
    }
}
public class TestCompartment {
    public static void main(String[] args) {
        String[] compartments = new String[10];
        Random random = new Random();

        for(int i = 0; i< compartments.length; i++){
            int choice = random.nextInt(4) + 1;
            switch(choice){
                case 1:
                    Compartment c1 = new FirstClass();
                    compartments[i] = c1.notice();
                    break;
                case 2:
                    Compartment c2 = new Ladies();
                    compartments[i] = c2.notice();
                    break;
                case 3:
                    Compartment c3 = new General();
                    compartments[i] = c3.notice();
                    break;
                case 4:
                    Compartment c4 = new Luggage();
                    compartments[i] = c4.notice();
                    break;
            }
        }
        System.out.println("Compartment Notice:");
        for (String c : compartments){
            System.out.println(c);
        }
    }
}
