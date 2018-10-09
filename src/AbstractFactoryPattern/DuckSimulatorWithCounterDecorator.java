package AbstractFactoryPattern;
public class DuckSimulatorWithCounterDecorator {
    public static void main(String[] args) {
        DuckSimulatorWithCounterDecorator simulator = new DuckSimulatorWithCounterDecorator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        System.out.println("\nDuck Simulator:With Abstract Factory");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        System.out.println("The ducks quacked " + QuackCounter.getQuacks() +"times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}