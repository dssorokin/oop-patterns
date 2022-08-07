package decorator;

public class DecoratorMain {
    public static void main(String[] args) {

        Beverage coffeeWithMilkAndSyrop = new MilkDecorator(
                new SyrupDecorator(
                        new Coffee()
                )
        );

        coffeeWithMilkAndSyrop.drink();
    }
}
