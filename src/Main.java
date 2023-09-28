import model.Car;
import matcher.CarActions;
import visitor.CarElementDoVisitor;
import visitor.CarElementPrintVisitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("V I S I T I N G");
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());

        System.out.println();

        System.out.println("M A T C H I N G");
        car.accept(CarActions::print);
        car.accept(CarActions::start);
    }
}
