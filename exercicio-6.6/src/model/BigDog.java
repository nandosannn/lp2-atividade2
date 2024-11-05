package model;

public class BigDog extends Dog{
    public BigDog(String nome){
        super(nome);
    }

    @Override
    public void greets() {
        System.out.println("Woow!");
    }

    @Override
    public void greets(Dog another){
        System.out.println("Woooooow!");
    }

    public void greets(BigDog another){
        System.out.println("Wooooooooooooow!");
    }
}
