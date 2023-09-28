package visitor;

import model.Body;
import model.Car;
import model.Engine;
import model.Wheel;

public interface CarElementVisitor {
    void visit(Body body);

    void visit(Car car);

    void visit(Engine engine);

    void visit(Wheel wheel);
}
