package decorator;

public class SyrupDecorator extends BeverageDecorator{

    public SyrupDecorator(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("With tasty Syrop!");
    }
}
