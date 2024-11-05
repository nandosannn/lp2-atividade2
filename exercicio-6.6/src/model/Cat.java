package model;

public class Cat extends Animal{

    public Cat(String nome){
        super(nome);
    }

    @Override
    public void greets() {
        System.out.println("Meow");
    }
}
