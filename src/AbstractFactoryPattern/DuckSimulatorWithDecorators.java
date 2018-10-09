package AbstractFactoryPattern;

public class DuckSimulatorWithDecorators {
    public static void main(String[] args) {
        DuckSimulatorWithDecorators simulator = new DuckSimulatorWithDecorators();
        AbstractDuckFactory duckFactory = new DuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = new QuackCounter(new QuackEcho(duckFactory.createMallardDuck()));
        Quackable redheadDuck = new QuackCounter(new QuackEcho (duckFactory.createRedheadDuck()));
        Quackable duckCall = new QuackCounter (new QuackEcho (duckFactory.createDuckCall()));
        Quackable rubberDuck = new QuackCounter(new QuackEcho (duckFactory.createRubberDuck()));
        System.out.println("\nDuck Simulator:With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() +" times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
