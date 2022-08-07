package decorator;

public class BeverageDecorator extends Beverage {

    private Beverage beverage;

    public Beverage getBeverage() {
        return this.beverage;
    }

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void drink() {
        this.beverage.drink();
    }
}
