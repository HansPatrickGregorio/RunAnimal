import java.util.*;

public class RunAnimal{
    public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
    String input = s.nextLine();
    Bird b = new Bird();
    Cat c = new Cat();
    Dog d = new Dog();

        if(input.equalsIgnoreCase("B")){
                b.eat();
                b.sleep();
                b.makeSound();
        }
        else if(input.equalsIgnoreCase("C")){
                c.eat();
                c.sleep();
                c.makeSound();
        }
        else if(input.equalsIgnoreCase("D")){
                d.eat();
                d.sleep();
                d.makeSound();
        }
        else{
            System.out.println("Invalid input!");
        }
        s.close();
    }    
}