package abstractFactory;

public class AbstractFactoryMain {

    public static void main(String[] args) {
        deliverSomePizza(new NYPizzaFactory());

        deliverSomePizza(new LondonPizzaFactory());
    }

    private static void deliverSomePizza(AbstractPizzaFactory pizzaFactory) {
        Pizza somePizza = pizzaFactory.createPizza();

        somePizza.deliver();
    }
}
