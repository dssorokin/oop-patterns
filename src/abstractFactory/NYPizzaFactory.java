package abstractFactory;

public class NYPizzaFactory extends AbstractPizzaFactory{

    @Override
    public Pizza createPizza() {
        return new NYPizza();
    }
}
