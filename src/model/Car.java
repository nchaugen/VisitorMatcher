package model;

import visitor.CarElementVisitor;

import java.util.List;
import java.util.function.Consumer;

public final class Car implements CarElement {
    private final List<CarElement> elements;

    public Car() {
        this.elements = List.of(
            new Engine("electric"), new Wheel("front left"),
            new Wheel("front right"), new Wheel("back left"),
            new Wheel("back right"), new Body("white")
        );
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
        for (CarElement element : elements) {
            element.accept(visitor);
        }
    }

    @Override
    public void accept(Consumer<CarElement> f) {
        f.accept(this);
        for (CarElement element : elements) {
            element.accept(f);
        }
    }
}
