package visitor;

import model.Body;
import model.Car;
import model.Engine;
import model.Wheel;

public final class CarElementDoVisitor implements CarElementVisitor {
    @Override
    public void visit(Body body) {
        System.out.println("Moving my " + body.colour() + " body");
    }

    @Override
    public void visit(Car car) {
        System.out.println("Starting my car");
    }

    @Override
    public void visit(Wheel wheel) {
        System.out.println("Kicking my " + wheel.position() + " wheel");
    }

    @Override
    public void visit(Engine engine) {
        System.out.println("Powering up my " + engine.power() + " engine");
    }
}
