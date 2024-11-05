import model.*;

public class App {
    public static void main(String[] args) throws Exception {
        Animal gatin = new Cat("Maria");

        gatin.greets();

        Dog dogin = new Dog("Joao");

        dogin.greets();
        
        Dog dogin2 = new Dog("Felipe");

        dogin.greets(dogin2);

        BigDog bigdog = new BigDog("Luan");

        bigdog.greets();

        bigdog.greets(dogin2);

        BigDog bigdog2 = new BigDog("Fifi");

        bigdog2.greets(bigdog2);
    }
}
