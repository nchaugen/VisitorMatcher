package visitor;

import model.Body;
import model.Car;
import model.Engine;
import model.Wheel;

public final class CarElementPrintVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Visiting " + body.colour() + " body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Visiting " + engine.power() + " engine");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Visiting " + wheel.position() + " wheel");
    }
}
