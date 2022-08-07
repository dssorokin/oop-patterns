package decorator;

public class LiqurDecorator extends BeverageDecorator{

    public LiqurDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("With tasty liqur!");
    }
}
