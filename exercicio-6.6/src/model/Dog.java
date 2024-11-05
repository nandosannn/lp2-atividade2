package model;

public class Dog extends Animal{
    
    public Dog(String nome){
        super(nome);
    }

    @Override
    public void greets() {
        System.out.println("Woof!");
    }

    public void greets(Dog another){
        System.out.println("Wooooooof!");
    }
}
