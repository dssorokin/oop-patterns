package decorator;

public class MilkDecorator extends BeverageDecorator{

    public MilkDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("With tasty milk!");
    }
}
