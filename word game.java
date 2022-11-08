import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    Scanner emma=new Scanner(System.in);

    String name,age,city,college,profession,animal,petname;




    System.out.println("Enter your name");
    name = emma.nextLine();

    System.out.println("Enter your age");
     age = emma.nextLine();

     System.out.println("Enter the name of your city");
    city = emma.nextLine();

    System.out.println("Enter the name of the college you attended");
    college = emma.nextLine();

    System.out.println("Enter your profession");
    profession = emma.nextLine();

    System.out.println("Enter your type of animal");
    animal = emma.nextLine();

    System.out.println("Enter your pet name");
    petname = emma.nextLine();

    System.out.println("There once was a person named " + name + " who lived in  " + city + " . " +
    "At the age of " + age +  "," + name + " went to college at " + college + "." + name + " graduated and went to work as a " + profession
    + " . "  + " Then,  "  +  name + " adopted a (n) " + animal + " named " + petname + " . " + " They both lived happily, ever after! ");

    }
}