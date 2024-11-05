import model.Animal;
import model.Dog;

public class Main {
    public static void main(String[] args) throws Exception {
       Animal animal = new Dog();

       animal.eat();
       animal.bark();
    }
}
