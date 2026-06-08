package OOPS_Questions;

import java.util.Objects;

interface LibraryUser{
    void registerAccount(int age);
    void requestBook(String bookType);
}
class KidUsers implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(int age){
        if(age < 12){
            System.out.println("You have successfully registered under a Kids Account");
        }
        if(age >= 12){
            System.out.println("Sorry, Age must be less than 12 to register as a kid");
        }
    }
    public void requestBook(String bookType){
        if(Objects.equals(bookType, "Kids")){
            System.out.println("Book Issued successfully, please return the book within 10 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only kids books");
        }
    }
}
class AdultUser implements LibraryUser{
    int age;
    String bookType;
    public void registerAccount(int age){
        if(age > 12){
            System.out.println("You have successfully registered under an Adult Account");
        }
        if(age <= 12){
            System.out.println("Sorry, Age must be greater than 12 to register as an adult");
        }
    }
    public void requestBook(String bookType){
        if(Objects.equals(bookType, "Fiction")){
            System.out.println("Book Issued successfully, please return the book within 7 days");
        }
        else{
            System.out.println("Oops, you are allowed to take only adult Fiction books");
        }
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        KidUsers kid = new KidUsers();
        kid.registerAccount(5);
        kid.registerAccount(23);
        System.out.println();
        kid.requestBook("Kids");
        kid.requestBook("Fiction");
        System.out.println();

        AdultUser adult = new AdultUser();
        adult.registerAccount(5);
        adult.registerAccount(23);
        System.out.println();
        adult.requestBook("Kids");
        adult.requestBook("Fiction");
    }
}
