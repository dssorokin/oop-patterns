package abstractFactory;

public class NYPizza extends Pizza{

    @Override
    public void deliver() {
        System.out.println("Pizza is delivered in NY");
    }
}
