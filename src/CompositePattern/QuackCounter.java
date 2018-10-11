package CompositePattern;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter (Quackable duck) {
        this.duck = duck;
    }
    public void quack() {
        numberOfQuacks++;
        duck.quack();
    }
    public static int getQuacks() {
        return numberOfQuacks;
    }
}
