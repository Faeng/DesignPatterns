package AbstractFactoryPattern;
public class QuackEcho implements Quackable{
    Quackable duck;
    public QuackEcho(Quackable duck){
        this.duck = duck;
    }
    @Override
    public void quack() {
        duck.quack();
        System.out.print("Quack Echo: ");
        duck.quack();
    }
}
