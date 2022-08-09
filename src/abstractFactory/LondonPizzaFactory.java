package abstractFactory;

public class LondonPizzaFactory extends AbstractPizzaFactory{

    @Override
    public Pizza createPizza() {
        return new LondonPizza();
    }
}
