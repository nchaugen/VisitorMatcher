package model;

import visitor.CarElementVisitor;

import java.util.function.Consumer;

public sealed interface CarElement permits Body, Car, Engine, Wheel {
    void accept(CarElementVisitor visitor);

    default void accept(Consumer<CarElement> f) {
        f.accept(this);
    }
}
