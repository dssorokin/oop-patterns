package abstractFactory;

public class LondonPizza extends Pizza{

    @Override
    public void deliver() {
        System.out.println("Pizza is delivered in London");
    }
}
