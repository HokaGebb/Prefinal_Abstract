
import java.util.Scanner;

public class RunAnimal {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Choose an Animal = D for Dog, C for Cat, B for Bird: ");
    String Choice = input.nextLine();

    if (Choice.equalsIgnoreCase("D")){
        Dog doggy = new Dog();
        doggy.eat();
        doggy.sleep();
        doggy.makeSound();
    } else if (Choice.equalsIgnoreCase("C")) {
        Cat nyako = new Cat();
        nyako.eat();
        nyako.sleep();
        nyako.makeSound();
    } else if (Choice.equalsIgnoreCase("B")) {
        Bird tweet = new Bird();
        tweet.eat();
        tweet.sleep();
        tweet.makeSound();
    }else {
        System.out.println("Invalid Input");
        System.exit(0);
    }

    }
}